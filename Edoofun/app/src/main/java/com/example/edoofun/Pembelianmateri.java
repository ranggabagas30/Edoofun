package com.example.edoofun;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Pembelianmateri extends AppCompatActivity {
    ImageView back1;
    ListView listView;
    String mTitle[] = {"Menyanyi dengan head voice", "Menyanyi dengan nada tinggi", "Belajar Vokal untuk pemula", "Belajar Vokal Dasar"};
    String mDescription[] = {"Sarah Semewiring","Sarah Semewiring", "Sarah Semewiring", "Yuni Ariyani" };
    String mSubdesc[]= {"50 COIN", "50 COIN", "30 COIN", "100 COIN"};
    int images[] = {R.drawable.materinyanyi, R.drawable.materinyanyi, R.drawable.materinyanyi, R.drawable.materinyanyi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembelianmateri);

        listView = findViewById(R.id.Listview);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, mSubdesc, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                   Intent myintent = new Intent(view.getContext(), belimateridetail.class);
                   startActivityForResult(myintent,0);
                }
                if (position == 1){
                    Intent myintent = new Intent(view.getContext(), materi_detail.class);
                    startActivityForResult(myintent,0);
                }
                if (position == 2){
                    Intent myintent = new Intent(view.getContext(), materi_detail.class);
                    startActivityForResult(myintent,0);
                }
                if (position == 3){
                    Intent myintent = new Intent(view.getContext(), materi_detail.class);
                    startActivityForResult(myintent,0);
                }
            }
        });

        back1 = findViewById(R.id.back);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Pembelianmateri.this, ListBeliMateri.class);
                startActivity(a);
            }
    });
    }

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rDescription[];
        String rSubdesc[];
        int rImg[];

        MyAdapter (Context c, String title[], String description[], String subdesc[], int img[]){
            super(c, R.layout.rowmateri, R.id.judulmateri, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rSubdesc = subdesc;
            this.rImg = img;
        }

        @NonNull
        @Override
        public View getView (int position, @Nullable View convertView, @NonNull ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.rowmateri, parent, false);
            ImageView images = row.findViewById(R.id.imagemateri);
            TextView myTitle = row.findViewById(R.id.judulmateri);
            TextView myDescription = row.findViewById(R.id.desc);
            TextView mySubdesc = row.findViewById(R.id.subdesc);

            images.setImageResource(rImg[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            mySubdesc.setText(rSubdesc[position]);

            return row;
        }
    }
}
