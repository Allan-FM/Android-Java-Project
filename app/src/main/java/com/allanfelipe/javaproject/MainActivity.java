package com.allanfelipe.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText nome;
    TextView resposta;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = (EditText) findViewById(R.id.txtNomeId);
        resposta = (TextView) findViewById(R.id.txtRespostaId);
    }

    public void precionado(View view)
    {
        String nomeDoCliente = nome.getText().toString();
        String frase = "E um prazer te conhecer " + nomeDoCliente + " !!";
        resposta.setText(frase);
    }
}