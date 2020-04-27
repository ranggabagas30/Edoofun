package com.example.edoofun.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

import com.example.edoofun.R;
import com.ortiz.touchview.TouchImageView;

public class ViewDetailActivity extends AppCompatActivity {

    public static final String KEY_IMAGE_RESOURCE_ID = "KEY_IMAGE_RESOURCE_ID";
    private Bundle args;
    private TouchImageView viewDetailImage;
    private ImageButton closeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_detail);

        args = getIntent().getExtras();
        int imageResId = args.getInt(KEY_IMAGE_RESOURCE_ID);

        closeButton = findViewById(R.id.closeButton);
        viewDetailImage = findViewById(R.id.viewDetailImage);

        closeButton.setOnClickListener(v -> finish());
        viewDetailImage.setImageResource(imageResId);
    }
}
