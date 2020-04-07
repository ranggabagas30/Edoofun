package com.example.edoofun;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {
    TextView txt_judul;
    ImageView img_icon;

    public Holder(View itemView) {
        super(itemView);

        this.img_icon = itemView.findViewById(R.id.icon);
        this.txt_judul = itemView.findViewById(R.id.title_item);


    }
}
