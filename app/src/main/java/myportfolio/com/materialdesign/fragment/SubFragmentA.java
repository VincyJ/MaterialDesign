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
public class SubFragmentA extends Fragment {


    public SubFragmentA() {
        // Required empty public constructor
    }

    public SubFragmentA newInstance() {
        return new SubFragmentA();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sub, container, false);
    }

}
