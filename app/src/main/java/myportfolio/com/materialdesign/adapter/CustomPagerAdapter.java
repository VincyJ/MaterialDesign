package myportfolio.com.materialdesign.adapter;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import myportfolio.com.materialdesign.R;
import myportfolio.com.materialdesign.fragment.SubFragmentA;
import myportfolio.com.materialdesign.fragment.SubFragmentB;

/**
 * Created by arputha_v on 3/13/2018.
 */

public class CustomPagerAdapter extends FragmentStatePagerAdapter {

    Activity activity;

    public CustomPagerAdapter(Activity activity, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.activity = activity;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SubFragmentA().newInstance();
            case 1:
                return new SubFragmentB().newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return activity.getString(R.string.fragmenta);
            case 1:
                return activity.getString(R.string.fragmentb);
        }
        return null;
    }
}
