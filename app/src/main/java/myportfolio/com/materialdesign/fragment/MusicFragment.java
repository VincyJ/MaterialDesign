package myportfolio.com.materialdesign.fragment;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import myportfolio.com.materialdesign.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MusicFragment extends Fragment {


    public MusicFragment() {
        // Required empty public constructor
    }

    public MusicFragment newInstance() {
        return new MusicFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_music, container, false);
    }

}
