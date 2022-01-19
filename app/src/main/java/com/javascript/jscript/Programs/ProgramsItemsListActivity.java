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
        final String[] Basic = {
                "Display the current day and time",
                "Find the area of a triangle",
                "Given year is a leap year",
                "Random integer between 1 to 10",
                "Convert temperatures",
                "Get the extension of a filename",
                "Remove a character at the specified position",
                "Find the largest of three given integers",
                "Specified character exists",
                "Reverse a given string",
                "Capitalize the first letter",
                "Convert a given number to hours and minutes",
                "Convert the letters of a given string in alphabetical order",
                "Concatenate two strings except their first character",
                "Rotate the elements left of a given array of integers of length 3",
                "Find the maximal difference between any two adjacent elements of a given array of integers",
                "Find the shortest possible string",
                "Create the dot products of two given 3D vectors",
                "Sort an array of all prime numbers between 1 and a given integer",
                "Calculate the sum of n + n/2 + n/4 + n/8 + .... where n is a positive integer and all divisions are integer",
                "A given string represents a correct sentence or not",
                "A matrix is a diagonal matrix or not",
                "A point lies strictly inside a given circle",
                "A given matrix is lower triangular or not",
                "To create the value of NOR of two given booleans",
                "Largest even number from an array of integers",
                "Find the smallest prime number strictly greater than a given number",
                "Find all distinct prime factors of a given integer",
                "A given fraction is proper or not",
                "A given absolute path for a file in Unix-style",
                "Swap two halves of a given array of integers of even length"
        };

        final String[] Objects = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };

        final String[] OOPs = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };

        final String[] DOM = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        final String[] Advanced = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        final String[] AJAX = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        final String[] Typescript = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        final String[] Angular = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        final String[] VueJs = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        final String[] NextJs = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        final String[] ReactJs = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        final String[] EmberJs = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        final String[] Bootstrap = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        final String[] NodeJs = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        final String[] ExpressJs = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        final String[] Laravel = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        final String[] jQuery = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };


        String programsItems = getIntent().getStringExtra("programsItems");
        switch (programsItems) {
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