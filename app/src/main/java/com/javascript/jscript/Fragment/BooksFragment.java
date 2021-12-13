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

    String[] itemsName = {"Basic","Advanced","Expert"};
    String[] itemsNamePro = {"Angular","Vue","React","Angular","Vue","React","Angular","Vue","React"};

    Integer[] itemImages = {
            R.drawable.ic_programs_basic_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image

    };
    Integer[] itemImagesPro = {
            R.drawable.ic_programs_basic_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_basic_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_basic_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image

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
                        intent.putExtra("booksItems","Basic");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("booksItems","Advanced");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("booksItems","Expert");
                        startActivity(intent);
                        break;

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
                        intent.putExtra("booksItems","Angular");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("booksItems","Vue");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("booksItems","React");
                        startActivity(intent);
                        break;

                }
            }
        });


        return view;
    }
}