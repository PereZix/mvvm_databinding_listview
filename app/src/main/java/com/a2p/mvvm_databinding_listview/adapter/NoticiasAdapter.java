package com.a2p.mvvm_databinding_listview.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.a2p.mvvm_databinding_listview.R;
import com.a2p.mvvm_databinding_listview.databinding.ItemNoticiasLayoutBinding;
import com.a2p.mvvm_databinding_listview.viewmodel.NoticiasViewModel;

import java.util.ArrayList;

/**
 * Created by alvaro.perez on 05/10/2018.
 */

public class NoticiasAdapter extends ArrayAdapter<NoticiasViewModel> {

    private ArrayList<NoticiasViewModel> noticiasArrayList;
    private Context context;

    public NoticiasAdapter(@NonNull Context context, ArrayList<NoticiasViewModel> arrayListNoticias) {
        super(context, R.layout.item_noticias_layout, arrayListNoticias);
        this.context = context;
        this.noticiasArrayList = arrayListNoticias;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemNoticiasLayoutBinding itemNoticiasLayoutBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_noticias_layout,parent, false);
        itemNoticiasLayoutBinding.setNoticiasLista(noticiasArrayList.get(position));

        return itemNoticiasLayoutBinding.getRoot();
    }
}
