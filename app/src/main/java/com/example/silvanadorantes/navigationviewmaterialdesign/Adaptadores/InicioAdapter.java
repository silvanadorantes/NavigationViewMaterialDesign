package com.example.silvanadorantes.navigationviewmaterialdesign.Adaptadores;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.silvanadorantes.navigationviewmaterialdesign.Modelos.Outfit;
import com.example.silvanadorantes.navigationviewmaterialdesign.R;

import java.util.List;

/**
 * Created by silvana on 21/02/16.
 */
public class InicioAdapter extends RecyclerView.Adapter<InicioAdapter.ViewHolder>{
    private LayoutInflater mLayoutInflater;
    private List<Outfit> mItems;
    private Context mContext;

    public InicioAdapter(){

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView mImagen;
        private TextView mNombre;


        public ViewHolder (View itemView){
            super(itemView);
            mImagen = (ImageView) itemView.findViewById(R.id.image_outfit);
            mNombre = (TextView) itemView.findViewById(R.id.nombre_outfit);

        }

        public void setImagen(int imagen) {
            mImagen.setTag(imagen);
            mImagen.setImageResource(imagen);
        }

        public void setNombre(String text){
            mNombre.setText(text);
        }

    }

    @Override
    public int getItemCount() {
        return Outfit.getListaInicio().size();
    }

    public void add(Outfit outfit){
        mItems.add(outfit);
        notifyItemInserted(mItems.indexOf(outfit));
    }

    public void remove(Outfit outfit){
        int position = mItems.indexOf(outfit);
        if (position != -1){
            mItems.remove(position);
            notifyItemRemoved(position);
        }

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = mLayoutInflater.from(parent.getContext())
                .inflate(R.layout.inicio_item_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        Outfit item = Outfit.getListaInicio().get(i);

        holder.mNombre.setText(item.getNombre());
        Glide.with(holder.mImagen.getContext())
                .load(item.getImagen())
                .centerCrop()
                .into(holder.mImagen);


    }
}
