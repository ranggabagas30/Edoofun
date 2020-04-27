package com.example.edoofun.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

import com.example.edoofun.R;
import com.example.edoofun.model.EventModel;

import java.util.ArrayList;

public class EventListActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getSimpleName();
    private Toolbar toolbar;
    private ViewPager2 eventListViewPager;
    private ImageButton previous, next;
    private EventListViewPagerAdapter eventListViewPagerAdapter;
    private ArrayList<EventModel> eventList;
    private int currentPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        previous = findViewById(R.id.viewPagerPrevious);
        next = findViewById(R.id.viewPagerNext);
        eventListViewPager = findViewById(R.id.viewPagerEvents);
        eventList = new ArrayList<>();
        eventList.add(
                new EventModel(
                        R.drawable.poster_lukis,
                        getResources().getString(R.string.title_lomba_mewarnai),
                        getResources().getString(R.string.deskripsi_lomba_mewarnai),
                        getResources().getString(R.string.date_lomba_mewarnai),
                        getResources().getString(R.string.fee_lomba_mewarnai)
                )
        );
        eventList.add(
                new EventModel(
                        R.drawable.poster_basket,
                        getResources().getString(R.string.title_lomba_basketball),
                        getResources().getString(R.string.deskripsi_lomba_basketball),
                        getResources().getString(R.string.date_lomba_basketball),
                        getResources().getString(R.string.fee_lomba_basketball)
                )
        );
        eventListViewPagerAdapter = new EventListViewPagerAdapter(
                eventList,
                new EventListViewPagerAdapter.EventListAdapterListener() {
                    @Override
                    public void onDaftarClick(EventModel event) {
                        Intent intent = new Intent(EventListActivity.this, DaftarEventActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onViewDetailClick(EventModel event) {
                        Intent intent = new Intent(EventListActivity.this, ViewDetailActivity.class);
                        intent.putExtra(ViewDetailActivity.KEY_IMAGE_RESOURCE_ID, event.getPosterImageResId());
                        startActivity(intent);
                    }
                }
        );
        eventListViewPager.setAdapter(eventListViewPagerAdapter);
        eventListViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                Log.d(TAG, "onPageScrolled: position = " + position + ", positionOffset = " + positionOffset);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                Log.d(TAG, "onPageSelected: position = " + position);
                currentPosition = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });

        previous.setOnClickListener(v -> {
            if (currentPosition > 0) eventListViewPager.setCurrentItem(currentPosition - 1, true);
        });

        next.setOnClickListener(v -> {
            if (currentPosition < eventList.size()-1) eventListViewPager.setCurrentItem(currentPosition + 1, true);
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
