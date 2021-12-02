package com.lab02.negocioselectronicoscliente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onZona(View view){
        Intent intent = new Intent(MainActivity.this, MenuZona.class);
        startActivity(intent);
    }
}