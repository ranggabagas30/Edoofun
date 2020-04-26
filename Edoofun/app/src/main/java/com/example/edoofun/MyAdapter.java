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

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<Model1> models;

    public MyAdapter(Context c, ArrayList<Model1> models) {
        this.c = c;
        this.models = models;
    }



    @NonNull
    @Override
    public MyHolder onCreateViewHolder (@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_itemkategori, null);
        return new MyHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, int i) {

        myHolder.mTitle.setText(models.get(i).getTitle());
        myHolder.mDes.setText(models.get(i).getDescription());
        myHolder.mImageView.setImageResource(models.get(i).getImg());


        myHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                if(models.get(position).getTitle().equals("Rp 35.000")) {
                    String gTitle = models.get(position).getTitle();
                    String gDesc = models.get(position).getDescription();
                    BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImageView.getDrawable();

                    Bitmap bitmap = bitmapDrawable.getBitmap();

                    ByteArrayOutputStream stream = new ByteArrayOutputStream();

                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);

                    byte[] bytes = stream.toByteArray();

                Intent intent = new Intent(c, AnotherActivity.class);
                intent.putExtra("iTitle", gTitle);
                intent.putExtra("iDesc", gDesc);
                intent.putExtra("iImage", bytes);
                c.startActivity(intent);
            }
                if(models.get(position).getTitle().equals("Rp 60.000")) {
                    String gTitle = models.get(position).getTitle();
                    String gDesc = models.get(position).getDescription();
                    BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImageView.getDrawable();

                    Bitmap bitmap = bitmapDrawable.getBitmap();

                    ByteArrayOutputStream stream = new ByteArrayOutputStream();

                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);

                    byte[] bytes = stream.toByteArray();

                    Intent intent = new Intent(c, AnotherActivity.class);
                    intent.putExtra("iTitle", gTitle);
                    intent.putExtra("iDesc", gDesc);
                    intent.putExtra("iImage", bytes);
                    c.startActivity(intent);
                }
                if(models.get(position).getTitle().equals("Rp 100.000")) {
                    String gTitle = models.get(position).getTitle();
                    String gDesc = models.get(position).getDescription();
                    BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImageView.getDrawable();

                    Bitmap bitmap = bitmapDrawable.getBitmap();

                    ByteArrayOutputStream stream = new ByteArrayOutputStream();

                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);

                    byte[] bytes = stream.toByteArray();

                    Intent intent = new Intent(c, AnotherActivity.class);
                    intent.putExtra("iTitle", gTitle);
                    intent.putExtra("iDesc", gDesc);
                    intent.putExtra("iImage", bytes);
                    c.startActivity(intent);
                }
                if(models.get(position).getTitle().equals("Rp 200.000")) {
                    String gTitle = models.get(position).getTitle();
                    String gDesc = models.get(position).getDescription();
                    BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImageView.getDrawable();

                    Bitmap bitmap = bitmapDrawable.getBitmap();

                    ByteArrayOutputStream stream = new ByteArrayOutputStream();

                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);

                    byte[] bytes = stream.toByteArray();

                    Intent intent = new Intent(c, AnotherActivity.class);
                    intent.putExtra("iTitle", gTitle);
                    intent.putExtra("iDesc", gDesc);
                    intent.putExtra("iImage", bytes);
                    c.startActivity(intent);
                }
                if(models.get(position).getTitle().equals("Rp 500.000")) {
                    String gTitle = models.get(position).getTitle();
                    String gDesc = models.get(position).getDescription();
                    BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImageView.getDrawable();

                    Bitmap bitmap = bitmapDrawable.getBitmap();

                    ByteArrayOutputStream stream = new ByteArrayOutputStream();

                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);

                    byte[] bytes = stream.toByteArray();

                    Intent intent = new Intent(c, AnotherActivity.class);
                    intent.putExtra("iTitle", gTitle);
                    intent.putExtra("iDesc", gDesc);
                    intent.putExtra("iImage", bytes);
                    c.startActivity(intent);
                }
                if(models.get(position).getTitle().equals("Rp 1.230.000")) {
                    String gTitle = models.get(position).getTitle();
                    String gDesc = models.get(position).getDescription();
                    BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImageView.getDrawable();

                    Bitmap bitmap = bitmapDrawable.getBitmap();

                    ByteArrayOutputStream stream = new ByteArrayOutputStream();

                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);

                    byte[] bytes = stream.toByteArray();

                    Intent intent = new Intent(c, AnotherActivity.class);
                    intent.putExtra("iTitle", gTitle);
                    intent.putExtra("iDesc", gDesc);
                    intent.putExtra("iImage", bytes);
                    c.startActivity(intent);
                }
                if(models.get(position).getTitle().equals("Menyanyi")){
                    Intent intent = new Intent(c, Pembelianmateri.class);
                    c.startActivity(intent);

                }
                if(models.get(position).getTitle().equals("Memancing")){
                    Intent intent = new Intent(c, materi_detail.class);
                    c.startActivity(intent);

                }
                if(models.get(position).getTitle().equals("Bela Diri")){

                    Intent intent = new Intent(c, materi_detail.class);
                    c.startActivity(intent);

                }
                if(models.get(position).getTitle().equals("Olahraga")){

                    Intent intent = new Intent(c, materi_detail.class);
                    c.startActivity(intent);

                }
                if(models.get(position).getTitle().equals("Menari")){

                    Intent intent = new Intent(c, materi_detail.class);
                    c.startActivity(intent);

                }
                if(models.get(position).getTitle().equals("Seni Drama")){

                    Intent intent = new Intent(c, materi_detail.class);
                    c.startActivity(intent);

                }
                if(models.get(position).getTitle().equals("Memasak")){

                    Intent intent = new Intent(c, materi_detail.class);
                    c.startActivity(intent);

                }







            }
        });

    }

    @Override
    public int getItemCount(){
        return models.size();
    }
}
