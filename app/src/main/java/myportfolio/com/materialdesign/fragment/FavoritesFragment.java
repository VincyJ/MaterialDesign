package myportfolio.com.materialdesign.fragment;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import myportfolio.com.materialdesign.R;
import myportfolio.com.materialdesign.adapter.CustomPagerAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritesFragment extends Fragment {


    public FavoritesFragment() {
        // Required empty public constructor
    }

    public FavoritesFragment newInstance() {
        return new FavoritesFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return initializeView(inflater.inflate(R.layout.fragment_favorites, container, false));
    }

    private View initializeView(View view) {

        TabLayout mTabLayout = view.findViewById(R.id.tab_layout);

        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.view_pager);
        mViewPager.setAdapter(new CustomPagerAdapter(getActivity(), getActivity().getSupportFragmentManager()));

        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }

}
