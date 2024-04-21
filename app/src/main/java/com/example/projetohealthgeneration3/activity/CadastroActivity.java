package com.example.projetohealthgeneration3.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projetohealthgeneration3.R;

public class CadastroActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void cadastro(View view){
        Intent it = new Intent( CadastroActivity.this, LoginActivity.class);
        startActivity(it);
    }
    public void acessar(View view){
        Intent it = new Intent(CadastroActivity.this, AcessoActivity.class);
        startActivity(it);
    }
}