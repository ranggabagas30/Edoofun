package com.example.edoofun;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PembayaranKoin extends AppCompatActivity {

    Button beli, belimateri;
    CardView next1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beli_koin);

        BottomNavigationView bottomNavigationView = findViewById(R.id.btn_nav);

        bottomNavigationView.setSelectedItemId(R.id.keranjang_menu);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home_menu:
                        startActivity(new Intent(getApplicationContext(),
                                HalamanHome.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.keranjang_menu:
                        return true;

                    case R.id.sosial_menu:
                        startActivity(new Intent(getApplicationContext(),
                                sosial.class));
                        overridePendingTransition(0, 0);
                        return true;

                }
                return false;

            }

        });

        beli = findViewById(R.id.beli1);
        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PembayaranKoin.this, ListBeliKoin.class);
                startActivity(i);
            }
        });

        belimateri = findViewById(R.id.beli2);
        belimateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PembayaranKoin.this, ListBeliMateri.class);
                startActivity(i);
            }
        });

        belimateri = findViewById(R.id.beli2);
        belimateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PembayaranKoin.this, ListBeliMateri.class);
                startActivity(i);
            }
        });

        next1 = findViewById(R.id.history);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PembayaranKoin.this, RiwayatPembelian.class);
                startActivity(a);
            }
        });
    }



}

