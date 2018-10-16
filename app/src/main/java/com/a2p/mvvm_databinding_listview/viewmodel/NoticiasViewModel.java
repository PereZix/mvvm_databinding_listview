package com.a2p.mvvm_databinding_listview.viewmodel;

import com.a2p.mvvm_databinding_listview.model.Noticias;

import java.util.ArrayList;

/**
 * Created by alvaro.perez on 05/10/2018.
 */

public class NoticiasViewModel {
    private String titulo;
    private String descripcion;

    public NoticiasViewModel(Noticias noticias){
        this.titulo = noticias.getTitulo();
        this.descripcion = noticias.getDescripcion();
    }

    public NoticiasViewModel() {
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

    public ArrayList<NoticiasViewModel> getArrayListNoticias(){
        ArrayList<NoticiasViewModel> arrayListNoticias = new ArrayList<>();
        arrayListNoticias.add(new NoticiasViewModel(new Noticias("Noticia 1","Descripcion 1")));
        arrayListNoticias.add(new NoticiasViewModel(new Noticias("Noticia 2","Descripcion 2")));
        arrayListNoticias.add(new NoticiasViewModel(new Noticias("Noticia 3","Descripcion 3")));
        arrayListNoticias.add(new NoticiasViewModel(new Noticias("Noticia 4","Descripcion 4")));
        arrayListNoticias.add(new NoticiasViewModel(new Noticias("Noticia 5","Descripcion 5")));

        return arrayListNoticias;
    }
}
