package com.javascript.jscript.Learn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

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
import com.javascript.jscript.databinding.ActivityLearnItemsListBinding;

import java.util.List;
import java.util.Objects;

public class LearnItemsListActivity extends AppCompatActivity {

    ActivityLearnItemsListBinding binding;
    private AdNetwork adNetwork;
    ListView learnList;
    String[] list = {};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLearnItemsListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        adNetwork = new AdNetwork(LearnItemsListActivity.this);
        //toolbar
        setSupportActionBar(binding.toolbar2);
        LearnItemsListActivity.this.setTitle("Learn");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        loadItems();
        learnList = findViewById(R.id.learnList);
        LearnItemsListActivity.CustomAdapter adapter = new LearnItemsListActivity.CustomAdapter();
        learnList.setAdapter(adapter);
        //load ad
        adNetwork.loadInterstitialAd();
        learnList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(LearnItemsListActivity.this, LearnDetailsActivity.class);
                intent.putExtra("learnTopics",list[i]);
                startActivity(intent);
                adNetwork.showInterstitialAd();
            }
        });


    }
    private void loadItems() {
        final String basic[] = {
                "Learn Basic",
                "Basic1",
                "Basic2",
                "In this example, you will learn to write a JavaScript program that will remove a property from an object.",
                "Basic",
                "Basic1",
                "Basic2",
                "In this example, you will learn to write a JavaScript program that will remove a property from an object.",
                "Basic",
                "Basic1",
                "Basic2",
                "In this example, you will learn to write a JavaScript program that will remove a property from an object.",
                "Basic",
                "Basic1",
                "Basic2"
        };

        final String advanced[] = {
                "Learn advanced",
                "advanced2",
                "advanced",
                "In this example, you will learn to write a JavaScript program that will remove a property from an object.",
                "advanced",
                "advanced",
        };

        final String expert[] = {
                "Learn expert",
                "expert",
                "expert",
                "In this example, you will learn to write a JavaScript program that will remove a property from an object.",
                "expert",
                "expert",
        };

        final String angular[] = {
                "Learn angular",
                "angular",
                "angular",
                "In this example, you will learn to write a JavaScript program that will remove a property from an object.",
                "angular",
                "angular",
        };

        String programsItems = getIntent().getStringExtra("learnItems");
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