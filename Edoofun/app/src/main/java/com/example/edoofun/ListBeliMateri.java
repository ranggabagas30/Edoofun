package com.example.edoofun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListBeliMateri extends AppCompatActivity {
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    ImageView back1;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_materi);

        mRecyclerView = findViewById(R.id.recyclerView2);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

        back1 = findViewById(R.id.back);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(ListBeliMateri.this, PembayaranKoin.class);
                startActivity(a);
            }


        });
    }
    private ArrayList<Model1> getMyList() {

        ArrayList<Model1> models = new ArrayList<>();

        Model1 m = new Model1();
        m.setTitle("Menyanyi");
        m.setDescription("Singing");
        m.setImg(R.drawable.ic_nyanyi);
        models.add(m);

        m = new Model1();
        m.setTitle("Memancing");
        m.setDescription("Fishing");
        m.setImg(R.drawable.ic_rafting);
        models.add(m);

        m = new Model1();
        m.setTitle("Memasak");
        m.setDescription("Cooking");
        m.setImg(R.drawable.ic_cooking);
        models.add(m);

        m = new Model1();
        m.setTitle("Bela Diri");
        m.setDescription("Self Defense");
        m.setImg(R.drawable.ic_beladiri);
        models.add(m);

        m = new Model1();
        m.setTitle("Olahraga");
        m.setDescription("Sports");
        m.setImg(R.drawable.ic_sports);
        models.add(m);

        m = new Model1();
        m.setTitle("Menari");
        m.setDescription("Dance");
        m.setImg(R.drawable.ic_tari);
        models.add(m);

        m = new Model1();
        m.setTitle("Seni Drama");
        m.setDescription("Drama Arts");
        m.setImg(R.drawable.ic_art);
        models.add(m);

        return models;
    }}
