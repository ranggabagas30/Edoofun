package com.example.edoofun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class GrupmancingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupmancing);

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

    }

    public void toAnnouncement() {
        Intent intent = new Intent(this, AnnouncementActivity.class);
        startActivity(intent);
    }
    private void toPhotos() {
        Intent intent = new Intent(this, PhotosActivity.class);
        startActivity(intent);
    }
}
