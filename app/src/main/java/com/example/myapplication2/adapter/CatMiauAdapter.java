package com.example.myapplication2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.myapplication2.R;
import com.example.myapplication2.model.CatMiau;

import java.util.List;

public class CatMiauAdapter extends RecyclerView.Adapter<CatMiauViewHolder> {

    public List<CatMiau> catMauiList;

    public CatMiauAdapter(List<CatMiau> catMauiList){
        this.catMauiList = catMauiList;
    }


    @NonNull
    @Override
    public CatMiauViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_details_cat_miau, parent, false);
        return new CatMiauViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CatMiauViewHolder holder, int position){

        if(catMauiList != null && position < catMauiList.size()){
            CatMiau catMiau = catMauiList.get(position);
            holder.cat_miau_image.setImageResource(catMiau.getMiau_imageUrl());
            holder.cat_miau_name.setText(catMiau.getMiau_name());
        }

    }

    @Override
    public int getItemCount(){
        return catMauiList.size();
    }



}
