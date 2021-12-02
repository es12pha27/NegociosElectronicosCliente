package com.lab02.negocioselectronicoscliente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuZona extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_zona);
    }
    public void onRegistro(View view){
        Intent intent = new Intent(MenuZona.this, RegistroZona.class);
        startActivity(intent);
    }
    public void Modificar(View view){
        Intent intent = new Intent(MenuZona.this, ZonasTodas.class);
        startActivity(intent);
    }
    public void onSalir(View view){
        Intent intent = new Intent(MenuZona.this, MainActivity.class);
        startActivity(intent);
    }
}