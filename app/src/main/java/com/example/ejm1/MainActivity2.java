package com.example.ejm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /**
         * RECIBE INFORMACION DEL INTET ANTERIOR
         */
        TextView text_v = (TextView)findViewById(R.id.tv_resultado);
        Intent pantalla =getIntent();
        String n1 = pantalla.getStringExtra("n1");
        String n2 = pantalla.getStringExtra("n2");
        String sign = pantalla.getStringExtra("signo");
        String ans = pantalla.getStringExtra("res");
        text_v.setText(n1+" "+sign+" "+n2+"  "+" ="+ans);
    }
}