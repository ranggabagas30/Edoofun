package com.example.edoofun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AnnouncementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcement);

        TextView tvNama = findViewById(R.id.tvNama);
        TextView tvJudul = findViewById(R.id.tvJudul);

        String nama = getIntent().getStringExtra("name");
        String judul = getIntent().getStringExtra("judul");

        tvNama.setText(nama);
        tvJudul.setText(judul);


        ImageView ivBack = findViewById(R.id.ivBack);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

            }

        }
