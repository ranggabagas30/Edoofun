package com.example.edoofun;

import androidx.annotation.RequiresApi;

import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class KomunitasActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komunitas);

        ImageView imageView27 = (ImageView) findViewById(R.id.imageView2);
        imageView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toMancing();
            }
        });

        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toBersepeda();
            }
        });

        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toMenyanyi();
            }
        });



    }

    public void toMancing() {
        Intent intent = new Intent(this, GrupmancingActivity.class);
        startActivity(intent);
    }

    public void toBersepeda() {
        Intent intent = new Intent(this, GrupbersepedaActivity.class);
        startActivity(intent);
    }

    public void toMenyanyi() {
        Intent intent = new Intent(this, KomunitasMenyanyiActivity.class);
        startActivity(intent);
    }


}
