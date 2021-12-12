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
                Intent intent = new Intent(QuizTopicListActivity.this, QuizDetailsActivity.class);
                intent.putExtra("question",list[i]);
                startActivity(intent);
                adNetwork.showInterstitialAd();
            }
        });


    }
    private void loadItems() {
        final String basic[] = {
                "Quiz",
                "Quiz 1",
                "Quiz 2",
                "Quiz 3",
                "Quiz 4",
                "Quiz 5",
                "Quiz 6",
                "Quiz 7"

        };

        final String advanced[] = {
                "Quiz Advanced",
                "Quiz Advanced 1",
                "Quiz Advanced 2",
                "Quiz Advanced 3",
                "Quiz Advanced 4",
                "Quiz Advanced 5",
                "Quiz Advanced 6",
                "Quiz Advanced 7"
        };

        final String expert[] = {
                "Quiz Expert",
                "Quiz Expert 1",
                "Quiz Expert 2",
                "Quiz Expert 3",
                "Quiz Expert 4",
                "Quiz Expert 5",
                "Quiz Expert 6",
                "Quiz Expert 7"
        };

        final String angular[] = {
                "Quiz Angular",
                "Quiz Angular 1",
                "Quiz Angular 2",
                "Quiz Angular 3",
                "Quiz Angular 4",
                "Quiz Angular 5",
                "Quiz Angular 6",
                "Quiz Angular 7"
        };

        String quizItems = getIntent().getStringExtra("quizItems");
        switch (quizItems){
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