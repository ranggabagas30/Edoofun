package com.example.edoofun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class GrupmancingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupmancing);

        Button btnAnnouncement = findViewById(R.id.btnAnnouncement);
        btnAnnouncement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toAnnouncement();
            }
        });

        Button btnPhotos = findViewById(R.id.btnPhotos);
        btnPhotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toPhotos();
            }
        });

        ImageView ivBack = findViewById(R.id.ivBack);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView ivMore = findViewById(R.id.ivMore);
        ivMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KomunitasMancingActivity();
            }
        });
    }

    public void toAnnouncement() {
        Intent intent = new Intent(this, AnnouncementActivity.class);
        intent.putExtra("name", "Oki Sabeni");
        intent.putExtra("judul", "Rules Komunitas Memancing");
        startActivity(intent);
    }

    private void toPhotos() {
        Intent intent = new Intent(this, PhotosActivity.class);
        startActivity(intent);
    }

    private void KomunitasMancingActivity() {
        Intent intent = new Intent(this, KomunitasMancingActivity.class);
        startActivity(intent);
    }

}
