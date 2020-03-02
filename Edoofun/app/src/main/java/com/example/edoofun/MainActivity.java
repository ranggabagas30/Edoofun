package com.example.edoofun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beli_koin);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setLogo(R.drawable.ic_dehaze);

    }
}
