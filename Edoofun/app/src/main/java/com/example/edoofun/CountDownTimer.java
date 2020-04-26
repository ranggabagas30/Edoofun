package com.example.edoofun;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import cn.iwgang.countdownview.CountdownView;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CountDownTimer extends AppCompatActivity {

    Button xdialog1;
    ImageView back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_down_timer);

        CountdownView countDownTime = (CountdownView)findViewById(R.id.countdownview);
        countDownTime.start(86400000);

        xdialog1 = findViewById(R.id.next);

        xdialog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a = new AlertDialog.Builder(CountDownTimer.this);
                a.setTitle("INFORMASI");
                a.setMessage("Kami akan melakukan verifikasi bukti transfer anda secepatnya");
                a.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent c = new Intent(CountDownTimer.this, HalamanHome.class);
                        startActivity(c);
                    }
                });
                AlertDialog dialog = a.create();
                dialog.show();

            }
        });

        back1 = findViewById(R.id.back);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(CountDownTimer.this, tutorialpembayaran.class);
                startActivity(a);
            }


        });
    }
}
