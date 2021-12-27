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
import android.view.ViewGroup;
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
import com.javascript.jscript.Activities.EditProfileActivity;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Interview.InterviewAnswerActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityProgramsCodeBinding;

import java.util.Objects;

import thereisnospon.codeview.CodeView;
import thereisnospon.codeview.CodeViewTheme;

public class ProgramsCodeActivity extends AppCompatActivity {
    ActivityProgramsCodeBinding binding;
    CodeView codeView, outCodeView;
    private AdView bannerAd;
    FirebaseDatabase database;
    FirebaseAuth auth;
    private boolean connected = false;
    LayoutInflater inflater;
    TextView toastText;
    View toastLayout;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgramsCodeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //custom toast
        inflater = getLayoutInflater();
        toastLayout = inflater.inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.toastLayout));
        toastText = (TextView) toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM,0,100);
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
        String code = null;
        switch (getIntent().getStringExtra("position")) {
            case "Basic":
                code = BasicProgramsCodes.basic;
                break;
            case "Basic1":
                code = BasicProgramsCodes.basic1;
                break;
            case "Basic2":
                code = BasicProgramsCodes.basic2;
                break;
            case "advanced":
                code = BasicProgramsCodes.advanced;
                break;
            case "advanced2":
                code = BasicProgramsCodes.advanced2;
                break;
            case "expert":
            case "angular":
                code = BasicProgramsCodes.expert;
                break;

        }
        codeView.showCode(code);

    }

    //load output
    private void loadOutputs() {
        String output = null;
        switch (getIntent().getStringExtra("output")) {
            case "Basic":
                output = BasicProgramsCodes.basicOutput1;
                break;
            case "Basic2":
                output = BasicProgramsCodes.basicOutput2;
                break;
            case "advanced2":
                output = BasicProgramsCodes.advanced2;
                break;
            case "expert":
            case "angular":
                output = BasicProgramsCodes.expert;
                break;
        }
        outCodeView.showCode(output);

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
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(EditProfileActivity.CONNECTIVITY_SERVICE);
            if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                    connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                //we are connected to a network
                connected = true;
                startActivity(new Intent(ProgramsCodeActivity.this, CodesActivity.class));
            }else {
                toastText.setText(R.string.no_connection_text);
                toast.show();
                connected = false;
            }

        }else {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}