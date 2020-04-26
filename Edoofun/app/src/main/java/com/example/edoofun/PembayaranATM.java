package com.example.edoofun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PembayaranATM extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapterATM myAdapterATM;
    ImageView back1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pembayaran_atm);


        mRecyclerView = findViewById(R.id.recyclerView3);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapterATM = new MyAdapterATM(this, getMyList());
        mRecyclerView.setAdapter(myAdapterATM);

        back1 = findViewById(R.id.back);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PembayaranATM.this, AnotherActivity.class);
                startActivity(a);
            }


        });
    }

    private ArrayList<Model1> getMyList() {

        ArrayList<Model1> models = new ArrayList<>();

        Model1 m = new Model1();
        m.setTitle("Mandiri");
        m.setImg(R.drawable.ic_mandir);
        models.add(m);

        m = new Model1();
        m.setTitle("BCA");
        m.setImg(R.drawable.ic_bca);
        models.add(m);

        return models;

    }
}
