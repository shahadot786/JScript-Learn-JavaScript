package com.javascript.jscript.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Model.DashboardModel;
import com.javascript.jscript.Model.ProfileModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.AddDiscussRvSampleBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.viewHolder> {

    ArrayList<DashboardModel> list;
    Context context;

    public DashboardAdapter(ArrayList<DashboardModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.add_discuss_rv_sample, parent, false);
        View proView = view.findViewById(R.id.proTextView);
        TextView proText = view.findViewById(R.id.proText2);
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            proView.setVisibility(View.GONE);
            proText.setVisibility(View.GONE);
        }else {
            proView.setVisibility(View.VISIBLE);
            proText.setVisibility(View.VISIBLE);
        }
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        DashboardModel model = list.get(position);
        holder.binding.question.setText(model.getQuestions());

        FirebaseDatabase.getInstance().getReference().child("UserImages")
                .child(model.getPostedBy()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                UserModel userModel = snapshot.getValue(UserModel.class);
                assert userModel != null;
                Picasso.get()
                        .load(userModel.getProfile())
                        .placeholder(R.drawable.ic_profile_default_image)
                        .into(holder.binding.profileImage);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        FirebaseDatabase.getInstance().getReference().child("UpdateProfile")
                .child(model.getPostedBy()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                ProfileModel profileModel = snapshot.getValue(ProfileModel.class);
                assert profileModel != null;
                holder.binding.userName.setText(profileModel.getUsername());
                holder.binding.profession.setText(profileModel.getProfession());
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
