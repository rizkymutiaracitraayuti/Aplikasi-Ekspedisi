package com.example.aplikasiuts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResi extends AppCompatActivity {
    TextView vresi, vpengirim, vpenerima, valamat, vtujuan, vberat, vtotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resi);

        vresi = findViewById(R.id.textViewResi);
        vresi.setText(out.noresi);
        vpengirim = findViewById(R.id.textViewPengirim);
        vpengirim.setText(out.pengirim);
        vpenerima = findViewById(R.id.textViewPenerima);
        vpenerima.setText(out.penerima);
        valamat = findViewById(R.id.textViewAlamat);
        valamat.setText(out.alamat);
        vtujuan = findViewById(R.id.textViewTujuan);
        vtujuan.setText(out.tuju);
        vberat = findViewById(R.id.textViewBerat);
        vberat.setText(out.berat);
        vtotal = findViewById(R.id.textViewTotal);
        vtotal.setText(String.valueOf(out.total));

    }
}
