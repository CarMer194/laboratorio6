package com.henriquez.laboratorio6;

/**
 * Created by UCA on 07/05/2018.
 */

public class Planeta  {
    private String nombre;
    private String imagen;
    private String informacion;
    private String ruta;
    boolean favorito;

    public Planeta() {
    }

    public Planeta(String nombre, String imagen, String informacion) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.informacion = informacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setFavorito() {
        if (favorito){
            favorito=false;
        }
        else {
            favorito=true;
        }
    }
    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean fav){
        this.favorito=fav;
    }
}
