package com.example.ejm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /**
     * LLAMADO A CLASE QUE CONTIENE OPERACIONES
     */
    Operaciones funcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 =(EditText)findViewById(R.id.txt_numero1);
        EditText num2 =(EditText) findViewById(R.id.txt_numero2);
        Button btnsuma=(Button)findViewById(R.id.btn_suma);
        Button btnresta=(Button)findViewById(R.id.btn_resta);
        Button btnmultiplicacion=(Button)findViewById(R.id.btn_multiplicacion);
        Button btndivision=(Button)findViewById(R.id.btn_division);

        /**
         * SEGUNDA PANTALLA
         */
        Intent pantalla = new Intent(getApplicationContext(),MainActivity2.class);


        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Double n1 =Double.parseDouble(num1.getText().toString());
                    Double n2 = Double.parseDouble(num2.getText().toString());
                    funcion = new Operaciones(n1,n2);

                    Double suma =funcion.suma();
                    pantalla.putExtra("n1",+n1 +"");
                    pantalla.putExtra("n2",+n2 +"");
                    pantalla.putExtra("signo", "+");
                    pantalla.putExtra("res",suma +"");
                    startActivity(pantalla);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"ERROR! campos vacios",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Double n1 =Double.parseDouble(num1.getText().toString());
                    Double n2 = Double.parseDouble(num2.getText().toString());
                    funcion = new Operaciones(n1,n2);

                    Double resta =funcion.resta();
                    pantalla.putExtra("n1",+n1 +"");
                    pantalla.putExtra("n2",+n2 +"");
                    pantalla.putExtra("signo", "-");
                    pantalla.putExtra("res",resta+"");
                    startActivity(pantalla);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"ERROR! campos vacios",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Double n1 =Double.parseDouble(num1.getText().toString());
                    Double n2 = Double.parseDouble(num2.getText().toString());
                    funcion = new Operaciones(n1,n2);

                    Double resta =funcion.multiplicacion();
                    pantalla.putExtra("n1",+n1 +"");
                    pantalla.putExtra("n2",+n2 +"");
                    pantalla.putExtra("signo", "*");
                    pantalla.putExtra("res",resta+"");
                    startActivity(pantalla);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"ERROR! campos vacios",Toast.LENGTH_LONG).show();
                }
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Double n1 =Double.parseDouble(num1.getText().toString());
                    Double n2 = Double.parseDouble(num2.getText().toString());
                    funcion = new Operaciones(n1,n2);

                    Double resta =funcion.division();
                    pantalla.putExtra("n1",+n1 +"");
                    pantalla.putExtra("n2",+n2 +"");
                    pantalla.putExtra("signo", "/");
                    pantalla.putExtra("res",resta+"");
                    startActivity(pantalla);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"ERROR! campos vacios",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}