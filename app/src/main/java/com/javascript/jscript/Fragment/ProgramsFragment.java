package com.javascript.jscript.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.javascript.jscript.Adapter.ProgramsItemsAdapter;
import com.javascript.jscript.R;
import com.javascript.jscript.Tools.ExpandableHeightGridView;

public class ProgramsFragment extends Fragment {
    ExpandableHeightGridView gridView;
    String[] itemsName = {"Basic","Advanced","Expert","Typescript","Vue Js","React","Angular Js","Ember Js","Elm","Express Js","Node Js","Jquery","Bootstrap","Laravel","Deno"};

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

        gridView = view.findViewById(R.id.programs_item_gridview);
        gridView.setExpanded(true);

        ProgramsItemsAdapter adapter = new ProgramsItemsAdapter(itemsName,getActivity());
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), itemsName[i], Toast.LENGTH_SHORT).show();
            }
        });








        // Inflate the layout for this fragment
        return view;
    }
}