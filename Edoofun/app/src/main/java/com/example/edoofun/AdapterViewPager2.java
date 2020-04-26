package com.example.edoofun;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class AdapterViewPager2 extends PagerAdapter {


    private List<Model> models2;
    private LayoutInflater layoutInflater;
    private Context context;

    public AdapterViewPager2 (List<Model> models, Context context) {
        this.models2 = models;
        this.context = context;
    }

    @Override
    public int getCount(){
        return models2.size();
    }

    @Override
    public boolean isViewFromObject (@NonNull View view, @NonNull Object object){
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position){
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_swipeleft2, container, false);

        ImageView imageView;
        TextView title, desc;

        imageView = view.findViewById(R.id.image1);
        title = view.findViewById(R.id.title1);


        imageView.setImageResource(models2.get(position).getImage());
        title.setText(models2.get(position).getTitle());


        container.addView(view, 0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object){
        container.removeView((View)object);
    }
}



