package com.kaspin.menghitungluastutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtPanjang;
    EditText edtLebar;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        btnHitung = findViewById(R.id.btnHitung);
        txtHasil = findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(v -> {

        });
    }
}