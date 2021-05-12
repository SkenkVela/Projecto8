package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_calcular;
    EditText txt_QuantidadeQuiloWatt, txt_salario;
    TextView lbl_precoQuiloWatt, lbl_precoPago, lbl_desconto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //___________________________RECEBER IDS________________________\\
        //TextViews________________________________________________
        lbl_desconto = findViewById(R.id.lbl_desconto);
        lbl_precoPago = findViewById(R.id.lbl_precoPago);
        lbl_precoQuiloWatt = findViewById(R.id.lbl_precoQuiloWatt);
        //---------------------------------------------------------

        //EditTexts_________________________________________________
        txt_QuantidadeQuiloWatt = findViewById(R.id.valorQuiloWatt);
        txt_salario = findViewById(R.id.salario);
        //----------------------------------------------------------

        //Buttons______________________________________
        btn_calcular = findViewById(R.id.btn_calcular);
        //---------------------------------------------

        //_______________________________________________________________\\

        //Evento{Quando clicarem no botão calcular}_______________________\\
        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Conveter quantidade de quilowatt para inteiro
                int quantidade = Integer.parseInt(txt_QuantidadeQuiloWatt.getText().toString());

                //Converter salário para double
                double salario = Double.parseDouble(txt_salario.getText().toString());

                //Preço por QuiloWatt
                double precoQW = salario/5;

                //Preço total pago
                double precoPago = precoQW * quantidade;

                //Desconto
                double dinheiro = 0.0;
                double valorDesconto = (precoPago * 15)/100;
                dinheiro = precoPago - valorDesconto;


                //Apresentado os resultados
                //Desconto
                lbl_desconto.setText(String.valueOf(dinheiro));

                //Preço por cada quilowatt
                lbl_precoQuiloWatt.setText(String.valueOf(precoQW));

                //Preço pago pela residência
                lbl_precoPago.setText(String.valueOf(precoPago));




            }
        });
        //_________________________________________________________________\\

    }
}