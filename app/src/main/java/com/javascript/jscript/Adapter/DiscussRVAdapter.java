package com.javascript.jscript.Adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.marlonlom.utilities.timeago.TimeAgo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Model.AddDiscussModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.AddDiscussRvSampleBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DiscussRVAdapter extends RecyclerView.Adapter<DiscussRVAdapter.ViewHolder> {

    ArrayList<AddDiscussModel> list;
    Context context;

    public DiscussRVAdapter(ArrayList<AddDiscussModel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.add_discuss_rv_sample, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AddDiscussModel discussModel = list.get(position);
        String time = TimeAgo.using(discussModel.getPostAt());
        String question = discussModel.getQuestion();


        FirebaseDatabase.getInstance().getReference().child("UserData")
                .child(discussModel.getPostedBy()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                UserModel userModel = snapshot.getValue(UserModel.class);
                assert userModel != null;
                Picasso.get()
                        .load(userModel.getProfile())
                        .placeholder(R.drawable.ic_profile_default_image)
                        .into(holder.binding.profileImage);
                holder.binding.userName.setText(userModel.getUserName());
                holder.binding.time.setText(Html.fromHtml("<span style=\"font-weight:bold; color:#f44747\">" + time +"</span>"));
                holder.binding.question.setText(question);
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

    class ViewHolder extends RecyclerView.ViewHolder {
        AddDiscussRvSampleBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = AddDiscussRvSampleBinding.bind(itemView);
        }
    }

}
