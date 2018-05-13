package com.henriquez.laboratorio6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carlos on 22/4/2018.
 */

public class Listas {
    List<Planeta> planetaList;
    List<Planeta> listAUX;
    boolean favorito;

    public Listas() {
        planetaList = fillList();
        listAUX = fillList();

    }

    public ArrayList<Planeta> fillList(){
        ArrayList<Planeta> list = new ArrayList<>();
        list.add(new Planeta("Tierra","tierra","la tierra el planeta en que vivimos"));
        list.add(new Planeta("marte","marte","el planeta rojo"));
        list.add(new Planeta("venus","venus","segundo planeta del sistema solar"));

        return list;
    }

    public List<Planeta> getPlanetaList() {
        return planetaList;
    }

    public void setPlanetaList(List<Planeta> planetaList) {
        this.planetaList = planetaList;
    }

    public List<Planeta> getListAUX() {
        return listAUX;
    }

    public void setListAUX(List<Planeta> listAUX) {
        System.out.println("se seteo");
        this.listAUX = listAUX;
        System.out.println("info de aux: "+this.listAUX.get(0).getNombre());
    }

    public void capturarFavsAux(){
        for (int i=0; i<planetaList.size();i++){
            if (planetaList.get(i).isFavorito()){
                listAUX.get(i).setFavorito(true);
            }
            else {
                listAUX.get(i).setFavorito(false);
            }
        }
    }

    public void reconstruirLista(){
        planetaList = fillList();
        for (int i=0;i<listAUX.size();i++){
            if (listAUX.get(i).isFavorito()){
                planetaList.get(i).setFavorito(true);
            }
            else{
                planetaList.get(i).setFavorito(false);
            }
        }
    }

}
