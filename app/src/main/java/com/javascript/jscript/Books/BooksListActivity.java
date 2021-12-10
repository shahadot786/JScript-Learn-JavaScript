package com.javascript.jscript.Books;

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
import com.javascript.jscript.databinding.ActivityBooksListBinding;

import java.util.Objects;

public class BooksListActivity extends AppCompatActivity {

    ActivityBooksListBinding binding;
    private AdNetwork adNetwork;
    ListView programs;
    String[] list = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBooksListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        adNetwork = new AdNetwork(BooksListActivity.this);
        //toolbar
        setSupportActionBar(binding.toolbar2);
        BooksListActivity.this.setTitle("Books");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        loadItems();
        programs = findViewById(R.id.bookList);
        BooksListActivity.CustomAdapter adapter = new BooksListActivity.CustomAdapter();
        programs.setAdapter(adapter);
        //load ad
        adNetwork.loadInterstitialAd();
        programs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(BooksListActivity.this, ReadBooksActivity.class);
                intent.putExtra("booksUri",list[i]);
                startActivity(intent);
                adNetwork.showInterstitialAd();
            }
        });


    }
    private void loadItems() {
        final String basic[] = {
               "Books",
                "Books1",
                "Books",
                "Books1",
                "Books",
                "Books1",
                "Books",
                "Books1",
                "Books",
                "Books1",

        };

        final String advanced[] = {
                "Books",
                "Books1",
        };

        final String expert[] = {
                "Books",
                "Books1",
                "Books",
                "Books1",
        };

        final String angular[] = {
                "angular",
                "Books1",
                "Books",
                "Books1",
                "Books",
                "Books1",
        };

        String programsItems = getIntent().getStringExtra("booksItems");
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