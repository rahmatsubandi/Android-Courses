package com.example.thirdproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_panjang, et_lebar;
    private Button btn_hitung;
    private TextView tv_hasil;
    private TextView author;
    private String panjang, lebar;
    private double p, l, luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");
        et_panjang = (EditText) findViewById(R.id.edt_panjang);
        et_lebar = (EditText) findViewById(R.id.edt_lebar);
        btn_hitung = (Button) findViewById(R.id.btn_hitung);
        tv_hasil = (TextView) findViewById(R.id.tv_hasil);
        author = (TextView) findViewById(R.id.author);

        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                panjang = et_panjang.getText().toString();
                lebar = et_lebar.getText().toString();

                p = Double.parseDouble(panjang);
                l = Double.parseDouble(lebar);

                luas = p * l;

                tv_hasil.setText("Luas : "+luas);
                author.setText("By Rahmat Subandi");

            }
        });
    }
}