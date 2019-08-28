  package com.br.aula_270819;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

  public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goExibir(View v) { //executar uma intent para transitar entre telas

        Intent intent = new Intent(this, tela02_270819.class);
        startActivity(intent);
    }
    public void goSalvar(View v){
            EditText txtSaudacao = findViewById(R.id.txtsaudacao);
            EditText txtNome = findViewById(R.id.txtnome);

        SharedPreferences sh = getSharedPreferences("saudacoes", MODE_PRIVATE);
        sh.edit().putString("nome", txtNome.getText().toString()).apply(); //para cada dado que for aplicar tem que dar aplu
        //"como e um dado compattilhado ele tem que ser utilizado para outras aplicacoes//apply confirma que meu dado sera inserido na tabela e tipo commit
        sh.edit().putString("sds", txtSaudacao.getText().toString()).apply();

        Toast.makeText(this, "Salvo", Toast.LENGTH_SHORT).show(); //caixa de mensagem


        }


}
