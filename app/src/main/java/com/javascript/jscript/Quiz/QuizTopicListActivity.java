package com.javascript.jscript.Quiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.javascript.jscript.Interview.InterviewAnswerActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityQuizTopicListBinding;

import java.util.Objects;

public class QuizTopicListActivity extends AppCompatActivity {
    private AdNetwork adNetwork;
    ActivityQuizTopicListBinding binding;
    ListView quizList;
    String[] list = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuizTopicListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //ads
        adNetwork = new AdNetwork(QuizTopicListActivity.this);
        //toolbar
        setSupportActionBar(binding.toolbar2);
        QuizTopicListActivity.this.setTitle("Quiz Topics");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        loadItems();
        quizList = findViewById(R.id.quizTopicList);
        QuizTopicListActivity.CustomAdapter adapter = new QuizTopicListActivity.CustomAdapter();
        quizList.setAdapter(adapter);
        //load ad
        adNetwork.loadInterstitialAd();
        quizList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(QuizTopicListActivity.this, InterviewAnswerActivity.class);
                intent.putExtra("question",list[i]);
                intent.putExtra("answer",list[i]);
                startActivity(intent);
                adNetwork.showInterstitialAd();
            }
        });


    }
    private void loadItems() {
        final String basic[] = {
                "Questions",
                "Questions 1",
                "Questions 2",
                "Questions 3",
                "Questions 4",
                "Questions 5",
                "Questions 6",
                "Questions 7"

        };

        final String advanced[] = {
                "Questions Advanced",
                "Questions Advanced 1",
                "Questions Advanced 2",
                "Questions Advanced 3",
                "Questions Advanced 4",
                "Questions Advanced 5",
                "Questions Advanced 6",
                "Questions Advanced 7"
        };

        final String expert[] = {
                "Questions Expert",
                "Questions Expert 1",
                "Questions Expert 2",
                "Questions Expert 3",
                "Questions Expert 4",
                "Questions Expert 5",
                "Questions Expert 6",
                "Questions Expert 7"
        };

        final String angular[] = {
                "Questions Angular",
                "Questions Angular 1",
                "Questions Angular 2",
                "Questions Angular 3",
                "Questions Angular 4",
                "Questions Angular 5",
                "Questions Angular 6",
                "Questions Angular 7"
        };

        String programsItems = getIntent().getStringExtra("quizItems");
        switch (programsItems){
            case "Basic":
                list = basic;
                break;
            case "Advanced":
                list = advanced;
                break;
            case "Expert":
                list = expert;
                break;
            case "Angular":
                list = angular;
                break;
        }
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return list.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @SuppressLint("ViewHolder")
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.programs_list_items_layout,null);
            TextView textView = view.findViewById(R.id.itemsTitle);
            textView.setText(list[i]);

            return view;
        }
    }

    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}