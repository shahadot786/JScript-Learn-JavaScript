package com.javascript.jscript.Fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.javascript.jscript.Activities.PremiumActivity;
import com.javascript.jscript.Adapter.LearnItemsAdapter;
import com.javascript.jscript.Adapter.LearnItemsAdapterPro;
import com.javascript.jscript.Adapter.LearnSliderAdapter;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Learn.LearnItemsListActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.Utils.ExpandableHeightGridView;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class LearnFragment extends Fragment {

    ExpandableHeightGridView gridView, gridViewPro;
    View proView;
    ImageView proImage;
    String[] itemsName = {"Fundamental", "Basic", "Objects", "OOPs", "DOM", "BOM", "Advanced", "AJAX", "Typescript"};
    String[] itemsNamePro = {"Angular", "Vue Js", "Next Js", "React Js", "Ember Js", "Bootstrap", "Node Js", "Express Js", "Laravel", "jQuery"
            /*"Svelte Js","Gatsby","Nuxt Js","Spring Boot","Micronaut","Mocha"*/};
    Integer[] itemImages = {
            R.drawable.ic_fundamental_icon,
            R.drawable.ic_programs_basic_image,
            R.drawable.ic_objects_icon,
            R.drawable.ic_oops_icon,
            R.drawable.ic_dom_icon,
            R.drawable.ic_bom_icon,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_ajax_icon,
            R.drawable.ic_typescript_icon,
            //R.drawable.ic_json_icon

    };
    Integer[] itemImagesPro = {
            R.drawable.ic_angular_icon,
            R.drawable.ic_js_vue_icon,
            R.drawable.ic_next_js,
            R.drawable.ic_react_icon,
            R.drawable.ic_emberjs_icon,
            R.drawable.ic_bootstrap_icon,
            R.drawable.ic_node_icon,
            R.drawable.ic_expressjs_icon,
            R.drawable.ic_laravel_icon,
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

    public LearnFragment() {
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
        View view = inflater.inflate(R.layout.fragment_learn, container, false);
        //image slider
        SliderView sliderView = view.findViewById(R.id.sliderView);
        String[] slideText = new String[]{
                "95% OFF Limited Time Offer",
                "Upcoming Courses",
                "Learn JavaScript Offline",
                "Play Quiz",
                "Learn Practice Programs",
                "Learn Interview Questions",
                "Read 140+ Ebooks"
        };

        int[] images = new int[]{
                R.drawable.pro_ad,
                R.drawable.upcoming,
                R.drawable.ic_learn_slider_bg_200dp,
                R.drawable.ic_quiz_slider_bg_200dp,
                R.drawable.ic_program_slider_bg_200dp,
                R.drawable.ic_interview_slider_bg_200dp,
                R.drawable.ic_ebook_slider_bg_200dp
        };
        LearnSliderAdapter sliderAdapter = new LearnSliderAdapter(images, slideText);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.parseColor("#15c55d"));
        sliderView.setIndicatorUnselectedColor(Color.WHITE);
        sliderView.setScrollTimeInSec(6);
        sliderView.startAutoCycle();
        //check if user are premium
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            slideText[0] = "95% OFF Limited Time Offer";
            images[0] = R.drawable.pro_ad;
        } else {
            slideText[0] = "Enjoy Premium Services";
            images[0] = R.drawable.after_pro_ad;
        }
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
        proView = view.findViewById(R.id.LearnProView);
        proImage = view.findViewById(R.id.learnProImage);
        //free
        gridView = view.findViewById(R.id.learn_item_gridview);
        gridView.setExpanded(true);
        LearnItemsAdapter adapter = new LearnItemsAdapter(itemsName, itemImages, getActivity());
        gridView.setAdapter(adapter);

        //pro
        gridViewPro = view.findViewById(R.id.learn_item_gridview_pro);
        gridViewPro.setExpanded(true);
        LearnItemsAdapterPro adapterPro = new LearnItemsAdapterPro(itemsNamePro, itemImagesPro, getActivity());
        gridViewPro.setAdapter(adapterPro);

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
                Intent intent = new Intent(getActivity(), LearnItemsListActivity.class);
                switch (i) {
                    case 0:
                        intent.putExtra("learnItems", "Fundamental");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("learnItems", "Basic");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("learnItems", "Objects");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("learnItems", "OOPs");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("learnItems", "DOM");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("learnItems", "BOM");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("learnItems", "Advanced");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("learnItems", "AJAX");
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("learnItems", "Typescript");
                        startActivity(intent);
                        break;
                    /*case 9:
                        intent.putExtra("learnItems","JSON");
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
                Intent intent = new Intent(getActivity(), LearnItemsListActivity.class);
                switch (i) {
                    case 0:
                        intent.putExtra("learnItems", "Angular");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("learnItems", "Vue Js");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("learnItems", "Next Js");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("learnItems", "React Js");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("learnItems", "Ember Js");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("learnItems", "Bootstrap");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("learnItems", "Node Js");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("learnItems", "Express Js");
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("learnItems", "Laravel");
                        startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("learnItems", "jQuery");
                        startActivity(intent);
                        break;
                    /*
                    case 14:
                        intent.putExtra("learnItems","Micronaut");
                        startActivity(intent);
                        break;
                    case 15:
                        intent.putExtra("learnItems","Mocha Js");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("learnItems","Svelte Js");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("learnItems","Gatsby");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("learnItems","Nuxt Js");
                        startActivity(intent);
                        break;
                    case 11:
                        intent.putExtra("learnItems","Spring Boot");
                        startActivity(intent);
                        break;
*/
                }
            }
        });


        return view;
    }
}