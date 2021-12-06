package com.javascript.jscript.Programs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityProgramsCodeBinding;

import java.util.Objects;

import thereisnospon.codeview.CodeView;
import thereisnospon.codeview.CodeViewTheme;

public class ProgramsCodeActivity extends AppCompatActivity {
    ActivityProgramsCodeBinding binding;
    CodeView codeView,outCodeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgramsCodeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //toolbar
        setSupportActionBar(binding.toolbar2);
        ProgramsCodeActivity.this.setTitle("Details");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //code view for code
        codeView = findViewById(R.id.codeView);
        codeView.setTheme(CodeViewTheme.ATELIER_LAKESIDE_DARK).fillColor();
        //code view for output
        outCodeView = findViewById(R.id.OutputCodeView);
        outCodeView.setTheme(CodeViewTheme.ATELIER_LAKESIDE_DARK).fillColor();

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