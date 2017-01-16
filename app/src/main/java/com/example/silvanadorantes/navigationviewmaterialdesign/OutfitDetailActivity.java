package com.example.silvanadorantes.navigationviewmaterialdesign;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.silvanadorantes.navigationviewmaterialdesign.Modelos.Outfit;

public class OutfitDetailActivity extends AppCompatActivity {

    public static final String ID_OUTFIT = "com.example.silvanadorantes.navigationviewmaterialdesign.extra.idOutfit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oufit_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });



        // Se obtiene la posición del item seleccionado
        int position = getIntent().getIntExtra(ID_OUTFIT, -1);
        ImageView imagenDetail = (ImageView) findViewById(R.id.imagen_detalle);
        Outfit outfitDetalle = Outfit.getOutfitByPosition(position);
        Glide.with(this).load(outfitDetalle.getImagen()).asBitmap().centerCrop().into(imagenDetail);




    }

}
