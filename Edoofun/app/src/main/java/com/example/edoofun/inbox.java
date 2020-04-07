package com.example.edoofun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class inbox  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inbox);
    }

    public void LaunchNewDM(View view) {
        Intent intent = new Intent(this, pesan_baru.class);
        startActivity(intent);
    }
}
