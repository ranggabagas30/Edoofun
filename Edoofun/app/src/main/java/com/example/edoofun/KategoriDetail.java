package com.example.edoofun;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class KategoriDetail extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private LinearLayoutManager LinearLayoutManager;
    private List<ItemObject> itemObjects;
    RecyclerViewAdapter adapter;


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kategori_detail);

        mRecyclerView = findViewById(R.id.list_detailkategori);

        LinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(LinearLayoutManager);

        adapter = new RecyclerViewAdapter(this, getMyList());
        mRecyclerView.setAdapter(adapter);


    }
    private ArrayList<ItemObject> getMyList(){
        ArrayList<ItemObject> itemObjects = new ArrayList<>();

        ItemObject n = new ItemObject();
        n.setStrJudul("Basket");
        n.setTrgambar(R.drawable.ic_basket);
        itemObjects.add(n);

        n = new ItemObject();
        n.setStrJudul("Memasak");
        n.setTrgambar(R.drawable.ic_cooking);
        itemObjects.add(n);

        n = new ItemObject();
        n.setStrJudul("Bowling");
        n.setTrgambar(R.drawable.ic_bowling);
        itemObjects.add(n);

        return itemObjects;


    }}
