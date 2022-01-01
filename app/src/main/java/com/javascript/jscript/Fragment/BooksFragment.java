package com.javascript.jscript.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;

import com.javascript.jscript.Books.BooksListActivity;
import com.javascript.jscript.Activities.PremiumActivity;
import com.javascript.jscript.Adapter.BooksItemsAdapter;
import com.javascript.jscript.Adapter.BooksItemsAdapterPro;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.Utils.ExpandableHeightGridView;

public class BooksFragment extends Fragment {
    ExpandableHeightGridView gridView , gridViewPro;
    View proView;
    ImageView proImage;
    private AdNetwork adNetwork;

    String[] itemsName = {"Fundamental","Basic","Objects","OOPs","DOM","BOM","Advanced","AJAX"};
    String[] itemsNamePro = {"Typescript","Angular","Vue Js","Next Js","React Js","Ember Js","Svelte Js","Gatsby","Nuxt Js","Bootstrap"
            /*"Node Js","Spring Boot","Express Js",
            "Laravel","Micronaut","Mocha"*/};

    Integer[] itemImages = {
            R.drawable.ic_fundamental_icon,
            R.drawable.ic_programs_basic_image,
            R.drawable.ic_objects_icon,
            R.drawable.ic_oops_icon,
            R.drawable.ic_dom_icon,
            R.drawable.ic_bom_icon,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_ajax_icon
            //R.drawable.ic_json_icon

    };
    Integer[] itemImagesPro = {
            R.drawable.ic_typescript_icon,
            R.drawable.ic_angular_icon,
            R.drawable.ic_js_vue_icon,
            R.drawable.ic_next_js,
            R.drawable.ic_react_icon,
            R.drawable.ic_emberjs_icon,
            R.drawable.ic_svelte_icon,
            R.drawable.ic_gatsbyjs_icon,
            R.drawable.ic_nuxt_icon,
            R.drawable.ic_bootstrap_icon/*
            R.drawable.ic_node_icon,
            R.drawable.ic_springio_icon,
            R.drawable.ic_expressjs_icon,
            R.drawable.ic_laravel_icon,
            R.drawable.ic_micronaut_icon,
            R.drawable.ic_mochajs_icon*/

    };

    public BooksFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_books, container, false);
        //pro codes
        proView = view.findViewById(R.id.booksProView);
        proImage = view.findViewById(R.id.booksProImage);
        //free
        gridView = view.findViewById(R.id.books_item_gridview);
        gridView.setExpanded(true);
        BooksItemsAdapter adapter = new BooksItemsAdapter(itemsName,itemImages,getActivity());
        gridView.setAdapter(adapter);

        //pro
        gridViewPro = view.findViewById(R.id.books_item_gridview_pro);
        gridViewPro.setExpanded(true);
        BooksItemsAdapterPro adapter1 = new BooksItemsAdapterPro(itemsNamePro,itemImagesPro,getActivity());
        gridViewPro.setAdapter(adapter1);

        //check user upgrade to pro
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW){
            proView.setVisibility(View.VISIBLE);
            proImage.setVisibility(View.VISIBLE);
        }else {
            proView.setVisibility(View.GONE);
            proImage.setVisibility(View.GONE);
        }
        //add network context initialization
        adNetwork = new AdNetwork(getActivity());
        //load ad
        adNetwork.loadInterstitialAd();
        //click pro view
        proView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), PremiumActivity.class));
            }
        });
        //items free
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), BooksListActivity.class);
                switch (i){
                    case 0:
                        intent.putExtra("booksItems","Fundamental");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("booksItems","Basic");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("booksItems","Objects");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("booksItems","OOPs");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("booksItems","DOM");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("booksItems","BOM");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("booksItems","Advanced");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("booksItems","AJAX");
                        startActivity(intent);
                        break;
                    /*case 8:
                        intent.putExtra("booksItems","JSON");
                        startActivity(intent);
                        break;*/

                }
                //show ad
                adNetwork.showInterstitialAd();
            }
        });
        //items pro
        gridViewPro.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), BooksListActivity.class);
                switch (i){
                    case 0:
                        intent.putExtra("booksItems","Typescript");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("booksItems","Angular");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("booksItems","Vue Js");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("booksItems","Next Js");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("booksItems","React Js");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("booksItems","Ember Js");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("booksItems","Svelte Js");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("booksItems","Gatsby");
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("booksItems","Nuxt Js");
                        startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("booksItems","Bootstrap");
                        startActivity(intent);
                        break;
                    /*case 10:
                        intent.putExtra("booksItems","Node Js");
                        startActivity(intent);
                        break;
                    case 11:
                        intent.putExtra("booksItems","Spring Boot");
                        startActivity(intent);
                        break;
                    case 12:
                        intent.putExtra("booksItems","Express Js");
                        startActivity(intent);
                        break;
                    case 13:
                        intent.putExtra("booksItems","Laravel");
                        startActivity(intent);
                        break;
                    case 14:
                        intent.putExtra("booksItems","Micronaut");
                        startActivity(intent);
                        break;
                    case 15:
                        intent.putExtra("booksItems","Mocha Js");
                        startActivity(intent);
                        break;
*/

                }
            }
        });


        return view;
    }
}