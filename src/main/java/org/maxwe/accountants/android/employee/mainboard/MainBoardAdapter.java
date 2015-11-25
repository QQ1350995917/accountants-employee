package org.maxwe.accountants.android.employee.mainboard;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.LinkedList;

/**
 * Created by Pengwei Ding on 2015-11-23 23:21.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class MainBoardAdapter extends FragmentPagerAdapter {

    private LinkedList<Fragment> fragments;

    public MainBoardAdapter(FragmentManager fragmentManager, LinkedList<Fragment> fragments) {
        super(fragmentManager);
        this.fragments = fragments;
    }

    @Override
    public int getCount() {
        return this.fragments == null ? 0 : this.fragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments == null ? null : this.fragments.get(position);
    }
}
