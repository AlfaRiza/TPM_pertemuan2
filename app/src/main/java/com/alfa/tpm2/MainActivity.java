package com.alfa.tpm2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView tvNama;
    private EditText etNama;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNama = findViewById(R.id.tvNama);
        etNama = findViewById(R.id.etNama);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sNama = etNama.getText().toString();

                Intent moveIntent = new Intent(MainActivity.this , Activity_tujuan.class);
                startActivity(moveIntent);
                moveIntent.putExtra("nama",sNama);
            }
        }
        );
    }
}
