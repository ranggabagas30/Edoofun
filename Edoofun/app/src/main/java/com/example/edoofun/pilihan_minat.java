package com.example.edoofun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class pilihan_minat extends AppCompatActivity {
    CheckBox cb_memancing,cb_jaipong, cb_bersepeda, cb_menjahit, cb_diving,cb_memasak,cb_menyanyi,cb_gitar,cb_piano,cb_basket,cb_silat,cb_tendang,cb_memanah,cb_baseball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilihan_minat);
         cb_memancing = findViewById(R.id.cb_memancing);
        cb_jaipong = findViewById(R.id.cb_jaipong);
        cb_bersepeda = findViewById(R.id.cb_bersepeda);
        cb_menjahit = findViewById(R.id.cb_menjahit);
        cb_diving = findViewById(R.id.cb_diving);
        cb_memasak = findViewById(R.id.cb_memasak);
        cb_menyanyi = findViewById(R.id.cb_menyanyi);
        cb_gitar = findViewById(R.id.cb_gitar);
        cb_piano = findViewById(R.id.cb_piano);
        cb_menjahit = findViewById(R.id.cb_menjahit);
        cb_basket = findViewById(R.id.cb_basket);
        cb_silat = findViewById(R.id.cb_silat);
        cb_tendang = findViewById(R.id.cb_tendang);
        cb_memanah = findViewById(R.id.cb_memanah);
        cb_baseball = findViewById(R.id.cb_baseball);
    }

    public void Enter(View view) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference current_user_db = database.getReference("Minat");

        if(cb_memancing.isChecked()) {
            current_user_db.child("User").child("1").setValue("Jaipong");
            current_user_db.child("1").setValue("Memancing");
        }

        if(cb_jaipong.isChecked()) {
            current_user_db.child("2").setValue("Jaipong");
        }

        if(cb_bersepeda.isChecked()) {
            current_user_db.child("3").setValue("Bersepeda");
        }

        if(cb_diving.isChecked()) {
            current_user_db.child("5").setValue("Diving");
        }

        if(cb_memasak.isChecked()) {
            current_user_db.child("6").setValue("Memasak");
        }

        if(cb_menyanyi.isChecked()) {
            current_user_db.child("7").setValue("Menyanyi");
        }

        if(cb_gitar.isChecked()) {
            current_user_db.child("8").setValue("Gitar");
        }

        if(cb_piano.isChecked()) {
            current_user_db.child("9").setValue("Piano");
        }

        if(cb_menjahit.isChecked()) {
            current_user_db.child("10").setValue("Menjahit");
        }

        if(cb_basket.isChecked()) {
            current_user_db.child("11").setValue("Basket");
        }

        if(cb_silat.isChecked()) {
            current_user_db.child("12").setValue("Silat");
        }

        if(cb_tendang.isChecked()) {
            current_user_db.child("13").setValue("Tendang");
        }

        if(cb_memanah.isChecked()) {
            current_user_db.child("14").setValue("Memanah");
        }

        if(cb_baseball.isChecked()) {
            current_user_db.child("15").setValue("Baseball");
        }



    }

}
