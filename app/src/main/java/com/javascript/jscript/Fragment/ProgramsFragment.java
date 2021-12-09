package com.javascript.jscript.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;

import com.javascript.jscript.Activities.PremiumActivity;
import com.javascript.jscript.Adapter.ProgramsItemsAdapter;
import com.javascript.jscript.Adapter.ProgramsItemsAdapterPro;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Programs.ProgramsItemsListActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.Utils.ExpandableHeightGridView;

public class ProgramsFragment extends Fragment {
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
    public ProgramsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_programs,container,false);
        adNetwork = new AdNetwork(getActivity());

        //pro codes
        proView = view.findViewById(R.id.ProgramsProView);
        proImage = view.findViewById(R.id.programsProImage);
        //free
        gridView = view.findViewById(R.id.programs_item_gridview);
        gridView.setExpanded(true);
        ProgramsItemsAdapter adapter = new ProgramsItemsAdapter(itemsName,itemImages,getActivity());
        gridView.setAdapter(adapter);

        //pro
        gridViewPro = view.findViewById(R.id.programs_item_gridview_pro);
        gridViewPro.setExpanded(true);
        ProgramsItemsAdapterPro adapter1 = new ProgramsItemsAdapterPro(itemsNamePro,itemImagesPro,getActivity());
        gridViewPro.setAdapter(adapter1);

        //check user upgrade to pro
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW){
            proView.setVisibility(View.VISIBLE);
            proImage.setVisibility(View.VISIBLE);
        }else {
            proView.setVisibility(View.GONE);
            proImage.setVisibility(View.GONE);
        }

        //click pro view
        proView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), PremiumActivity.class));
            }
        });

        //load ad
        adNetwork.loadInterstitialAd();
        //items free
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), ProgramsItemsListActivity.class);
                switch (i){
                    case 0:
                        intent.putExtra("programsItems","Basic");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("programsItems","Advanced");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("programsItems","Expert");
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
                Intent intent = new Intent(getActivity(), ProgramsItemsListActivity.class);
                switch (i){
                    case 0:
                        intent.putExtra("programsItems","Angular");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("programsItems","Vue");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("programsItems","React");
                        startActivity(intent);
                        break;

                }
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}