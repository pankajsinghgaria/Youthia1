package com.youthia.youthia.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.youthia.youthia.Fragments.ChatFragment;
import com.youthia.youthia.Fragments.ContactsFragment;
import com.youthia.youthia.Fragments.PostFragment;

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
                return new PostFragment();
            case 1:
                return new ContactsFragment();
            case 2:
                return new ChatFragment();
            default:
                return new PostFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
