package com.example.edoofun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.edoofun.MyAdapterATM.getRandomString;

public class tutorialpembayaran extends AppCompatActivity {
    TextView txt;
    ImageView mImageTv, back1;
    Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorialpembayaran);

        mImageTv = findViewById(R.id.imageVie);

        Intent intent = getIntent();

        byte[] mBytes = getIntent().getByteArrayExtra("iImage");

        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes, 0, mBytes.length);


        mImageTv.setImageBitmap(bitmap);

        txt = findViewById(R.id.notransaksi);
        txt.setText(getRandomString(6));

        btnnext = findViewById(R.id.next);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(tutorialpembayaran.this, CountDownTimer.class);
                startActivity(c);
            }
        });

        back1 = findViewById(R.id.back);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(tutorialpembayaran.this, PembayaranATM.class);
                startActivity(a);
            }


        });



    }}
