package com.leaf.account.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.leaf.account.activity.CoCoinApplication;
import com.leaf.account.fragment.TagViewFragment;
import com.leaf.account.model.RecordManager;
import com.leaf.account.util.CoCoinUtil;

/**
 * Created by 伟平 on 2015/10/20.
 */
public class TagViewFragmentAdapter extends FragmentStatePagerAdapter {

    public TagViewFragmentAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return TagViewFragment.newInstance(i);
    }

    @Override
    public int getCount() {
        return RecordManager.getInstance(CoCoinApplication.getAppContext()).TAGS.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return CoCoinUtil.GetTagName(
                RecordManager.getInstance(CoCoinApplication.getAppContext()).TAGS.get(position % RecordManager.TAGS.size()).getId());
    }
}
