package com.javascript.jscript.Programs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityProgramsCodeBinding;

import java.util.Objects;

import thereisnospon.codeview.CodeView;
import thereisnospon.codeview.CodeViewTheme;

public class ProgramsCodeActivity extends AppCompatActivity {
    ActivityProgramsCodeBinding binding;
    CodeView codeView,outCodeView;
    private AdView bannerAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgramsCodeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //ad request
        bannerAd = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAd.loadAd(adRequest);
        if (UiConfig.BANNER_AD_VISIBILITY){
            bannerAd.setVisibility(View.VISIBLE);
        }else {
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
        outCodeView = findViewById(R.id.learnCodeView);
        outCodeView.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();

        loadCodes();
        loadOutputs();
    }
    //load code
    private void loadCodes() {
        String code = null;
        switch (getIntent().getStringExtra("position")){
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
        switch (getIntent().getStringExtra("output")){
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
    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

}