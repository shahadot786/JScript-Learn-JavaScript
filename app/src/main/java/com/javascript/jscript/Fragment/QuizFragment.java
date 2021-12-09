package com.javascript.jscript.Fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.javascript.jscript.Quiz.DashboardActivity;
import com.javascript.jscript.R;

public class QuizFragment extends Fragment {

    TextView dashboard,howTo;
    public QuizFragment() {
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
        View view = inflater.inflate(R.layout.fragment_quiz,container,false);
        //find id
        dashboard = view.findViewById(R.id.dashboard);
        howTo = view.findViewById(R.id.howTo);
        //on click listener
        //how to
        howTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity(), R.style.AppCompatAlertDialogStyle);
                dialog.setCancelable(false);
                dialog.setTitle("How to use?");
                dialog.setMessage("1. Every quiz subjects has different types of quiz.\n2. Every types of quiz has a 10 different questions.\n3. User can add quiz.");
                dialog.setPositiveButton(R.string.dialog_ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                dialog.show();
            }
        });
        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), DashboardActivity.class));
            }
        });


        return view;
    }
}