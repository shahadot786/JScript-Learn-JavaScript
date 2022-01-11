package com.javascript.jscript.Programs;

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
import com.javascript.jscript.databinding.ActivityProgramsItemsListBinding;

import java.util.Objects;

public class ProgramsItemsListActivity extends AppCompatActivity {
    ListView programs;
    String[] list = {};
    ActivityProgramsItemsListBinding binding;
    private AdNetwork adNetwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgramsItemsListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        adNetwork = new AdNetwork(ProgramsItemsListActivity.this);
        //toolbar
        setSupportActionBar(binding.toolbar2);
        ProgramsItemsListActivity.this.setTitle("JScript: Practice Programs");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        loadItems();
        programs = findViewById(R.id.programsList);
        CustomAdapter adapter = new CustomAdapter();
        programs.setAdapter(adapter);
        //load ad
        adNetwork.loadInterstitialAd();
        programs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ProgramsItemsListActivity.this, ProgramsCodeActivity.class);
                intent.putExtra("position", list[i]);
                intent.putExtra("output", list[i]);
                startActivity(intent);
                adNetwork.showInterstitialAd();
            }
        });


    }

    private void loadItems() {
        final String[] basic = {
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
                "Basic2",
                "In this example, you will learn to write a JavaScript program that will remove a property from an object.",
                "Basic",
                "Basic1",
                "Basic2",
                "In this example, you will learn to write a JavaScript program that will remove a property from an object.",
        };

        final String[] advanced = {
                "advanced",
                "advanced2",
                "advanced",
                "In this example, you will learn to write a JavaScript program that will remove a property from an object.",
                "advanced",
                "advanced",
        };

        final String[] expert = {
                "expert",
                "expert",
                "expert",
                "In this example, you will learn to write a JavaScript program that will remove a property from an object.",
                "expert",
                "expert",
        };

        final String[] angular = {
                "angular",
                "angular",
                "angular",
                "In this example, you will learn to write a JavaScript program that will remove a property from an object.",
                "angular",
                "angular",
        };

        String programsItems = getIntent().getStringExtra("programsItems");
        switch (programsItems) {
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