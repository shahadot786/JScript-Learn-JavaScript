package com.javascript.jscript.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.marlonlom.utilities.timeago.TimeAgo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Activities.UserProfileActivity;
import com.javascript.jscript.Model.CommentModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.CommentsRvSampleBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Objects;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.viewHolder> {

    Context context;
    ArrayList<CommentModel> list;

    public CommentAdapter(Context context, ArrayList<CommentModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.comments_rv_sample, parent, false);
        return new viewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        CommentModel comment = list.get(position);
        String time = TimeAgo.using(comment.getCommentAt());
        String commentLikes = comment.getCountLikes() + "";
        holder.binding.commentedText.setText(comment.getCommentBody());
        holder.binding.time.setText(time);
        String commentedBy = comment.getCommentedBy();
        //if likes are empty
        if (commentLikes.equals("0")) {
            holder.binding.likesCount.setText("");
        } else {
            //1K and 1M views logic
            int Likes = Integer.parseInt(commentLikes);
            if (Likes >= 1000) {
                holder.binding.likesCount.setText((Likes / 1000) + "." + ((Likes % 1000) / 100));
            } else {
                holder.binding.likesCount.setText(commentLikes);
            }
            if (Likes >= 1000000) {
                holder.binding.likesCount.setText((Likes / 1000000) + "." + ((Likes % 1000000) / 10000));
            }
        }
        //get user data
        FirebaseDatabase.getInstance().getReference()
                .child("UserData")
                .child(comment.getCommentedBy()).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                UserModel userModel = snapshot.getValue(UserModel.class);
                assert userModel != null;
                Picasso.get()
                        .load(userModel.getProfile())
                        .placeholder(R.drawable.ic_profile_default_image)
                        .into(holder.binding.profileImage);
                holder.binding.userName.setText(userModel.getUserName());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        holder.binding.commentedProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, UserProfileActivity.class);
                intent.putExtra("postedBy",commentedBy);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.getApplicationContext().startActivity(intent);
            }
        });
        //check likes exist
        FirebaseDatabase.getInstance().getReference()
                .child("Discuss")
                .child(comment.getPostID())
                .child("comments")
                .child(comment.getCommentID())
                .child("commentLikes")
                .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            holder.binding.likes.setImageResource(R.drawable.ic_like_icon_green);
                        } else {
                            //set likes value
                            holder.binding.likes.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    //set database value
                                    FirebaseDatabase.getInstance().getReference()
                                            .child("Discuss")
                                            .child(comment.getPostID())
                                            .child("comments")
                                            .child(comment.getCommentID())
                                            .child("commentLikes")
                                            .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                                            .setValue(true).addOnSuccessListener(new OnSuccessListener<Void>() {
                                        @Override
                                        public void onSuccess(Void unused) {
                                            FirebaseDatabase.getInstance().getReference()
                                                    .child("Discuss")
                                                    .child(comment.getPostID())
                                                    .child("comments")
                                                    .child(comment.getCommentID())
                                                    .child("countLikes")
                                                    .setValue(comment.getCountLikes() + 1)
                                                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                                                        @Override
                                                        public void onSuccess(Void unused) {
                                                            holder.binding.likes.setImageResource(R.drawable.ic_like_icon_green);
                                                            holder.binding.likesLoves.setVisibility(View.VISIBLE);
                                                        }
                                                    });
                                        }
                                    });
                                }
                            });
                        }
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
        CommentsRvSampleBinding binding;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = CommentsRvSampleBinding.bind(itemView);
        }
    }

}
