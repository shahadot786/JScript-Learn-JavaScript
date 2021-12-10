package com.javascript.jscript.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.javascript.jscript.Adapter.ViewPagerAdapter;
import com.javascript.jscript.R;

public class HomeFragment extends Fragment {

    ViewPager viewPager;
    TabLayout tabLayout;

    public HomeFragment() {
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
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = view.findViewById(R.id.homeViewPager);
        viewPager.setAdapter(new ViewPagerAdapter(getChildFragmentManager()));

        tabLayout = view.findViewById(R.id.tabLayoutHome);
        tabLayout.setupWithViewPager(viewPager);


        return view;
    }
}