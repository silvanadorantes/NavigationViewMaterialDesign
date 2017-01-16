package com.example.silvanadorantes.navigationviewmaterialdesign.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.silvanadorantes.navigationviewmaterialdesign.Adaptadores.InicioAdapter;
import com.example.silvanadorantes.navigationviewmaterialdesign.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InicioFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private InicioAdapter mAdapter;
    private LinearLayoutManager mLinearLayoutManager;




    public InicioFragment() {
        // Required empty public constructor
    }

    public static InicioFragment newInstance(){
        InicioFragment fragment = new InicioFragment();
        fragment.setRetainInstance(true);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inicio, container, false);

        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mAdapter = new InicioAdapter();
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setHasFixedSize(true);

        return view;
    }

}
