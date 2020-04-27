package com.example.edoofun;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.edoofun.view.EventListActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class HalamanHome extends AppCompatActivity {
    FirebaseAuth auth;
    Button btnjalan;
    Toolbar toolbar;
    ViewPager viewPager;
    ViewPager viewPager2;
    AdapterViewPager adapterViewPager;
    AdapterViewPager adapterViewPager2;
    LinearLayout eventItemLayout;
    List<Model> models;

    List<Model> models2;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();

        toolbar = findViewById(R.id.toolbar);
        eventItemLayout = findViewById(R.id.eventItemLayout);

        toolbar.inflateMenu(R.menu.toolbar_main_menu);
        setSupportActionBar(toolbar);

        eventItemLayout.setOnClickListener(v -> {
            Intent intent = new Intent(HalamanHome.this, EventListActivity.class);
            startActivity(intent);
        });

        ImageView imageKomunitas = (ImageView) findViewById(R.id.ivKomunitas);
        imageKomunitas.setOnClickListener(v -> toKomunitas());

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

    private void toKomunitas() {
        Intent intent = new Intent(this, KomunitasActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(R.menu.toolbar_main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int menuId = item.getItemId();
        switch (menuId) {
            case R.id.logout_menu : {
                if (auth != null) {
                    doLogout();
                    navigateToLogin();
                    return true;
                }
            }
        }
        return false;
    }

    private void doLogout() {
        auth.signOut();
    }

    private void navigateToLogin() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


