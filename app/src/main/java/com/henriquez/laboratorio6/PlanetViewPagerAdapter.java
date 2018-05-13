package com.henriquez.laboratorio6;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UCA on 07/05/2018.
 */

public class PlanetViewPagerAdapter extends FragmentPagerAdapter{
    List<String> titleList;
    private List<Fragment> fragmentList;

    public PlanetViewPagerAdapter(FragmentManager fm) {
        super(fm);
        titleList = new ArrayList<>();
        fragmentList = new ArrayList<>();
    }


    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }

    public void addItem(String title, Fragment fragment){
        titleList.add(title);
        fragmentList.add(fragment);
    }
}
