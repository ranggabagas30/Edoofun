package com.example.edoofun;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class sosial  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sosial);

        BottomNavigationView bottomNavigationView = findViewById(R.id.btn_nav);

        bottomNavigationView.setSelectedItemId(R.id.sosial_menu);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home_menu:
                        startActivity(new Intent(getApplicationContext(),
                                HalamanHome.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.keranjang_menu:
                        startActivity(new Intent(getApplicationContext(),
                                PembayaranKoin.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.sosial_menu:
                        return true;

                }
                return false;

            }

        });
    }

    public void LaunchDM(View view) {
        Intent intent = new Intent(this, inbox.class);
        startActivity(intent);
    }

    public void LaunchPostBaru(View view) {
        Intent intent = new Intent(this, postingan_baru.class);
        startActivity(intent);
    }

    public void LaunchPostDetail(View view) {
        Intent intent = new Intent(this, postingan_detail.class);
        startActivity(intent);

    }
}
