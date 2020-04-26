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

        ImageView ivMemancing = (ImageView) findViewById(R.id.ivMemancing);
        ivMemancing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toMancing();
            }
        });

        ImageView ivBersepeda = (ImageView) findViewById(R.id.ivBersepeda);
        ivBersepeda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toComingSoon(R.mipmap.minat_bersepeda_foreground, "Komunitas Bersepeda");
            }
        });

        ImageView ivMenyanyi = (ImageView) findViewById(R.id.ivMenyanyi);
        ivMenyanyi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toMenyanyi();
            }
        });

        ImageView ivGitar = findViewById(R.id.ivGitar);
        ivGitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toComingSoon(R.mipmap.minat_gitar_foreground, "Komunitas Gitar Lovers");
            }
        });

        ImageView ivMenjahit = (ImageView) findViewById(R.id.ivMenjahit);
        ivMenjahit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toComingSoon(R.mipmap.minat_menjahit_foreground, "Komunitas Menjahit");
            }
        });

        ImageView ivDiving = (ImageView) findViewById(R.id.ivDiving);
        ivDiving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toComingSoon(R.mipmap.minat_diving_foreground, "Komunitas Diving");
            }
        });

        ImageView ivMemasak = (ImageView) findViewById(R.id.ivMemasak);
        ivMemasak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toComingSoon(R.mipmap.minat_memasak_foreground, "Komunitas Memasak");
            }
        });

    }

    public void toMancing() {
        Intent intent = new Intent(this, GrupmancingActivity.class);
        startActivity(intent);
    }

    public void toMenyanyi() {
        Intent intent = new Intent(this, KomunitasMenyanyiActivity.class);
        startActivity(intent);
    }

    public void toComingSoon(int image, String judul) {
        Intent intent = new Intent(this, GrupbersepedaActivity.class);
        intent.putExtra("image", image);
        intent.putExtra("judul", judul);
        startActivity(intent);
    }

}
