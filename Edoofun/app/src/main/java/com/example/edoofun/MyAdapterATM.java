package com.example.edoofun;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Random;

public class MyAdapterATM extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<Model1> models;

    public MyAdapterATM(Context c, ArrayList<Model1> models) {
        this.c = c;
        this.models = models;
    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder (@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_itemkategori2, null);
        return new MyHolder(view);

    }
    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, int i) {

        myHolder.mTitle.setText(models.get(i).getTitle());
        myHolder.mImageView.setImageResource(models.get(i).getImg());



        myHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {

                    BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImageView.getDrawable();

                    Bitmap bitmap = bitmapDrawable.getBitmap();

                    ByteArrayOutputStream stream = new ByteArrayOutputStream();

                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);

                    byte[] bytes = stream.toByteArray();

                    Intent intent = new Intent(c, tutorialpembayaran.class);
                    intent.putExtra("iImage", bytes);
                    c.startActivity(intent);
                }
        });

    }

    public static String getRandomString(int i){
        final String characters = "ab1265327z012345678";
        StringBuilder result = new StringBuilder();
        while (i > 0){
            Random rand = new Random();
            result.append(characters.charAt(rand.nextInt(characters.length())));
            i--;
        }
        return result.toString();
    }

    @Override
    public int getItemCount(){
        return models.size();
    }
}



