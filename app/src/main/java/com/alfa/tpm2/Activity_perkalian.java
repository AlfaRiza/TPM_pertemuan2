package com.alfa.tpm2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_perkalian extends AppCompatActivity {
    private EditText etAngka1,etAngka2;
    private TextView tvKali;
    private Button btnKali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkalian);

        etAngka1 = findViewById(R.id.etAngka1);
        etAngka2 = findViewById(R.id.etAngka2);
        btnKali = findViewById(R.id.btnKali);
        tvKali = findViewById(R.id.tvKali);

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sAngka1 = etAngka1.getText().toString();
                String sAngka2 = etAngka2.getText().toString();

                double angka1 = Double.parseDouble(sAngka1);
                double angka2 = Double.parseDouble(sAngka2);

                double hasil = angka1*angka2;

                String sHasil = String.valueOf(hasil);
                tvKali.setText(sHasil);
            }
        });


    }
}
