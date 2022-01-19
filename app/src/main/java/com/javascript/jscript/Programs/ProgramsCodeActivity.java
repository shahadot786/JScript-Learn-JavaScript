package com.javascript.jscript.Programs;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Activities.CodesActivity;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityProgramsCodeBinding;

import java.util.Objects;

import thereisnospon.codeview.CodeView;
import thereisnospon.codeview.CodeViewTheme;

public class ProgramsCodeActivity extends AppCompatActivity {
    ActivityProgramsCodeBinding binding;
    CodeView codeView, outCodeView;
    FirebaseDatabase database;
    FirebaseAuth auth;
    LayoutInflater inflater;
    TextView toastText;
    View toastLayout;
    Toast toast;
    private AdView bannerAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgramsCodeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //custom toast
        inflater = getLayoutInflater();
        toastLayout = inflater.inflate(R.layout.custom_toast_layout, findViewById(R.id.toastLayout));
        toastText = toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
        //firebase instance
        database = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();
        //ad request
        bannerAd = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAd.loadAd(adRequest);
        if (UiConfig.BANNER_AD_VISIBILITY) {
            bannerAd.setVisibility(View.VISIBLE);
        } else {
            bannerAd.setVisibility(View.GONE);
        }
        //toolbar
        setSupportActionBar(binding.toolbar2);
        ProgramsCodeActivity.this.setTitle("Details");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //code view for code
        codeView = findViewById(R.id.codeView);
        codeView.setTheme(CodeViewTheme.ATELIER_SAVANNA_DARK).fillColor();
        //code view for output
        outCodeView = findViewById(R.id.questionDes);
        outCodeView.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();

        loadCodes();
        loadOutputs();

        //progress value
        binding.finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.finish.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorSecondary)));
                binding.finish.setTextColor(getResources().getColor(R.color.textColorGrey));
                //send progress value
                database.getReference()
                        .child("Progress")
                        .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                        .child("programsCount")
                        .addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                int programsCount = 0;
                                if (snapshot.exists()) {
                                    programsCount = snapshot.getValue(Integer.class);
                                }
                                database.getReference()
                                        .child("Progress")
                                        .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                                        .child("programsCount")
                                        .setValue(programsCount + 1)
                                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                                            @Override
                                            public void onSuccess(@NonNull Void unused) {

                                            }
                                        });
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                finish();
            }
        });

    }//ends of onCreate
    //load code
    private void loadCodes() {
        String codes = null;
        switch (getIntent().getStringExtra("position")) {
            case "Display the current day and time":
                codes = ProgramsCodes.codes1;
                break;
            case "Find the area of a triangle":
                codes = ProgramsCodes.codes2;
                break;
            case "Given year is a leap year":
                codes = ProgramsCodes.codes3;
                break;
            case "Random integer between 1 to 10":
                codes = ProgramsCodes.codes4;
                break;
            case "Convert temperatures":
                codes = ProgramsCodes.codes5;
                break;
            case "Get the extension of a filename":
                codes = ProgramsCodes.codes6;
                break;
            case "Remove a character at the specified position":
                codes = ProgramsCodes.codes7;
                break;
            case "Find the largest of three given integers":
                codes = ProgramsCodes.codes8;
                break;
            case "Specified character exists":
                codes = ProgramsCodes.codes9;
                break;
            case "Reverse a given string":
                codes = ProgramsCodes.codes10;
                break;
            case "Capitalize the first letter":
                codes = ProgramsCodes.codes11;
                break;
            case "Convert a given number to hours and minutes":
                codes = ProgramsCodes.codes12;
                break;
            case "Convert the letters of a given string in alphabetical order":
                codes = ProgramsCodes.codes13;
                break;
            case "Concatenate two strings except their first character":
                codes = ProgramsCodes.codes14;
                break;
            case "Rotate the elements left of a given array of integers of length 3":
                codes = ProgramsCodes.codes15;
                break;
            case "Find the maximal difference between any two adjacent elements of a given array of integers":
                codes = ProgramsCodes.codes16;
                break;
            case "Find the shortest possible string":
                codes = ProgramsCodes.codes17;
                break;
            case "Create the dot products of two given 3D vectors":
                codes = ProgramsCodes.codes18;
                break;
            case "Sort an array of all prime numbers between 1 and a given integer":
                codes = ProgramsCodes.codes19;
                break;
            case "Calculate the sum of n + n/2 + n/4 + n/8 + .... where n is a positive integer and all divisions are integer":
                codes = ProgramsCodes.codes20;
                break;
            case "A given string represents a correct sentence or not":
                codes = ProgramsCodes.codes21;
                break;
            case "A matrix is a diagonal matrix or not":
                codes = ProgramsCodes.codes22;
                break;
            case "A point lies strictly inside a given circle":
                codes = ProgramsCodes.codes23;
                break;
            case "A given matrix is lower triangular or not":
                codes = ProgramsCodes.codes24;
                break;
            case "To create the value of NOR of two given booleans":
                codes = ProgramsCodes.codes25;
                break;
            case "Largest even number from an array of integers":
                codes = ProgramsCodes.codes26;
                break;
            case "Find the smallest prime number strictly greater than a given number":
                codes = ProgramsCodes.codes27;
                break;
            case "Find all distinct prime factors of a given integer":
                codes = ProgramsCodes.codes28;
                break;
            case "A given fraction is proper or not":
                codes = ProgramsCodes.codes29;
                break;
            case "A given absolute path for a file in Unix-style":
                codes = ProgramsCodes.codes30;
                break;
            case "Swap two halves of a given array of integers of even length":
                codes = ProgramsCodes.codes31;
                break;
            case "":
                codes = ProgramsCodes.codes;
                break;

        }
        codeView.showCode(codes);

    }

    //load output
    private void loadOutputs() {
        String outputs = null;
        switch (getIntent().getStringExtra("output")) {
            case "Display the current day and time":
                outputs = ProgramsOutputs.outputs1;
                break;
            case "Find the area of a triangle":
                outputs = ProgramsOutputs.outputs2;
                break;
            case "Given year is a leap year":
                outputs = ProgramsOutputs.outputs3;
                break;
            case "Random integer between 1 to 10":
                outputs = ProgramsOutputs.outputs4;
                break;
            case "Convert temperatures":
                outputs = ProgramsOutputs.outputs5;
                break;
            case "Get the extension of a filename":
                outputs = ProgramsOutputs.outputs6;
                break;
            case "Remove a character at the specified position":
                outputs = ProgramsOutputs.outputs7;
                break;
            case "Find the largest of three given integers":
                outputs = ProgramsOutputs.outputs8;
                break;
            case "Specified character exists":
                outputs = ProgramsOutputs.outputs9;
                break;
            case "Reverse a given string":
                outputs = ProgramsOutputs.outputs10;
                break;
            case "Capitalize the first letter":
                outputs = ProgramsOutputs.outputs11;
                break;
            case "Convert a given number to hours and minutes":
                outputs = ProgramsOutputs.outputs12;
                break;
            case "Convert the letters of a given string in alphabetical order":
                outputs = ProgramsOutputs.outputs13;
                break;
            case "Concatenate two strings except their first character":
                outputs = ProgramsOutputs.outputs14;
                break;
            case "Rotate the elements left of a given array of integers of length 3":
                outputs = ProgramsOutputs.outputs15;
                break;
            case "Find the maximal difference between any two adjacent elements of a given array of integers":
                outputs = ProgramsOutputs.outputs16;
                break;
            case "Find the shortest possible string":
                outputs = ProgramsOutputs.outputs17;
                break;
            case "Create the dot products of two given 3D vectors":
                outputs = ProgramsOutputs.outputs18;
                break;
            case "Sort an array of all prime numbers between 1 and a given integer":
                outputs = ProgramsOutputs.outputs19;
                break;
            case "Calculate the sum of n + n/2 + n/4 + n/8 + .... where n is a positive integer and all divisions are integer":
                outputs = ProgramsOutputs.outputs20;
                break;
            case "A given string represents a correct sentence or not":
                outputs = ProgramsOutputs.outputs21;
                break;
            case "A matrix is a diagonal matrix or not":
                outputs = ProgramsOutputs.outputs22;
                break;
            case "A point lies strictly inside a given circle":
                outputs = ProgramsOutputs.outputs23;
                break;
            case "A given matrix is lower triangular or not":
                outputs = ProgramsOutputs.outputs24;
                break;
            case "To create the value of NOR of two given booleans":
                outputs = ProgramsOutputs.outputs25;
                break;
            case "Largest even number from an array of integers":
                outputs = ProgramsOutputs.outputs26;
                break;
            case "Find the smallest prime number strictly greater than a given number":
                outputs = ProgramsOutputs.outputs27;
                break;
            case "Find all distinct prime factors of a given integer":
                outputs = ProgramsOutputs.outputs28;
                break;
            case "A given fraction is proper or not":
                outputs = ProgramsOutputs.outputs29;
                break;
            case "A given absolute path for a file in Unix-style":
                outputs = ProgramsOutputs.outputs30;
                break;
            case "Swap two halves of a given array of integers of even length":
                outputs = ProgramsOutputs.outputs31;
                break;
            case "":
                outputs = ProgramsOutputs.outputs;
                break;

        }
        outCodeView.showCode(outputs);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_codes, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.codes) {
            //network check
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(ProgramsCodeActivity.CONNECTIVITY_SERVICE);
            if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                    connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                //we are connected to a network
                startActivity(new Intent(ProgramsCodeActivity.this, CodesActivity.class));
            } else {
                toastText.setText(R.string.no_connection_text);
                toast.show();
            }

        } else {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}