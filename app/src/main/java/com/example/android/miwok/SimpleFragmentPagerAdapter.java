package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Toby on 01/07/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    public SimpleFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        if(position==0){
            return new NumbersFragment();
        } else if(position==1){
            return new ColorsFragment();
        } else if(position==2){
            return new FamilyFragment();
        }else  {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount(){
        return 4;
    }

}
