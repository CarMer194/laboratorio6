package com.henriquez.laboratorio6;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UCA on 07/05/2018.
 */

public class PlanetsListAdapter extends RecyclerView.Adapter<PlanetsListAdapter.PlanetViewHolder> {
    ArrayList<Planeta> planetList;
    Context mCtx;
    ArrayList<Planeta> aux;
    boolean favorito=false;

    public PlanetsListAdapter(Context mCtx, ArrayList<Planeta> planetList, ArrayList<Planeta> aux ) {
        this.planetList = planetList;
        this.mCtx = mCtx;
        this.aux = aux;
        System.out.println("aux en adapter "+aux.size());
    }

    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =  LayoutInflater.from(mCtx);
        View v = inflater.inflate(R.layout.planet_list_item,null);
        return new PlanetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, final int position) {
        holder.nombre.setText(aux.get(position).getNombre());
        System.out.println("este es el nombre"+ aux.get(position).getNombre());
        holder.informacion.setText(aux.get(position).getInformacion());
        String temp = planetList.get(position).getImagen();
        holder.boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("clic en: "+ position);
                planetList.get(position).setFavorito();
                System.out.println(planetList.get(position).isFavorito()+" es");
            }
        });



    }

    @Override
    public int getItemCount() {
        return aux.size();
    }

    protected class PlanetViewHolder extends RecyclerView.ViewHolder{
        TextView nombre,informacion;
        ImageView imagen;
        ImageButton boton;


        public PlanetViewHolder(View itemView)
        {
            super(itemView);
            nombre = itemView.findViewById(R.id.texto);
            informacion=itemView.findViewById(R.id.texto2);
            imagen = itemView.findViewById(R.id.imagen);
            boton = itemView.findViewById(R.id.botonest);
        }
    }


}
