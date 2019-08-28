package com.br.aula_270819;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class tela02_270819 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela02_270819);

        //como vou atulizar a text view do centro da mnha tela, logo...

        TextView txtResposta = findViewById(R.id.txtResposta);

        SharedPreferences sh = getSharedPreferences("saudacoes", MODE_PRIVATE); //sharedprefenrece -  ele salva a info que recebe (em um campo de texto) na memoria do celular
        String nome = sh.getString("nome", ""); //  ele ta pegando a info que esta salvando "sharedPreference, quero que vc salve a info que vier no text "nome"
        String sds = sh.getString("sds", "");

        txtResposta.setText(sds + " " + nome);
    }
}
