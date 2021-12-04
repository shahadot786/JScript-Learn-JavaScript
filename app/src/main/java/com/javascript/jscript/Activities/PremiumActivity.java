package com.javascript.jscript.Activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityPremiumBinding;

public class PremiumActivity extends AppCompatActivity {

    ActivityPremiumBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPremiumBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //pro cancel button
        binding.proCancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PremiumActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        //privacy
        binding.privacyPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_play_privacy_policy))));
            }
        });
        //refund policy
        binding.refundPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(PremiumActivity.this, R.style.AppCompatAlertDialogStyle);
                dialog.setTitle(R.string.refund_policy);
                dialog.setMessage(R.string.refund_message);
                dialog.setPositiveButton(R.string.dialog_ok, (dialogInterface, i) -> finishActivity(11));
                dialog.show();
            }
        });



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(PremiumActivity.this,MainActivity.class);
        startActivity(intent);
    }
}