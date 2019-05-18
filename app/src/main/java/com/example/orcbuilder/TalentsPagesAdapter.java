package com.example.orcbuilder;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static com.example.orcbuilder.TalentsActivity.PAGE_COUNT;

public class TalentsPagesAdapter extends FragmentPagerAdapter {

    TalentsPagesAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return TalentsFragment.newInstance(i);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

}
