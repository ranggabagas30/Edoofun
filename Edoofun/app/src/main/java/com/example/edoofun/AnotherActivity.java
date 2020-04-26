package com.example.edoofun;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AnotherActivity extends AppCompatActivity {

    TextView internet11;

    TextView mTitleTv, mDescTv;
    ImageView mImageTv, back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);


        mTitleTv = findViewById(R.id.titlevie);
        mDescTv = findViewById(R.id.subtitle);
        mImageTv = findViewById(R.id.imageVie);

        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("iTitle");
        String mDescription = intent.getStringExtra("iDesc");

        byte[] mBytes = getIntent().getByteArrayExtra("iImage");

        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes, 0, mBytes.length);


        mTitleTv.setText(mTitle);
        mDescTv.setText(mDescription);
        mImageTv.setImageBitmap(bitmap);

        internet11 = findViewById(R.id.internet);
        internet11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(AnotherActivity.this, PembayaranATM.class);
                startActivity(c);
            }
        });

        back1 = findViewById(R.id.back);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(AnotherActivity.this, ListBeliKoin.class);
                startActivity(a);
            }


        });

    }
}
