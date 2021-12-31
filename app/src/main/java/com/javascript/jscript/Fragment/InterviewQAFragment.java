package com.javascript.jscript.Fragment;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import com.javascript.jscript.Activities.PremiumActivity;
import com.javascript.jscript.Adapter.InterviewItemsAdapter;
import com.javascript.jscript.Adapter.InterviewItemsAdapterPro;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Interview.InterviewItemsListActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.Utils.ExpandableHeightGridView;

public class InterviewQAFragment extends Fragment {
    ExpandableHeightGridView gridView , gridViewPro;
    View proView;
    ImageView proImage;
    private AdNetwork adNetwork;

    String[] itemsName = {"Fundamental","Basic","Objects","OOPs","DOM","BOM","Advanced","Typescript","Angular","Ajax","Json","Examples"};
    String[] itemsNamePro = {"Vue Js","Next Js","React Js","Ember Js","Svelte Js","Gatsby","Nuxt Js","Bootstrap","Node Js","Spring Boot","Express Js",
            "Laravel","Micronaut","Mocha"};

    Integer[] itemImages = {
            R.drawable.ic_fundamental_icon,
            R.drawable.ic_programs_basic_image,
            R.drawable.ic_objects_icon,
            R.drawable.ic_oops_icon,
            R.drawable.ic_dom_icon,
            R.drawable.ic_bom_icon,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_typescript_icon,
            R.drawable.ic_angular_icon,
            R.drawable.ic_ajax_icon,
            R.drawable.ic_json_icon,
            R.drawable.ic_example_icon

    };
    Integer[] itemImagesPro = {
            R.drawable.ic_js_vue_icon,
            R.drawable.ic_next_js,
            R.drawable.ic_react_icon,
            R.drawable.ic_emberjs_icon,
            R.drawable.ic_svelte_icon,
            R.drawable.ic_gatsbyjs_icon,
            R.drawable.ic_nuxt_icon,
            R.drawable.ic_bootstrap_icon,
            R.drawable.ic_node_icon,
            R.drawable.ic_springio_icon,
            R.drawable.ic_expressjs_icon,
            R.drawable.ic_laravel_icon,
            R.drawable.ic_micronaut_icon,
            R.drawable.ic_mochajs_icon

    };

    public InterviewQAFragment() {
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
        View view =  inflater.inflate(R.layout.fragment_interview_q_a, container, false);
        //pro codes
        proView = view.findViewById(R.id.interviewProView);
        proImage = view.findViewById(R.id.interviewProImage);
        //free
        gridView = view.findViewById(R.id.interview_item_gridview);
        gridView.setExpanded(true);
        InterviewItemsAdapter adapter = new InterviewItemsAdapter(itemsName,getActivity(),itemImages);
        gridView.setAdapter(adapter);

        //pro
        gridViewPro = view.findViewById(R.id.interview_item_gridview_pro);
        gridViewPro.setExpanded(true);
        InterviewItemsAdapterPro adapter1 = new InterviewItemsAdapterPro(itemsNamePro,itemImagesPro,getActivity());
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
                Intent intent = new Intent(getActivity(), InterviewItemsListActivity.class);
                switch (i){
                    case 0:
                        intent.putExtra("interviewItems","Fundamental");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("interviewItems","Basic");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("interviewItems","Objects");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("interviewItems","OOPs");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("interviewItems","DOM");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("interviewItems","BOM");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("interviewItems","Advanced");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("interviewItems","Typescript");
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("interviewItems","Angular");
                        startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("interviewItems","Ajax");
                        startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("interviewItems","Json");
                        startActivity(intent);
                        break;
                    case 11:
                        intent.putExtra("interviewItems","Examples");
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
                Intent intent = new Intent(getActivity(), InterviewItemsListActivity.class);
                switch (i){
                    case 0:
                        intent.putExtra("interviewItems","Vue Js");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("interviewItems","Next Js");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("interviewItems","React Js");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("interviewItems","Ember Js");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("interviewItems","Svelte Js");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("interviewItems","Gatsby");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("interviewItems","Nuxt Js");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("interviewItems","Bootstrap");
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("interviewItems","Node Js");
                        startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("interviewItems","Spring Boot");
                        startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("interviewItems","Express Js");
                        startActivity(intent);
                        break;
                    case 11:
                        intent.putExtra("interviewItems","Laravel");
                        startActivity(intent);
                        break;
                    case 12:
                        intent.putExtra("interviewItems","Micronaut");
                        startActivity(intent);
                        break;
                    case 13:
                        intent.putExtra("interviewItems","Mocha Js");
                        startActivity(intent);
                        break;



                }
            }
        });


        return view;
    }
}