package com.example.edoofun;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class ListBeliKoin extends AppCompatActivity {
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    ImageView back1;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_koin);



        mRecyclerView = findViewById(R.id.recyclerView1);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

        back1 = findViewById(R.id.back);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(ListBeliKoin.this, PembayaranKoin.class);
                startActivity(a);
            }


        });





    }
    private ArrayList<Model1> getMyList() {

        ArrayList<Model1> models = new ArrayList<>();

        Model1 m = new Model1();
        m.setTitle("Rp 35.000");
        m.setDescription("100 KOIN");
        m.setImg(R.drawable.koin);
        models.add(m);


        m = new Model1();
        m.setTitle("Rp 60.000");
        m.setDescription("250 KOIN");
        m.setImg(R.drawable.koin);
        models.add(m);

        m = new Model1();
        m.setTitle("Rp 100.000");
        m.setDescription("400 KOIN");
        m.setImg(R.drawable.koin);
        models.add(m);

        m = new Model1();
        m.setTitle("Rp 200.000");
        m.setDescription("700 KOIN");
        m.setImg(R.drawable.koin);
        models.add(m);

        m = new Model1();
        m.setTitle("Rp 500.000");
        m.setDescription("1000 KOIN");
        m.setImg(R.drawable.koin);
        models.add(m);

        m = new Model1();
        m.setTitle("Rp 1.230.000");
        m.setDescription("2500 KOIN");
        m.setImg(R.drawable.koin);
        models.add(m);


        return models;
    }

}
