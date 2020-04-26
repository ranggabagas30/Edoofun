package com.example.edoofun;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class pilihan_minat extends AppCompatActivity {

    ImageButton btnarrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilihan_minat);

        btnarrow = findViewById(R.id.btn_arrow);
        btnarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pilihan_minat.this, HalamanHome.class);
                startActivity(i);
            }
        });


    }
}
