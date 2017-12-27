package com.github.alfian.askdesign.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aufa18 on 27/12/17.
 */

public class BottomBarAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    private boolean isTitle;

    public BottomBarAdapter(FragmentManager fm, boolean isTitle) {
        super(fm);
        this.isTitle = isTitle;
    }

    @Override public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Override public CharSequence getPageTitle(int position) {
        if (isTitle) {
            return mFragmentTitleList.get(position);
        } else {
            return null;
        }
    }
}