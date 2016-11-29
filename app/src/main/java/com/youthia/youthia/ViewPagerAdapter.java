package com.youthia.youthia;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by garia on 21-11-2016.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ChatFragment();
            case 1:
                return new ContactsFragment();
            case 2:
                return new PostFragment();
            default:
                return new ChatFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
