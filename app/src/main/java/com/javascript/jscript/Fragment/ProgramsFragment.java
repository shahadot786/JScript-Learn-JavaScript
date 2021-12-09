package com.javascript.jscript.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Adapter.ProgramsItemsAdapter;
import com.javascript.jscript.Model.AddProgramsModel;
import com.javascript.jscript.Programs.AddProgramsActivity;
import com.javascript.jscript.Programs.ProgramsItemsListActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.Tools.ExpandableHeightGridView;

public class ProgramsFragment extends Fragment {

    ExpandableHeightGridView gridView;

    String[] itemsName = {};
    FirebaseDatabase database;
    FirebaseAuth auth;

    public ProgramsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_programs,container,false);

        database = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();

        TextView addPrograms = (TextView) view.findViewById(R.id.addPrograms);
        gridView = view.findViewById(R.id.programs_item_gridview);
        gridView.setExpanded(true);
        ProgramsItemsAdapter adapter = new ProgramsItemsAdapter(itemsName,getActivity());
        gridView.setAdapter(adapter);

        database.getReference().child("Programs").child(auth.getUid())
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()){
                            AddProgramsModel programsModel = new AddProgramsModel();

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), ProgramsItemsListActivity.class);
                switch (i){
                    case 0:
                        intent.putExtra("programsItems","Basic");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("programsItems","Advanced");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("programsItems","Expert");
                        startActivity(intent);
                        break;

                }
            }
        });


        //addPrograms click listener
        addPrograms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), AddProgramsActivity.class));
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}