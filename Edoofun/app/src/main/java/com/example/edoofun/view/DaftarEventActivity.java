package com.example.edoofun.view;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.edoofun.R;
import com.github.dhaval2404.imagepicker.ImagePicker;

import java.io.File;
import java.util.ArrayList;

public class DaftarEventActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private AppCompatEditText namaLengkapInputText;
    private AppCompatEditText noTelpInputText;
    private AppCompatEditText asalSekolahInputText;
    private TextView fotoLabel;
    private AppCompatButton btnBrowseFile;
    private RadioGroup rgKategoriLomba;
    private RadioButton rbLombaMewarnai, rbLombaBasket;
    private AppCompatButton btnBayar;

    private final int RC_IMAGE_PICKING = 100;
    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_event);

        toolbar = findViewById(R.id.toolbar);
        namaLengkapInputText = findViewById(R.id.namaLengkapInputText);
        noTelpInputText = findViewById(R.id.noTelpInputText);
        asalSekolahInputText = findViewById(R.id.asalSekolahInputText);
        fotoLabel = findViewById(R.id.fotoLabel);
        btnBrowseFile = findViewById(R.id.btnBrowseFile);
        rgKategoriLomba = findViewById(R.id.rgLomba);
        rbLombaMewarnai = findViewById(R.id.rbMewarnai);
        rbLombaBasket = findViewById(R.id.rbBasket);
        btnBayar = findViewById(R.id.btnBayar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnBrowseFile.setOnClickListener(v -> {
            ArrayList<String> mimeTypesFilter = new ArrayList<>();
            mimeTypesFilter.add("image/jpeg");
            mimeTypesFilter.add("image/jpg");
            mimeTypesFilter.add("image/png");
            String[] mimeTypesArray = new String[3];
            ImagePicker.Companion.with(DaftarEventActivity.this)
                    .cropSquare()
                    .galleryOnly()
                    .galleryMimeTypes(mimeTypesFilter.toArray(mimeTypesArray))
                    .start(RC_IMAGE_PICKING);
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_IMAGE_PICKING) {
            if (resultCode == Activity.RESULT_OK) {

                if (data != null) { // mengambil data gambar yang diambil dari gallery menggunakan ImagePicker
                    //Image Uri will not be null for RESULT_OK
                    Uri fileUri = data.getData();

                    //You can get File object from intent
                    File file = ImagePicker.Companion.getFile(data);

                    //You can also get File Path from intent
                    String filePath = ImagePicker.Companion.getFilePath(data);
                    Log.d(TAG, "fileUri: " + fileUri);
                    Log.d(TAG, "file: "+ file);
                    Log.d(TAG, "file path: " + filePath);

                    // Show file name on textview
                    fotoLabel.setText("Foto : " + file.getName());
                }

            } else if (resultCode == ImagePicker.RESULT_ERROR) {
                Toast.makeText(this, ImagePicker.Companion.getError(data), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Task Cancelled", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
