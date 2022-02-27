package com.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnSuma, btnResta, btnMulti, btnDivicion, btnIgual, btnBorrar;

    TextView txtMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Encontrar a los elementos
        txtMostrar = this.findViewById(R.id.txtMostrar);

        btn1 = this.findViewById(R.id.btnUno);
        btn2 = this.findViewById(R.id.btnDos);
        btn3 = this.findViewById(R.id.btnTres);
        btn4 = this.findViewById(R.id.btnCuatro);
        btn5 = this.findViewById(R.id.btnCinco);
        btn6 = this.findViewById(R.id.btnSeis);
        btn7 = this.findViewById(R.id.btnSiete);
        btn8 = this.findViewById(R.id.btnOcho);
        btn9 = this.findViewById(R.id.btnNueve);
        btn0 = this.findViewById(R.id.btnCero);
        btnSuma = this.findViewById(R.id.btnSuma);
        btnResta = this.findViewById(R.id.btnResta);
        btnDivicion = this.findViewById(R.id.btnDivicion);
        btnMulti = this.findViewById(R.id.btnMulti);
        btnIgual = this.findViewById(R.id.btnIgual);
        btnBorrar = this.findViewById(R.id.btnBorrar);

        String cadena = txtMostrar.getText().toString();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uno = btn1.getText().toString();

                String cadena = txtMostrar.getText().toString();

                txtMostrar.setText(cadena + "" + uno);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dos = btn2.getText().toString();

                String cadena = txtMostrar.getText().toString();

                txtMostrar.setText(cadena + "" + dos);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tres = btn3.getText().toString();

                String cadena = txtMostrar.getText().toString();

                txtMostrar.setText(cadena + "" + tres);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cuatro = btn4.getText().toString();

                String cadena = txtMostrar.getText().toString();

                txtMostrar.setText(cadena + "" + cuatro);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cinco = btn5.getText().toString();

                String cadena = txtMostrar.getText().toString();

                txtMostrar.setText(cadena + "" + cinco);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String seis = btn6.getText().toString();

                String cadena = txtMostrar.getText().toString();

                txtMostrar.setText(cadena + "" + seis);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String siete = btn7.getText().toString();

                String cadena = txtMostrar.getText().toString();

                txtMostrar.setText(cadena + "" + siete);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cinco = btn8.getText().toString();

                String cadena = txtMostrar.getText().toString();

                txtMostrar.setText(cadena + "" + cinco);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cinco = btn9.getText().toString();

                String cadena = txtMostrar.getText().toString();

                txtMostrar.setText(cadena + "" + cinco);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cinco = btn0.getText().toString();

                String cadena = txtMostrar.getText().toString();

                txtMostrar.setText(cadena + "" + cinco);
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String suma = btnSuma.getText().toString();

                String cadena = txtMostrar.getText().toString();

                txtMostrar.setText(cadena + "" + suma);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resta = btnResta.getText().toString();

                String cadena = txtMostrar.getText().toString();

                txtMostrar.setText(cadena + "" + resta);
            }
        });

        btnDivicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resta = btnDivicion.getText().toString();

                String cadena = txtMostrar.getText().toString();

                txtMostrar.setText(cadena + "" + resta);
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resta = btnMulti.getText().toString();

                String cadena = txtMostrar.getText().toString();

                txtMostrar.setText(cadena + "" + resta);
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cadena = txtMostrar.getText().toString();

                cadena = "";

                txtMostrar.setText(cadena);
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cadena = txtMostrar.getText().toString();

                Float resultado = 0F;
                //1+1+1

                resultado = Float.parseFloat(String.valueOf(cadena.charAt(0)));
                for (int i=0; i < cadena.length(); i++){


                    char c = cadena.charAt(i);

                    //operaciones(c);

                    //resultado = Float.parseFloat(String.valueOf(cadena.charAt(i)));
                    if(c == '+'){
                        resultado += Float.parseFloat(String.valueOf(cadena.charAt(i+1)));
                        //System.out.println(Float.parseFloat(String.valueOf(cadena.charAt(i-1))));
                    }else if(c == '-'){
                        resultado -= Float.parseFloat(String.valueOf(cadena.charAt(i+1)));
                    }
                }

                txtMostrar.setText(String.valueOf(resultado));
            }
        });
    }

    public Float operaciones(char sim){
        switch (sim){
            case '+':

                break;
            case '-':
                break;
            case '/':
                break;
            case '*':
                break;
        }

        return 0F;
    }
}