package com.example.silvanadorantes.navigationviewmaterialdesign.Modelos;

import com.example.silvanadorantes.navigationviewmaterialdesign.R;

import java.util.Arrays;
import java.util.List;

/**
 * Created by silvana on 21/02/16.
 */
public class Outfit {
    private int id;
    private String nombre;
    private int imagen;

    public Outfit(){

    }

    public Outfit(int id, String nombre, int imagen){
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    private static Outfit[] outfits = {
            new Outfit(0,"Outfit Ejecutivo", R.drawable.outfitejecutivo1),
            new Outfit(1,"Outfit Ejecutivo", R.drawable.outfitejecutivo2),
            new Outfit(2,"Outfit Ejecutivo", R.drawable.outfitejecutivo3),
            new Outfit(3,"Outfit Ejecutivo", R.drawable.outfitejecutivo4),
            new Outfit(4,"Outfit Elegante", R.drawable.outfitelegante1),
            new Outfit(5,"Outfit Elegante", R.drawable.outfitelegante2),
            new Outfit(6,"Outfit Elegante", R.drawable.outfitelegante3),
            new Outfit(7,"Outfit Elegante", R.drawable.outfitelegante4),
            new Outfit(8,"Outfit Gala", R.drawable.outfitgala1),
            new Outfit(9,"Outfit Gala", R.drawable.outfitgala2),
            new Outfit(10,"Outfit Gala", R.drawable.outfitgala3),
            new Outfit(11,"Outfit Gala", R.drawable.outfitgala4),
            new Outfit(12,"Outfit Sencillo", R.drawable.outfitsencillo1),
            new Outfit(13,"Outfit Sencillo", R.drawable.outfitsencillo2),
            new Outfit(14,"Outfit Sencillo", R.drawable.outfitsencillo3),
            new Outfit(15,"Outfit Sencillo", R.drawable.outfitsencillo4),
            new Outfit(16,"Outfit Sport", R.drawable.outfitsport1),
            new Outfit(17,"Outfit Sport", R.drawable.outfitsport2),
            new Outfit(18,"Outfit Sport", R.drawable.outfitsport3),
            new Outfit(19,"Outfit Sport", R.drawable.outfitsport4),
            new Outfit(20,"Outfit Trendy", R.drawable.outfittrendy1),
            new Outfit(21,"Outfit Trendy", R.drawable.outfittrendy2),
            new Outfit(22,"Outfit Trendy", R.drawable.outfittrendy3),
            new Outfit(23,"Outfit Trendy", R.drawable.outfittrendy4),
            new Outfit(24,"Outfit Urbano", R.drawable.outfiturbano1),
            new Outfit(25,"Outfit Urbano", R.drawable.outfiturbano2),
            new Outfit(26,"Outfit Urbano", R.drawable.outfiturbano3),
            new Outfit(27,"Outfit Urbano", R.drawable.outfiturbano4),


    };

    private static Outfit[] inicio = {
            new Outfit(0,"Outfit Ejecutivo", R.drawable.outfitejecutivo1),
            new Outfit(1,"Outfit Elegante", R.drawable.outfitelegante1),
            new Outfit(2,"Outfit Gala", R.drawable.outfitgala1),
            new Outfit(3,"Outfit Sencillo", R.drawable.outfitsencillo1),
            new Outfit(4,"Outfit Sport", R.drawable.outfitsport3),
            new Outfit(5,"Outfit Trendy", R.drawable.outfittrendy1),
            new Outfit(6,"Outfit Urbano", R.drawable.outfiturbano2),

    };


    //Obtiene la lista de los Anillos
    public static List<Outfit> getOutfit(){
        return Arrays.asList(outfits);
    }

    //Obtiene un Anillo basado en la posicion del Array
    public static Outfit getOutfitByPosition(int position){
        return outfits[position];
    }

    //Obtiene la lista de los Collares
    public static List<Outfit> getListaInicio(){
        return Arrays.asList(inicio);
    }

    //Obtiene un Collar basado en la posicion del Array
    public static Outfit getOutfitInicioByPosition(int position){
        return inicio[position];
    }
}
