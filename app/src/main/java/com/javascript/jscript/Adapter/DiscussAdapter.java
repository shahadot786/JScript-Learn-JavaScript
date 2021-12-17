package com.javascript.jscript.Adapter;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.github.marlonlom.utilities.timeago.TimeAgo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Discuss.DiscussDetailsActivity;
import com.javascript.jscript.Model.DiscussModel;
import com.javascript.jscript.Model.ProfileModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.AddDiscussRvSampleBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Objects;

public class DiscussAdapter extends RecyclerView.Adapter<DiscussAdapter.viewHolder> {

    ArrayList<DiscussModel> list;
    ArrayList<DiscussModel> listAll;
    Context context;

    public DiscussAdapter(ArrayList<DiscussModel> list, Context context) {
        this.list = list;
        this.listAll = new ArrayList<>(list);
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.add_discuss_rv_sample, parent, false);
        //pro status
        /*ImageView proBadge = view.findViewById(R.id.proBadge);
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW){
            proBadge.setVisibility(View.GONE);
        }else {
            proBadge.setVisibility(View.VISIBLE);
        }*/
        return new viewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        DiscussModel model = list.get(position);
        String time = TimeAgo.using(model.getPostedAt());
        holder.binding.time.setText(time);
        holder.binding.question.setText(model.getQuestions());
        holder.binding.views.setText(model.getPostViews() + "");
        holder.binding.comment.setText(model.getCommentCount() + "");
        holder.binding.share.setText(model.getShareCount() + "");

        //fetch user name and profile
        FirebaseDatabase.getInstance().getReference().child("UserData").child(model.getPostedBy())
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            UserModel user = snapshot.getValue(UserModel.class);
                            assert user != null;
                            Picasso.get()
                                    .load(user.getProfile())
                                    .placeholder(R.drawable.ic_profile_default_image)
                                    .into(holder.binding.profileImage);
                            holder.binding.userName.setText(user.getUserName());
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
        //fetch profession
        FirebaseDatabase.getInstance().getReference().child("UpdateProfile")
                .child(model.getPostedBy()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                ProfileModel profileModel = snapshot.getValue(ProfileModel.class);
                assert profileModel != null;
                holder.binding.profession.setText(profileModel.getProfession());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        //check multiple views
        FirebaseDatabase.getInstance().getReference()
                .child("Discuss")
                .child(model.getPostId())
                .child("views")
                .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        //post watch code
                        holder.binding.discussRVSample.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                //goto topics details
                                Intent intent = new Intent(context.getApplicationContext(), DiscussDetailsActivity.class);
                                intent.putExtra("postId", model.getPostId());
                                intent.putExtra("postedBy", model.getPostedBy());
                                intent.addFlags(FLAG_ACTIVITY_NEW_TASK);
                                context.getApplicationContext().startActivity(intent);

                                //fetch firebase database
                                FirebaseDatabase.getInstance().getReference()
                                        .child("Discuss")
                                        .child(model.getPostId())
                                        .child("views")
                                        .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                                        .setValue(true).addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(@NonNull Void unused) {
                                        FirebaseDatabase.getInstance().getReference()
                                                .child("Discuss")
                                                .child(model.getPostId())
                                                .child("postViews")
                                                .setValue(model.getPostViews() + 1)
                                                .addOnSuccessListener(new OnSuccessListener<Void>() {
                                                    @Override
                                                    public void onSuccess(@NonNull Void unused) {

                                                    }
                                                });
                                    }
                                });


                            }
                        });
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        AddDiscussRvSampleBinding binding;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = AddDiscussRvSampleBinding.bind(itemView);

        }
    }

}
