package com.androidtutorialpoint.cardviewtutorial.BranchFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidtutorialpoint.cardviewtutorial.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Cse_MarksFragment extends Fragment {


    public Cse_MarksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cse__marks, container, false);
    }

}
