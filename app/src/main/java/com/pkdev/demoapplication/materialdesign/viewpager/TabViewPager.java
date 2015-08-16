package com.pkdev.demoapplication.materialdesign.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.pkdev.demoapplication.materialdesign.fragment.FragmentOne;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ultimate on 7/26/2015.
 */
public class TabViewPager extends FragmentPagerAdapter {

    ArrayList<String> tabTitles = new ArrayList<>(
            Arrays.asList("Kraisorn", "Pattadon", "olo"));

    public TabViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentOne.newIntance();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles.get(position);
    }
}
