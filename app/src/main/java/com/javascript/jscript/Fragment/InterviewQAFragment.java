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
import com.javascript.jscript.Programs.ProgramsItemsListActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.Utils.ExpandableHeightGridView;

public class InterviewQAFragment extends Fragment {
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
                        intent.putExtra("interviewItems","Basic");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("interviewItems","Advanced");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("interviewItems","Expert");
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
                        intent.putExtra("interviewItems","Angular");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("interviewItems","Vue");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("interviewItems","React");
                        startActivity(intent);
                        break;

                }
            }
        });


        return view;
    }
}