package com.javascript.jscript.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.javascript.jscript.Adapter.ProgramsItemsAdapter;
import com.javascript.jscript.Programs.ProgramsItemsListActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.Tools.ExpandableHeightGridView;

public class ProgramsFragment extends Fragment {

    ExpandableHeightGridView gridView;

    String[] itemsName = {"Basic","Advanced","Expert","Basic","Advanced","Expert","Basic","Advanced","Expert","Basic","Advanced","Expert"};

    Integer[] itemImages = {
            R.drawable.ic_programs_basic_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image

    };
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

        ProgramsItemsAdapter adapter = new ProgramsItemsAdapter(itemsName,itemImages,getActivity());
        gridView.setAdapter(adapter);

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

        // Inflate the layout for this fragment
        return view;
    }
}