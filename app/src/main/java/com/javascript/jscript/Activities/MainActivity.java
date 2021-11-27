package com.javascript.jscript.Activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.javascript.jscript.Fragment.ProgramsFragment;
import com.javascript.jscript.Fragment.QuizFragment;
import com.javascript.jscript.Fragment.LearnFragment;
import com.javascript.jscript.Fragment.ProFragment;
import com.javascript.jscript.Fragment.ProfileFragment;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityMainBinding;

import me.ibrahimsn.lib.OnItemSelectedListener;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //by default fragment code
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, new LearnFragment());
        transaction.commit();

        //bottom bar fragment listener
        binding.bottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {
                //fragment replace
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                //fragment replace switch case code
                switch (i){
                    case 0:
                        transaction.replace(R.id.container, new LearnFragment());
                        break;
                    case 1:
                        transaction.replace(R.id.container, new QuizFragment());
                        break;
                    case 2:
                        transaction.replace(R.id.container, new ProgramsFragment());
                        break;
                    case 3:
                        transaction.replace(R.id.container, new ProfileFragment());
                        break;
                    case 4:
                        transaction.replace(R.id.container, new ProFragment());
                        break;
                }
                transaction.commit();
                return false;
            }
        });



    }
}