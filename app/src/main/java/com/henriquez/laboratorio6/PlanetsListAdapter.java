package com.henriquez.laboratorio6;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by UCA on 07/05/2018.
 */

public class PlanetsListAdapter extends RecyclerView.Adapter<PlanetsListAdapter.PlanetViewHolder> {
    List<Planeta> planetList;


    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }

    protected class PlanetViewHolder extends RecyclerView.ViewHolder{

        public PlanetViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
