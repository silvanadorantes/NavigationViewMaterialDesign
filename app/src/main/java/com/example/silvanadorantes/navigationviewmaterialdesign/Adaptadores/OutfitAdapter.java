package com.example.silvanadorantes.navigationviewmaterialdesign.Adaptadores;

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
public class OutfitAdapter extends RecyclerView.Adapter<OutfitAdapter.ViewHolder>{

    private List<Outfit> mItems;
    private OnItemClickListener listener;

    public interface OnItemClickListener{
        public void onClick(OutfitAdapter.ViewHolder viewHolder, int idOutfit);
    }

    public OutfitAdapter(List<Outfit> mItems, OnItemClickListener listener){
        this.mItems = mItems;
        this.listener = listener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView nombre;
        private ImageView imagen;

        public ViewHolder(View v){
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imagenOufits);
            nombre = (TextView) v.findViewById(R.id.nombreOutfits);
            v.setOnClickListener(this);
            imagen.setOnClickListener(this);

        }

        public void setNombre(String text) {
            nombre.setText(text);
        }



        public void setImage(int image) {
            imagen.setTag(image);
            imagen.setImageResource(image);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(this, getIdOutfit(getAdapterPosition()));
        }


    }

    private int getIdOutfit(int position){
        if (position != RecyclerView.NO_POSITION){
            return mItems.get(position).getId();
        } else {
            return -1;
        }
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

    public void clear(){
        mItems.clear();
        notifyDataSetChanged();

    }



    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.outfit_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Outfit item = mItems.get(position);
        Glide.with(holder.itemView.getContext())
                .load(item.getImagen())
                .centerCrop()
                .into(holder.imagen);
        holder.setNombre(item.getNombre());

    }
}
