package com.uts.hewanpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.uts.hewanpedia.jenis.Hewan;

public class ProfileActivity extends AppCompatActivity {

    Hewan hewan;
    TextView txtJudul,txtJenis,txtAsal,txtDeskripsi;
    ImageView ivFotoHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ras);
        Intent intent = getIntent();
        hewan = (Hewan) intent.getSerializableExtra(DaftarHewanActivity.HEWAN_TERPILIH);
        inisialisasiView();
        tampilkanProfil(hewan);
    }

    private void inisialisasiView() {
        txtJudul = findViewById(R.id.txtJudul);
        txtJenis = findViewById(R.id.txtJenis);
        txtAsal = findViewById(R.id.txtAsal);
        txtDeskripsi = findViewById(R.id.txtDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarHewan);
    }


    private void tampilkanProfil(Hewan hewan) {
        Log.d("Profil","Menampilkan "+hewan.getJenis());
        txtJudul.setText(hewan.getJenis());
        txtJenis.setText(hewan.getRas());
        txtAsal.setText(hewan.getAsal());
        txtDeskripsi.setText(hewan.getDeskripsi());
        ivFotoHewan.setImageDrawable(this.getDrawable(hewan.getDrawableRes()));
    }
}