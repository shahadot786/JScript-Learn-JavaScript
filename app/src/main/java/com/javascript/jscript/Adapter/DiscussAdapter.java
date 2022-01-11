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

import com.github.marlonlom.utilities.timeago.TimeAgo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Discuss.DiscussDetailsActivity;
import com.javascript.jscript.Model.DiscussModel;
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
        return new viewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        DiscussModel model = list.get(position);
        String time = TimeAgo.using(model.getPostedAt());
        String views = model.getPostViews() + "";
        String comments = model.getCommentCount() + "";
        String shares = model.getShareCount() + "";
        holder.binding.time.setText(time);
        holder.binding.question.setText(model.getQuestions());
        //1K and 1M views logic
        int view = Integer.parseInt(views);
        if (view >= 1000) {
            holder.binding.views.setText((view / 1000) + "." + ((view % 1000) / 100) + "K");
        } else {
            holder.binding.views.setText(views);
        }
        if (view >= 1000000) {
            holder.binding.views.setText((view / 1000000) + "." + ((view % 1000000) / 10000) + "M");
        }
        //1K and 1M comments logic
        int comment = Integer.parseInt(comments);
        if (comment >= 1000) {
            holder.binding.comment.setText((comment / 1000) + "." + ((comment % 1000) / 100) + "K");
        } else {
            holder.binding.comment.setText(comments);
        }
        if (comment >= 1000000) {
            holder.binding.comment.setText((comment / 1000000) + "." + ((comment % 1000000) / 10000) + "M");
        }
        //1K and 1M shares logic
        int share = Integer.parseInt(shares);
        if (share >= 1000) {
            holder.binding.share.setText((share / 1000) + "." + ((share % 1000) / 100) + "K");
        } else {
            holder.binding.share.setText(shares);
        }
        if (share >= 1000000) {
            holder.binding.share.setText((share / 1000000) + "." + ((share % 1000000) / 10000) + "M");
        }

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
                                //set value for discus details
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
                                        .addListenerForSingleValueEvent(new ValueEventListener() {
                                            @Override
                                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                                if (snapshot.exists()) {
                                                    holder.binding.views.setText(views);
                                                } else {
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
                                            }

                                            @Override
                                            public void onCancelled(@NonNull DatabaseError error) {

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
