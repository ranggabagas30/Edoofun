package com.example.edoofun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class pesan_baru  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesan_baru);
    }


    public void LaunchIsiDM(View view) {
        Intent intent = new Intent(this, isi_pesan.class);
        startActivity(intent);
    }
}