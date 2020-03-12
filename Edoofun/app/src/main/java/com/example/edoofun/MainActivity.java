package com.example.edoofun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    AdapterViewPager adapterViewPager;
    List<Model> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setLogo(R.drawable.ic_dehaze);

        models = new ArrayList<>();
        models.add(new Model(R.drawable.cardswipe1, "", ""));
        models.add(new Model(R.drawable.cardswipe2, "BERENANG MEMPELAJARI DUNIA LAUT", "-"));

        adapterViewPager = new AdapterViewPager(models, this);

        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapterViewPager);
        viewPager.setPadding(0,0,0,0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.color1)};

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < (adapterViewPager.getCount() -1)&& position < (colors.length -1)){
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position +1]
                            )
                    );
                }else {
                    viewPager.setBackgroundColor(colors[colors.length -1]);
                }
            }


            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }



    }
