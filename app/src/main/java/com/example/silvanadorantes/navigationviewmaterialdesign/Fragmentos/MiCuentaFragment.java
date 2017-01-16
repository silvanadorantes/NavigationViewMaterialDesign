package com.example.silvanadorantes.navigationviewmaterialdesign.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.silvanadorantes.navigationviewmaterialdesign.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MiCuentaFragment extends Fragment {


    public MiCuentaFragment() {
        // Required empty public constructor
    }

    public static MiCuentaFragment newInstance(){
        MiCuentaFragment fragment = new MiCuentaFragment();
        fragment.setRetainInstance(true);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mi_cuenta, container, false);

        return view;
    }

}
