package com.kaspin.menghitungluastutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.kaspin.menghitungluastutorial.model.LuasModel;
import com.kaspin.menghitungluastutorial.viewModel.LuasViewModel;

public class MainActivity extends AppCompatActivity {

    LuasViewModel luasViewModel;

    EditText edtPanjang;
    EditText edtLebar;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        luasViewModel = new ViewModelProvider(this).get(LuasViewModel.class);

        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        btnHitung = findViewById(R.id.btnHitung);
        txtHasil = findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(v -> {
            int panjang = Integer.parseInt(edtPanjang.getText().toString());
            int lebar = Integer.parseInt(edtLebar.getText().toString());

            LuasModel luasModel = new LuasModel(panjang, lebar);

            luasViewModel.setMutableLiveData(luasModel);
        });

        luasViewModel.hitungLuas.observe(this, hasilLuas -> {
            txtHasil.setText("Hasil: "+hasilLuas);
        });
    }
}