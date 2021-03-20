package com.example.secondproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
int counter;

    Button tambah, kurang, reset;
    TextView nilai;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        tambah = (Button)findViewById(R.id.btnTambah);
        kurang = (Button)findViewById(R.id.btnKurang);
        reset  = (Button)findViewById(R.id.btnReset);
        nilai  = (TextView)findViewById(R.id.txtNilai);

        nilai.setText("" + counter);

        tambah.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                counter++;
                nilai.setText("" + counter);
            }
        });

        kurang.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                counter--;
                nilai.setText("" + counter);
            }
        });

        reset.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                counter = 0;
                nilai.setText("" + counter);
            }
        });
    }
}