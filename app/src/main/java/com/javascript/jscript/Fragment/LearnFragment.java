package com.javascript.jscript.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.javascript.jscript.Adapter.LearnSliderAdapter;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class LearnFragment extends Fragment {
    private int[] images;
    private String[] slideText;
    private LearnSliderAdapter adapter;
    private SliderView sliderView;

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
        sliderView = view.findViewById(R.id.sliderView);
        slideText = new String[]{
                "95% OFF Limited Time Offer",
                "Learn JavaScript Offline",
                "Play Quiz",
                "Learn Practice Programs",
                "Learn Interview Questions",
                "Read 500+ Ebooks"
        };

        images = new int[]{
                R.drawable.pro_ad,
                R.drawable.ic_learn_slider_bg_200dp,
                R.drawable.ic_quiz_slider_bg_200dp,
                R.drawable.ic_program_slider_bg_200dp,
                R.drawable.ic_interview_slider_bg_200dp,
                R.drawable.ic_ebook_slider_bg_200dp
        };
        adapter = new LearnSliderAdapter(images, slideText);
        sliderView.setSliderAdapter(adapter);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.parseColor("#15c55d"));
        sliderView.setIndicatorUnselectedColor(Color.WHITE);
        sliderView.setScrollTimeInSec(4);
        sliderView.startAutoCycle();
        //check if user are premium
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            slideText[0] = "95% OFF Limited Time Offer";
            images[0] = R.drawable.pro_ad;
        } else {
            slideText[0] = "Enjoy Premium Services";
            images[0] = R.drawable.after_pro_ad;
        }


        return view;
    }
}