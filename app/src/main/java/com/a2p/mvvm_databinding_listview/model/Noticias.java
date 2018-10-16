package com.a2p.mvvm_databinding_listview.model;

/**
 * Created by alvaro.perez on 05/10/2018.
 */

public class Noticias {
    private String titulo;
    private String descripcion;

    public Noticias(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
