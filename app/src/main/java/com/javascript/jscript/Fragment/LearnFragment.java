package com.javascript.jscript.Fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.javascript.jscript.Adapter.LearnSliderAdapter;
import com.javascript.jscript.R;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class LearnFragment extends Fragment {
    private int[] images;
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


        sliderView = view.findViewById(R.id.sliderView);
        images = new int[]{
                R.drawable.ic_javascript_books_header,
                R.drawable.ic_javascript_interview_header,
                R.drawable.ic_javascript_learn_header,
                R.drawable.ic_javascript_programs_header,
                R.drawable.ic_javascript_quiz_header
        };

        adapter = new LearnSliderAdapter(images);
        sliderView.setSliderAdapter(adapter);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_RIGHT);
        sliderView.setIndicatorSelectedColor(Color.rgb(	249, 76, 132));
        sliderView.setIndicatorUnselectedColor(Color.WHITE);
        sliderView.setScrollTimeInSec(2);
        sliderView.startAutoCycle();

        return view;
    }
}