package com.example.edoofun;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<Holder> {
    Context c;
    ArrayList<ItemObject> itemObjects;

    public RecyclerViewAdapter(Context c, ArrayList<ItemObject>itemObjects){
        this.c = c;
        this.itemObjects = itemObjects;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.kategori_detail, null);


        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i){
        holder.txt_judul.setText(itemObjects.get(i).getStrJudul());
        holder.img_icon.setImageResource(itemObjects.get(i).getTrgambar());


    }

    @Override
    public int getItemCount(){
        return itemObjects.size();
    }
}
