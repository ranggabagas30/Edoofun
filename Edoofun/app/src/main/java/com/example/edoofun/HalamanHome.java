package com.example.edoofun;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class HalamanHome extends AppCompatActivity {
    Button btnjalan;

    ViewPager viewPager;
    ViewPager viewPager2;
    AdapterViewPager adapterViewPager;
    AdapterViewPager adapterViewPager2;
    List<Model> models;

    List<Model> models2;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        models = new ArrayList<>();
        models.add(new Model(R.drawable.cardswipe1, "MEMANCING DENGAN MUDAH DENGAN TALI YANG KUAT"));
        models.add(new Model(R.drawable.cardswipe2, "BERENANG MEMPELAJARI DUNIA LAUT"));

        adapterViewPager = new AdapterViewPager(models, this);

        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapterViewPager);
        viewPager.setPadding(0, 0, 0, 0);

        models2 = new ArrayList<>();
        models2.add(new Model(R.drawable.trending3, "Cara bermain bola basket seperti pemain profesional"));
        models2.add(new Model(R.drawable.trending2, "Cara berenang bisa tahan nafas dari ujung sampai ujung"));
        models2.add(new Model(R.drawable.trending1, "Cara menjahit baju tanpa bolong"));


        adapterViewPager2 = new AdapterViewPager(models2, this);

        viewPager2= findViewById(R.id.viewpager2);
        viewPager2.setAdapter(adapterViewPager2);
        viewPager2.setPadding(0, 0, 0, 0);


      /*  Integer[] colors_temp = {
                getResources().getColor(R.color.color1)};

        colors = colors_temp;
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < (adapterViewPager.getCount() - 1) && position < (colors.length - 1)) {
                    viewPager.setBackgroundColor(
                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )

                    );
                } else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }


        });*/






        BottomNavigationView bottomNavigationView = findViewById(R.id.btn_nav);

        bottomNavigationView.setSelectedItemId(R.id.home_menu);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home_menu:
                        return true;

                    case R.id.keranjang_menu:
                        startActivity(new Intent(getApplicationContext(),
                                PembayaranKoin.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.sosial_menu:
                        startActivity(new Intent(getApplicationContext(),
                                sosial.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;

                }

        });




    }

    }


