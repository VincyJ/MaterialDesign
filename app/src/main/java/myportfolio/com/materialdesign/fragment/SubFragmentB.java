package myportfolio.com.materialdesign.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import myportfolio.com.materialdesign.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SubFragmentB extends Fragment {


    public SubFragmentB() {
        // Required empty public constructor
    }

    public SubFragmentB newInstance() {
        return new SubFragmentB();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sub_fragment_b, container, false);
    }

}
