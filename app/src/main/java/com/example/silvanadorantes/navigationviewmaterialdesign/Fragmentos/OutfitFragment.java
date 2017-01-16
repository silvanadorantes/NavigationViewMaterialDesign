package com.example.silvanadorantes.navigationviewmaterialdesign.Fragmentos;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.silvanadorantes.navigationviewmaterialdesign.Adaptadores.OutfitAdapter;
import com.example.silvanadorantes.navigationviewmaterialdesign.Modelos.Outfit;
import com.example.silvanadorantes.navigationviewmaterialdesign.OutfitDetailActivity;
import com.example.silvanadorantes.navigationviewmaterialdesign.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OutfitFragment extends Fragment implements OutfitAdapter.OnItemClickListener{
    private RecyclerView mRecyclerView;
    private GridLayoutManager gridLayoutManager;
    private OutfitAdapter mOutfitAdapter;


    public OutfitFragment() {
        // Required empty public constructor
    }

    public static OutfitFragment newInstance(){
        OutfitFragment fragment = new OutfitFragment();
        fragment.setRetainInstance(true);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_outfit, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerOutfit);
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mOutfitAdapter = new OutfitAdapter(Outfit.getOutfit(), this);
        mRecyclerView.setAdapter(mOutfitAdapter);


        return view;
    }

    @Override
    public void onClick(OutfitAdapter.ViewHolder viewHolder, int idOutfit) {
        Intent intent = new Intent(getActivity(), OutfitDetailActivity.class);
        intent.putExtra(OutfitDetailActivity.ID_OUTFIT, idOutfit);
        startActivity(intent);

    }
}
