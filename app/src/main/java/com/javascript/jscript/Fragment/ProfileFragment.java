package com.javascript.jscript.Fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.javascript.jscript.Activities.SignInActivity;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.FragmentProfileBinding;
import com.squareup.picasso.Picasso;

import java.util.Objects;

public class ProfileFragment extends Fragment {

    FragmentProfileBinding binding;
    FirebaseAuth auth;
    FirebaseStorage storage;
    FirebaseDatabase database;
    ProgressDialog dialog;
    CardView cardView;
    RelativeLayout expandableInfo;
    ImageView arrow;


    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        auth = FirebaseAuth.getInstance();
        storage = FirebaseStorage.getInstance();
        database = FirebaseDatabase.getInstance();
        dialog = new ProgressDialog(getContext(),ProgressDialog.THEME_DEVICE_DEFAULT_DARK);


    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater,container,false);

        binding.expandableView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expandableInfo = getActivity().findViewById(R.id.expandableInfo);
                cardView = getActivity().findViewById(R.id.expandableView);
                arrow = getActivity().findViewById(R.id.arrowImage);
                if (expandableInfo.getVisibility() == View.GONE){
                    TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
                    expandableInfo.setVisibility(View.VISIBLE);

                }else{
                    TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
                    expandableInfo.setVisibility(View.GONE);
                }
            }
        });

        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setTitle("Image Uploading");
        dialog.setMessage("Please Wait...");
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);

        /*check if user is sign in or sign out*/
        FirebaseUser currentUser = auth.getCurrentUser();
        if (currentUser == null){
            Intent intent = new Intent(getActivity(), SignInActivity.class);
            startActivity(intent);
        }else{
            database.getReference().child("Users").child(Objects.requireNonNull(auth.getUid()))
                    .addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()){
                                UserModel user = snapshot.getValue(UserModel.class);
                                assert user != null;
                                Picasso.get()
                                        .load(user.getCoverPhoto())
                                        .placeholder(R.drawable.ic_placeholder_dark)
                                        .into(binding.coverPhoto);
                                Picasso.get()
                                        .load(user.getProfile())
                                        .placeholder(R.drawable.ic_profile_default_image)
                                        .into(binding.profileImage);
                                binding.userName.setText(user.getUserName());
                                binding.email.setText(user.getEmail());
                                binding.password.setText(user.getPassword());
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
        }

        binding.uploadCoverImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent,11);

            }
        });

        binding.profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent,22);
            }
        });


        return binding.getRoot();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode ==11){
            assert data != null;
            if (data.getData()!= null){
                Uri uri = data.getData();
                binding.coverPhoto.setImageURI(uri);
                dialog.show();
                final StorageReference reference = storage.getReference().child("cover_photo")
                        .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()));
                reference.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(@NonNull UploadTask.TaskSnapshot taskSnapshot) {
                        dialog.dismiss();
                        Toast.makeText(getContext(), "Upload Successfully", Toast.LENGTH_SHORT).show();
                        reference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(@NonNull Uri uri) {
                                database.getReference().child("Users").child(Objects.requireNonNull(auth.getUid())).child("coverPhoto")
                                        .setValue(uri.toString());
                            }
                        });
                    }
                });
            }
        }
        else if (requestCode == 22){
            assert data != null;
            if (data.getData()!= null){
                Uri uri = data.getData();
                binding.profileImage.setImageURI(uri);
                dialog.show();
                final StorageReference reference = storage.getReference().child("profile_image")
                        .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()));
                reference.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(@NonNull UploadTask.TaskSnapshot taskSnapshot) {
                        dialog.dismiss();
                        Toast.makeText(getContext(), "Upload Successfully", Toast.LENGTH_SHORT).show();
                        reference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(@NonNull Uri uri) {
                                database.getReference().child("Users").child(Objects.requireNonNull(auth.getUid())).child("profile")
                                        .setValue(uri.toString());
                            }
                        });
                    }
                });
            }
        }else {
            Toast.makeText(getContext(), "Wrong Image Upload", Toast.LENGTH_SHORT).show();
        }
    }
}