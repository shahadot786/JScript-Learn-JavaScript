package com.javascript.jscript.Quiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityQuizTopicListBinding;

import java.util.Map;
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
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                Map<String, AdapterStatus> statusMap = initializationStatus.getAdapterStatusMap();
                for (String adapterClass : statusMap.keySet()) {
                    AdapterStatus status = statusMap.get(adapterClass);
                    Log.d("MyApp", String.format(
                            "Adapter name: %s, Description: %s, Latency: %d",
                            adapterClass, status.getDescription(), status.getLatency()));
                }

                // Start loading ads here...
                //ad initialization
                adNetwork.loadInterstitialAd();

            }
        });
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
                "Fundamental Quiz 2",
                "Fundamental Quiz 3",
                "Fundamental Quiz 4",
                "Fundamental Quiz 5",
                "Fundamental Quiz 6",
                "Fundamental Quiz 7",
                "Fundamental Quiz 8",
                "Fundamental Quiz 9",
                "Fundamental Quiz 10"

        };
        final String[] Basic = {
                "Basic Quiz 1",
                "Basic Quiz 2",
                "Basic Quiz 3",
                "Basic Quiz 4",
                "Basic Quiz 5",
                "Basic Quiz 6",
                "Basic Quiz 7",
                "Basic Quiz 8",
                "Basic Quiz 9",
                "Basic Quiz 10"

        };
        final String[] Objects = {
                "Objects Quiz 1",
                "Objects Quiz 2",
                "Objects Quiz 3",
                "Objects Quiz 4",
                "Objects Quiz 5"

        };
        final String[] OOPs = {
                "OOPs Quiz 1",
                "OOPs Quiz 2",
                "OOPs Quiz 3",
                "OOPs Quiz 4",
                "OOPs Quiz 5"

        };
        final String[] DOM = {
                "DOM Quiz 1",
                "DOM Quiz 2",
                "DOM Quiz 3",
                "DOM Quiz 4",
                "DOM Quiz 5"

        };
        final String[] Advanced = {
                "Advanced Quiz 1",
                "Advanced Quiz 2",
                "Advanced Quiz 3",
                "Advanced Quiz 4",
                "Advanced Quiz 5",
                "Advanced Quiz 6",
                "Advanced Quiz 7",
                "Advanced Quiz 8",
                "Advanced Quiz 9",
                "Advanced Quiz 10"

        };
        final String[] AJAX = {
                "AJAX Quiz 1",
                "AJAX Quiz 2",
                "AJAX Quiz 3",
                "AJAX Quiz 4",
                "AJAX Quiz 5",
                "AJAX Quiz 6"

        };
        final String[] Typescript = {
                "Typescript Quiz 1",
                "Typescript Quiz 2",
                "Typescript Quiz 3",
                "Typescript Quiz 4",
                "Typescript Quiz 5",
                "Typescript Quiz 6",
                "Typescript Quiz 7"

        };
        //pro content
        final String[] Angular = {
                "Angular Quiz 1",
                "Angular Quiz 2",
                "Angular Quiz 3",
                "Angular Quiz 4",
                "Angular Quiz 5"

        };
        final String[] VueJs = {
                "VueJs Quiz 1",
                "VueJs Quiz 2",
                "VueJs Quiz 3",
                "VueJs Quiz 4",
                "VueJs Quiz 5"

        };
        final String[] ReactJs = {
                "ReactJs Quiz 1",
                "ReactJs Quiz 2",
                "ReactJs Quiz 3",
                "ReactJs Quiz 4",
                "ReactJs Quiz 5"

        };
        final String[] EmberJs = {
                "EmberJs Quiz 1",
                "EmberJs Quiz 2",
                "EmberJs Quiz 3"

        };
        final String[] Bootstrap = {
                "Bootstrap Quiz 1",
                "Bootstrap Quiz 2",
                "Bootstrap Quiz 3",
                "Bootstrap Quiz 4",
                "Bootstrap Quiz 5"

        };
        final String[] NodeJs = {
                "NodeJs Quiz 1",
                "NodeJs Quiz 2",
                "NodeJs Quiz 3",
                "NodeJs Quiz 4",
                "NodeJs Quiz 5"

        };
        final String[] ExpressJs = {
                "ExpressJs Quiz 1",
                "ExpressJs Quiz 2",
                "ExpressJs Quiz 3",
                "ExpressJs Quiz 4",
                "ExpressJs Quiz 5"

        };
        final String[] Laravel = {
                "Laravel Quiz 1",
                "Laravel Quiz 2",
                "Laravel Quiz 3",
                "Laravel Quiz 4",
                "Laravel Quiz 5"

        };
        final String[] jQuery = {
                "jQuery Quiz 1",
                "jQuery Quiz 2",
                "jQuery Quiz 3",
                "jQuery Quiz 4",
                "jQuery Quiz 5"

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