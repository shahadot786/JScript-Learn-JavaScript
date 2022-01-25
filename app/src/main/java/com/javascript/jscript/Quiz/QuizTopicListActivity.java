package com.javascript.jscript.Quiz;

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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityQuizTopicListBinding;

import java.util.Objects;

public class QuizTopicListActivity extends AppCompatActivity {
    ActivityQuizTopicListBinding binding;
    ListView quizList;
    String[] list = {};
    private AdNetwork adNetwork;

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
                intent.putExtra("question", list[i]);
                startActivity(intent);
                adNetwork.showInterstitialAd();
            }
        });


    }

    private void loadItems() {
        final String[] Fundamental = {
                "Fundamental Quiz 1",

        };
        final String[] Basic = {
                "",

        };
        final String[] Objects = {
                "",

        };
        final String[] OOPs = {
                "",

        };
        final String[] DOM = {
                "",

        };
        final String[] BOM = {
                "",

        };
        final String[] Advanced = {
                "",

        };
        final String[] AJAX = {
                "",

        };
        final String[] Typescript = {
                "",

        };
        //pro content
        final String[] Angular = {
                "",

        };
        final String[] VueJs = {
                "",

        };
        final String[] NextJs = {
                "",

        };
        final String[] ReactJs = {
                "",

        };
        final String[] EmberJs = {
                "",

        };
        final String[] Bootstrap = {
                "",

        };
        final String[] NodeJs = {
                "",

        };
        final String[] ExpressJs = {
                "",

        };
        final String[] Laravel = {
                "",

        };
        final String[] jQuery = {
                "",

        };
        String quizItems = getIntent().getStringExtra("quizItems");
        switch (quizItems) {
            case "Fundamental":
                list = Fundamental;
                break;
            case "Basic":
                list = Basic;
                break;
            case "Objects":
                list = Objects;
                break;
            case "OOPs":
                list = OOPs;
                break;
            case "DOM":
                list = DOM;
                break;
            case "BOM":
                list = BOM;
                break;
            case "Advanced":
                list = Advanced;
                break;
            case "AJAX":
                list = AJAX;
                break;
            case "Typescript":
                list = Typescript;
                break;
            //pro content
            case "Angular":
                list = Angular;
                break;
            case "Vue Js":
                list = VueJs;
                break;
            case "Next Js":
                list = NextJs;
                break;
            case "React Js":
                list = ReactJs;
                break;
            case "Ember Js":
                list = EmberJs;
                break;
            case "Bootstrap":
                list = Bootstrap;
                break;
            case "Node Js":
                list = NodeJs;
                break;
            case "Express Js":
                list = ExpressJs;
                break;
            case "Laravel":
                list = Laravel;
                break;
            case "jQuery":
                list = jQuery;
                break;
        }

    }

    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
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

            view = getLayoutInflater().inflate(R.layout.programs_list_items_layout, null);
            TextView textView = view.findViewById(R.id.itemsTitle);
            textView.setText(list[i]);

            return view;
        }
    }
}