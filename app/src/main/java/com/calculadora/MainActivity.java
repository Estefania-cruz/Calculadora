package com.calculadora;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnSuma, btnResta, btnMulti, btnDivicion, btnIgual, btnBorrar;

    TextView txtMostrar;

    String cadena = "";

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

        cadena = txtMostrar.getText().toString();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uno = btn1.getText().toString();

                cadena += uno;

                txtMostrar.setText(cadena);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dos = btn2.getText().toString();

                cadena += dos;

                txtMostrar.setText(cadena);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tres = btn3.getText().toString();

                cadena += tres;

                txtMostrar.setText(cadena);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cuatro = btn4.getText().toString();

                cadena += cuatro;

                txtMostrar.setText(cadena);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cinco = btn5.getText().toString();

                cadena += cinco;

                txtMostrar.setText(cadena);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String seis = btn6.getText().toString();

                cadena += seis;

                txtMostrar.setText(cadena);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String siete = btn7.getText().toString();

                cadena += siete;

                txtMostrar.setText(cadena);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ocho = btn8.getText().toString();

                cadena += ocho;

                txtMostrar.setText(cadena);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nueve = btn9.getText().toString();

                cadena += nueve;

                txtMostrar.setText(cadena);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cero = btn0.getText().toString();

                cadena += cero;

                txtMostrar.setText(cadena);
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String suma = btnSuma.getText().toString();

                cadena += suma;

                txtMostrar.setText(cadena);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resta = btnResta.getText().toString();

                cadena += resta;

                txtMostrar.setText(cadena);
            }
        });

        btnDivicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String div = btnDivicion.getText().toString();

                cadena += div;

                txtMostrar.setText(cadena);
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String multi = btnMulti.getText().toString();

                cadena += multi;

                txtMostrar.setText(cadena);
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String cadena = txtMostrar.getText().toString();

                cadena = "";

                txtMostrar.setTextColor(Color.BLACK);
                txtMostrar.setText(cadena);
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tam = cadena.length();
                String A[] = new String[100];

                //Array para almacenar operadores.
                String operaciones[] = new String[100];

                int pos = 0;
                int sum = 0;
                String aux = "";

                //inicializa primer operador.
                operaciones[0] = "+";
                int index_operacion = 1;

                for(int i = 0; i<tam ; i++)
                {
                    if(cadena.charAt(i) == '+' || cadena.charAt(i) == '-' || cadena.charAt(i) == '*' || cadena.charAt(i) == '/')
                    {
                        A[pos] = aux;
                        operaciones[index_operacion] = String.valueOf(cadena.charAt(i));
                        pos++;
                        index_operacion++;
                        aux = "";
                    }else {
                        aux = aux + cadena.charAt(i);
                    }
                }
                A[pos] = aux;
                pos++;

                for(int i = 0; i<pos ; i++)
                {
                    //Determina la operación a realizar.
                    if(operaciones[i].equals("+")){
                        sum=sum+Integer.parseInt(A[i]);
                    }else if (operaciones[i].equals("-")){
                        sum=sum-Integer.parseInt(A[i]);
                    }else if (operaciones[i].equals("*")){
                        sum=sum*Integer.parseInt(A[i]);
                    }else if (operaciones[i].equals("/")){
                        sum=sum/Integer.parseInt(A[i]);
                    }

                }
                System.out.println("=  "+sum);
                txtMostrar.setText(String.valueOf(sum));

                /*Float resultado = 0F;

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
                    }else if(c == '*'){
                        resultado *= Float.parseFloat(String.valueOf(cadena.charAt(i+1)));
                    }else if(c == '/'){
                        resultado /= Float.parseFloat(String.valueOf(cadena.charAt(i+1)));
                    }
                }*/

            }
        });
    }

    public String operaciones() {
        Double resultado = 0.0;
        if (cadena.split("\\+").length == 2) {
            String[] numeros = cadena.split("\\+");
            try {
                Double res = Double.parseDouble(numeros[0]) + Double.parseDouble(numeros[1]);
                resultado = res;
            }catch (Exception e){
                return "error";
            }
        } else if (cadena.split("-").length == 2) {
            String[] numeros = cadena.split("-");
            try {
                Double res = Double.parseDouble(numeros[0]) - Double.parseDouble(numeros[1]);
                resultado = res;
            }catch (Exception e){
                return "error";
            }
        } else if (cadena.split("\\*").length == 2) {
            String[] numeros = cadena.split("\\*");
            try {
                Double res = Double.parseDouble(numeros[0]) * Double.parseDouble(numeros[1]);
                resultado = res;
            }catch (Exception e) {
                return "error";
            }
        } else if (cadena.split("/").length == 2) {
            String[] numeros = cadena.split("/");
            try {
                Double res = Double.parseDouble(numeros[0]) / Double.parseDouble(numeros[1]);
                resultado = res;
            }catch (Exception e){
                return "error";
            }
        }

        cadena = String.valueOf(resultado);
        /*String numero = "", total = "error";
        Double resultado = 0.0;
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)){
                case '+':
                    resultado += Double.parseDouble(numero);
                    numero = "";
                    System.out.println("Resultado: " + resultado);
                    break;
                case '-':
                    resultado -= Double.parseDouble(numero);
                    numero = "";
                    System.out.println("Resultado: " + resultado);
                    break;
                case '*':
                    resultado *= Double.parseDouble(numero);
                    numero = "";
                    System.out.println("Resultado: " + resultado);
                    break;
                case '/':
                    resultado /= Double.parseDouble(numero);
                    numero = "";
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    numero = numero + cadena.charAt(i);
                    System.out.println("Numero: " + numero+ "s " + i);
                    break;
            }

            if (cadena.charAt(i) == '+') {
                resultado += Double.parseDouble(numero);
                numero = "";
                System.out.println("Resultado: " + resultado);
            } else if (cadena.charAt(i) == '-') {
                resultado -= Double.parseDouble(numero);
                numero = "";
                System.out.println("Resultado: " + resultado);
            } else if (cadena.charAt(i) == '*') {
                resultado *= Double.parseDouble(numero);
                numero = "";
                System.out.println("Resultado: " + resultado);
            } else if (cadena.charAt(i) == '/') {
                resultado /= Double.parseDouble(numero);
                numero = "";
                System.out.println("Resultado: " + resultado);
            }

            if (cadena.charAt(i) != '+' && cadena.charAt(i) != '-' && cadena.charAt(i) != '*' && cadena.charAt(i) != '/') {
                numero = numero + cadena.charAt(i);
                System.out.println("Numero: " + numero+ "s " + i);
            }
        }*/

        return String.valueOf(resultado);
    }
}