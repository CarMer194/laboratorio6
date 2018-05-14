package com.henriquez.laboratorio6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by UCA on 07/05/2018.
 */

public class PlanetsFragment extends Fragment implements PlanetViewPagerAdapter.FragmentLifeCycle{
    RecyclerView recyclerView;
    ArrayList<Planeta> planetList;
    PlanetsListAdapter planetsListAdapter;

    public PlanetsFragment(ArrayList<Planeta> planetList) {
        this.planetList = planetList;
    }

    public PlanetsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.planet_list,container,false);
        System.out.println("planeta"+planetList.get(0).getNombre());

        planetsListAdapter = new PlanetsListAdapter(getContext(),planetList);

        recyclerView=view.findViewById(R.id.recycler1);
        recyclerView.setAdapter(planetsListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        return view;
    }

    @Override
    public void onPauseFragment() {

    }

    @Override
    public void onResumeFragment() {

    }
}
