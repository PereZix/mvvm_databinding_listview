package com.a2p.mvvm_databinding_listview.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.a2p.mvvm_databinding_listview.R;
import com.a2p.mvvm_databinding_listview.adapter.NoticiasAdapter;
import com.a2p.mvvm_databinding_listview.databinding.ActivityMainBinding;
import com.a2p.mvvm_databinding_listview.viewmodel.NoticiasViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private NoticiasViewModel noticiasViewModel;
    private ArrayList<NoticiasViewModel> arrayListNoticias;
    private NoticiasAdapter noticiasAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        noticiasViewModel = new NoticiasViewModel();
        arrayListNoticias = noticiasViewModel.getArrayListNoticias();
        noticiasAdapter = new NoticiasAdapter(this, arrayListNoticias);
        activityMainBinding.lstview.setAdapter(noticiasAdapter);
    }
}
