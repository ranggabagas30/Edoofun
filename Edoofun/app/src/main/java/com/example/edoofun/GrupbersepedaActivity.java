package com.example.edoofun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GrupbersepedaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupbersepeda);

        ImageView ivBack = findViewById(R.id.ivBack);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView ivBaner = findViewById(R.id.ivBaner);
        TextView tvJudul = findViewById(R.id.tvJudul);

        int image = getIntent().getIntExtra("image", 0);

        ivBaner.setImageResource(image);
        tvJudul.setText(getIntent().getStringExtra("judul"));
    }

}