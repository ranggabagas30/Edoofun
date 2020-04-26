package com.example.edoofun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class KomunitasMenyanyiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komunitas_menyanyi);
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toAnnouncement();
            }
        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
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
        intent.putExtra("name", "Richad");
        intent.putExtra("judul", "Rules Komunitas Menyanyi");
        startActivity(intent);
    }
    public void toPhotos() {
        Intent intent = new Intent(this, PhotosActivity.class);
        startActivity(intent);
    }

    private void KomunitasMancingActivity() {
        Intent intent = new Intent(this, KomunitasMancingActivity.class);
        intent.putExtra("judul", "Komunitas Menyanyi");
        intent.putExtra("image", R.mipmap.minat_menyanyi_foreground);
        startActivity(intent);
    }
}
