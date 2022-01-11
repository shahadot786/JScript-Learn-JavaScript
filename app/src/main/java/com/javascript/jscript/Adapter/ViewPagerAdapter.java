package com.javascript.jscript.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.javascript.jscript.Fragment.BooksFragment;
import com.javascript.jscript.Fragment.InterviewQAFragment;
import com.javascript.jscript.Fragment.LearnFragment;
import com.javascript.jscript.Fragment.ProgramsFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new ProgramsFragment();
            case 2:
                return new InterviewQAFragment();
            case 3:
                return new BooksFragment();
            case 0:
            default:
                return new LearnFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Learn";
        } else if (position == 1) {
            title = "Programs";
        } else if (position == 2) {
            title = "Interview";
        } else if (position == 3) {
            title = "Books";
        }
        return title;
    }
}
