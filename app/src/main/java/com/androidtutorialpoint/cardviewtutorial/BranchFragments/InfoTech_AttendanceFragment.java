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
public class InfoTech_AttendanceFragment extends Fragment {


    public InfoTech_AttendanceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_tech__attendance, container, false);
    }

}
