package com.javascript.jscript.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Discuss.AddDiscussActivity;
import com.javascript.jscript.R;
public class DiscussFragment extends Fragment {


    public DiscussFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_discuss, container, false);
        setHasOptionsMenu(true);
        //pro status
        View proView2 = view.findViewById(R.id.proTextView);
        TextView proText2 = view.findViewById(R.id.proText2);
        //conditions
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW){
            proView2.setVisibility(View.GONE);
            proText2.setVisibility(View.GONE);
        }else {
            proView2.setVisibility(View.VISIBLE);
            proText2.setVisibility(View.VISIBLE);
        }
        //text input click
        View discuss_view = view.findViewById(R.id.discuss_view);
        discuss_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), AddDiscussActivity.class));
            }
        });




        return view;
    }

    //on create option menu

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        MenuItem menuItem = menu.findItem(R.id.settings);
        menuItem.setVisible(false);
        inflater.inflate(R.menu.menu_discuss,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}