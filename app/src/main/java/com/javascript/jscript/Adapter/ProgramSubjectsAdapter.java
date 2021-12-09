package com.javascript.jscript.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.javascript.jscript.Model.AddProgramsModel;
import com.javascript.jscript.R;

import java.util.ArrayList;
import java.util.Objects;

public class ProgramSubjectsAdapter extends BaseAdapter{

    ArrayList<AddProgramsModel> list;
    Context context;
    FirebaseAuth auth;
    FirebaseDatabase database;

    public ProgramSubjectsAdapter(ArrayList<AddProgramsModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        database = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();
        View gridView = view;
        LayoutInflater inflater;

        if (view == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.programs_items_grid_layout,null);
        }
        TextView items = gridView.findViewById(R.id.programs_items);


        database.getReference().child("Programs").child(Objects.requireNonNull(auth.getUid()))
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()){
                            AddProgramsModel subjects = new AddProgramsModel();
                            items.setText(subjects.getSubject());
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });



        return null;
    }
}

   /* @Override
    public int getCount() {
        return itemName.length;
    }

    @Override
    public Object getItem(int i) {
        return itemName[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View gridView = view;
        LayoutInflater inflater;
        if (view == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.programs_items_grid_layout,null);
        }

        TextView items = gridView.findViewById(R.id.programs_items);
        items.setText(itemName[i]);

        ImageView imageItems = gridView.findViewById(R.id.itemsImages);
        imageItems.setImageResource(itemsImages[i]);

        return gridView;
    }*/
