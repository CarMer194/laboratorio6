package com.henriquez.laboratorio6;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    public PlanetsListAdapter(Context mCtx, ArrayList<Planeta> planetList ) {
        this.planetList = planetList;
        this.mCtx = mCtx;
    }

    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =  LayoutInflater.from(mCtx);
        View v = inflater.inflate(R.layout.planet_list_item,null);
        return new PlanetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        holder.nombre.setText(planetList.get(position).getNombre());
        holder.informacion.setText(planetList.get(position).getInformacion());
        String temp = planetList.get(position).getImagen();


    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }

    protected class PlanetViewHolder extends RecyclerView.ViewHolder{
        TextView nombre,informacion;
        ImageView imagen;



        public PlanetViewHolder(View itemView)
        {
            super(itemView);
            nombre = itemView.findViewById(R.id.texto);
            informacion=itemView.findViewById(R.id.texto2);
            imagen = itemView.findViewById(R.id.imagen);
        }
    }
}
