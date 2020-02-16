package com.alfa.tpm2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_tujuan extends AppCompatActivity {

    private TextView tvNama;
    private Button btnPerkalian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuan);

        btnPerkalian = findViewById(R.id.btnPerkalian);
        tvNama = findViewById(R.id.tvNama);
        String nama = getIntent().getStringExtra("nama");

        String text = "Hi "+nama+"!";
        tvNama.setText(text);

        btnPerkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(Activity_tujuan.this , Activity_perkalian.class );
                startActivity(moveIntent);
            }
        });

    }
}
