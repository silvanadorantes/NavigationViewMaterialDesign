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
public class CerrarSesionFragment extends Fragment {


    public CerrarSesionFragment() {
        // Required empty public constructor
    }

    public static CerrarSesionFragment newInstance(){
        CerrarSesionFragment fragment = new CerrarSesionFragment();
        fragment.setRetainInstance(true);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cerrar_sesion, container, false);
        return view;
    }

}
