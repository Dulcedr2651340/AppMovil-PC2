package com.example.myapplication2.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.R;

public class CatMiauViewHolder extends RecyclerView.ViewHolder {

    public ImageView cat_miau_image;
    public TextView cat_miau_name;

    public CatMiauViewHolder(@NonNull View itemView) {
        super(itemView);

        cat_miau_image = itemView.findViewById(R.id.image_cat_miau);
        cat_miau_name = itemView.findViewById(R.id.name_cat_miau);
    }
}
