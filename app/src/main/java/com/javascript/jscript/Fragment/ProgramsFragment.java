package com.javascript.jscript.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.javascript.jscript.Activities.PremiumActivity;
import com.javascript.jscript.Adapter.ProgramsItemsAdapter;
import com.javascript.jscript.Adapter.ProgramsItemsAdapterPro;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Programs.ProgramsItemsListActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.Utils.ExpandableHeightGridView;

public class ProgramsFragment extends Fragment {
    ExpandableHeightGridView gridView, gridViewPro;
    View proView;
    ImageView proImage;
    String[] itemsName = {"Basic", "Objects", "OOPs", "DOM", "Advanced", "AJAX", "Typescript"};
    String[] itemsNamePro = {"Angular", "Vue Js", "React Js", "Ember Js", "Bootstrap", "Node Js", "Express Js", "jQuery"
            /*"Svelte Js","Gatsby","Nuxt Js","Spring Boot","Micronaut","Mocha"*/};
    Integer[] itemImages = {
            R.drawable.ic_programs_basic_image,
            R.drawable.ic_objects_icon,
            R.drawable.ic_oops_icon,
            R.drawable.ic_dom_icon,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_ajax_icon,
            R.drawable.ic_typescript_icon,
            //R.drawable.ic_json_icon

    };
    Integer[] itemImagesPro = {
            R.drawable.ic_angular_icon,
            R.drawable.ic_js_vue_icon,
            R.drawable.ic_react_icon,
            R.drawable.ic_emberjs_icon,
            R.drawable.ic_bootstrap_icon,
            R.drawable.ic_node_icon,
            R.drawable.ic_expressjs_icon,
            R.drawable.ic_jquery_icon
            /*
            R.drawable.ic_svelte_icon,
            R.drawable.ic_gatsbyjs_icon,
            R.drawable.ic_nuxt_icon,
            R.drawable.ic_springio_icon,
            R.drawable.ic_micronaut_icon,
            R.drawable.ic_mochajs_icon*/

    };
    private AdNetwork adNetwork;

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
        View view = inflater.inflate(R.layout.fragment_programs, container, false);
        //pro animations
        ConstraintLayout proAnimation = view.findViewById(R.id.proAnimation);
        proAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent;
                intent = new Intent(context, PremiumActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
        //pro codes
        proView = view.findViewById(R.id.ProgramsProView);
        proImage = view.findViewById(R.id.programsProImage);
        //free
        gridView = view.findViewById(R.id.programs_item_gridview);
        gridView.setExpanded(true);
        ProgramsItemsAdapter adapter = new ProgramsItemsAdapter(itemsName, itemImages, getActivity());
        gridView.setAdapter(adapter);

        //pro
        gridViewPro = view.findViewById(R.id.programs_item_gridview_pro);
        gridViewPro.setExpanded(true);
        ProgramsItemsAdapterPro adapter1 = new ProgramsItemsAdapterPro(itemsNamePro, itemImagesPro, getActivity());
        gridViewPro.setAdapter(adapter1);

        //check user upgrade to pro
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            proView.setVisibility(View.VISIBLE);
            proImage.setVisibility(View.VISIBLE);
            proAnimation.setVisibility(View.VISIBLE);
        } else {
            proView.setVisibility(View.GONE);
            proImage.setVisibility(View.GONE);
            proAnimation.setVisibility(View.GONE);
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
                Intent intent = new Intent(getActivity(), ProgramsItemsListActivity.class);
                switch (i) {
                    case 0:
                        intent.putExtra("programsItems", "Basic");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("programsItems", "Objects");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("programsItems", "OOPs");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("programsItems", "DOM");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("programsItems", "Advanced");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("programsItems", "AJAX");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("programsItems", "Typescript");
                        startActivity(intent);
                        break;
                    /*case 8:
                        intent.putExtra("programsItems","JSON");
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
                Intent intent = new Intent(getActivity(), ProgramsItemsListActivity.class);
                switch (i) {
                    case 0:
                        intent.putExtra("programsItems", "Angular");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("programsItems", "Vue Js");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("programsItems", "React Js");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("programsItems", "Ember Js");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("programsItems", "Bootstrap");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("programsItems", "Node Js");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("programsItems", "Express Js");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("programsItems", "jQuery");
                        startActivity(intent);
                        break;
                    /*
                    case 14:
                        intent.putExtra("programsItems","Micronaut");
                        startActivity(intent);
                        break;
                    case 15:
                        intent.putExtra("programsItems","Mocha Js");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("programsItems","Svelte Js");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("programsItems","Gatsby");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("programsItems","Nuxt Js");
                        startActivity(intent);
                        break;
                    case 11:
                        intent.putExtra("programsItems","Spring Boot");
                        startActivity(intent);
                        break;
*/
                }
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}