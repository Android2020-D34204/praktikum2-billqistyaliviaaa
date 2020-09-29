package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    TextView HasilOperasi;
    Button Hitung;
    EditText editAngkaPertama,editOperasi,editAngkaKedua;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAngkaPertama = findViewById(R.id.editAngkaPertama);
        editAngkaKedua = findViewById(R.id.editAngkaKedua);
        editOperasi = findViewById(R.id.editOperasi);
        Hitung = findViewById(R.id.Hitung);
        HasilOperasi = findViewById(R.id.HasilOperasi);

    }

    public void ngitung (View view){
        int angka1 = parseInt(editAngkaPertama.getText().toString());
        int angka2 = parseInt(editAngkaKedua.getText().toString());
        String ngitung = editOperasi.getText().toString();

        int hasil = 0;

        if(ngitung.equals("+")){
            hasil = angka1 + angka2;
        }
        else if(ngitung.equals("-")){
            hasil = angka1 - angka2;
        }
        else if(ngitung.equals("/")){
            hasil = angka1 / angka2;
        }
        else if(ngitung.equals("*")){
            hasil = angka1 * angka2;
        }
        else{
            HasilOperasi.setText("Operasi Aritmatik tidak ada");
        }

        String res = new Integer(hasil).toString();
        HasilOperasi.setText(res);


    }
}