package com.javascript.jscript.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.javascript.jscript.Activities.PremiumActivity;
import com.javascript.jscript.Adapter.InterviewItemsAdapter;
import com.javascript.jscript.Adapter.InterviewItemsAdapterPro;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Interview.InterviewItemsListActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.Utils.ExpandableHeightGridView;

import java.util.concurrent.TimeUnit;

public class InterviewQAFragment extends Fragment {
    ExpandableHeightGridView gridView, gridViewPro;
    View proView;
    ImageView proImage;
    String[] itemsName = {"Basic", "Objects", "OOPs", "DOM", "BOM", "Advanced", "AJAX", "Typescript"};
    String[] itemsNamePro = {"Angular", "Vue Js", "Next Js", "React Js", "Ember Js", "Bootstrap", "Node Js", "Express Js", "Laravel", "jQuery"
            /*"Svelte Js","Gatsby","Nuxt Js","Spring Boot","Micronaut","Mocha"*/};
    Integer[] itemImages = {
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
    private MaxNativeAdLoader nativeAdLoader;
    private MaxAd nativeAd;
    FrameLayout nativeAdContainer;
    private int retry;

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
        View view = inflater.inflate(R.layout.fragment_interview_q_a, container, false);
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
        proView = view.findViewById(R.id.interviewProView);
        proImage = view.findViewById(R.id.interviewProImage);
        //free
        gridView = view.findViewById(R.id.interview_item_gridview);
        gridView.setExpanded(true);
        InterviewItemsAdapter adapter = new InterviewItemsAdapter(itemsName, getActivity(), itemImages);
        gridView.setAdapter(adapter);

        //pro
        gridViewPro = view.findViewById(R.id.interview_item_gridview_pro);
        gridViewPro.setExpanded(true);
        InterviewItemsAdapterPro adapter1 = new InterviewItemsAdapterPro(itemsNamePro, itemImagesPro, getActivity());
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

        //native ad codes
        nativeAdContainer = view.findViewById( R.id.native_ad_layout );
        loadNativeAd();

        //pro user check
        if(UiConfig.PRO_VISIBILITY_STATUS_SHOW){
            nativeAdContainer.setVisibility(View.VISIBLE);
        }else {
            nativeAdContainer.setVisibility(View.GONE);
        }

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
                switch (i) {
                    case 0:
                        intent.putExtra("interviewItems", "Basic");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("interviewItems", "Objects");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("interviewItems", "OOPs");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("interviewItems", "DOM");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("interviewItems", "BOM");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("interviewItems", "Advanced");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("interviewItems", "AJAX");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("interviewItems", "Typescript");
                        startActivity(intent);
                        break;
                    /*case 8:
                        intent.putExtra("interviewItems","JSON");
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
                Intent intent = new Intent(getActivity(), InterviewItemsListActivity.class);
                switch (i) {
                    case 0:
                        intent.putExtra("interviewItems", "Angular");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("interviewItems", "Vue Js");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("interviewItems", "Next Js");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("interviewItems", "React Js");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("interviewItems", "Ember Js");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("interviewItems", "Bootstrap");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("interviewItems", "Node Js");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("interviewItems", "Express Js");
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("interviewItems", "Laravel");
                        startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("interviewItems", "jQuery");
                        startActivity(intent);
                        break;
                    /*
                    case 14:
                        intent.putExtra("interviewItems","Micronaut");
                        startActivity(intent);
                        break;
                    case 15:
                        intent.putExtra("interviewItems","Mocha Js");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("interviewItems","Svelte Js");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("interviewItems","Gatsby");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("interviewItems","Nuxt Js");
                        startActivity(intent);
                        break;
                    case 11:
                        intent.putExtra("interviewItems","Spring Boot");
                        startActivity(intent);
                        break;
*/
                }
            }
        });


        return view;
    }

    //load small native ad
    public void loadNativeAd() {
        nativeAdLoader = new MaxNativeAdLoader(getResources().getString(R.string.native_small_ad_unit_id), getActivity());
        nativeAdLoader.setNativeAdListener(new MaxNativeAdListener() {
            @Override
            public void onNativeAdLoaded(final MaxNativeAdView nativeAdView, final MaxAd ad) {
                // Clean up any pre-existing native ad to prevent memory leaks.
                if (nativeAd != null) {
                    nativeAdLoader.destroy(nativeAd);
                }
                // Save ad for cleanup.
                nativeAd = ad;
                // Add ad view to view.
                nativeAdContainer.removeAllViews();
                nativeAdContainer.addView(nativeAdView);
            }

            @Override
            public void onNativeAdLoadFailed(final String adUnitId, final MaxError error) {
                // We recommend retrying with exponentially higher delays up to a maximum delay
                nativeAdContainer.setVisibility(View.GONE);
                retry++;
                long delay = TimeUnit.SECONDS.toMillis((long) Math.pow(2, Math.min(6, retry)));

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        nativeAdLoader.loadAd();
                    }
                }, delay);
            }

            @Override
            public void onNativeAdClicked(final MaxAd ad) {
                // Optional click callback
            }
        });
        nativeAdLoader.loadAd();
    }
}