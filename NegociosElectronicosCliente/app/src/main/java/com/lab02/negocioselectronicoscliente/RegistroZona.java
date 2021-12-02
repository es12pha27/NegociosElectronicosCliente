package com.lab02.negocioselectronicoscliente;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroZona extends AppCompatActivity {
    EditText nombre,codigo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_zona);
       nombre=(EditText) findViewById(R.id.nomZona);
       codigo=(EditText) findViewById(R.id.codzona);
    }
    public void onMain(View view){
        Intent intent = new Intent(RegistroZona.this, MenuZona.class);
        startActivity(intent);
    }
    public void Guardar(View view){
    registrarZona();
    }
    private void registrarZona(){
    ConexionSQLite conn= new ConexionSQLite(this,"Cliente",null,1);
        SQLiteDatabase db=conn.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(Utilidades.CAMPO_ID,codigo.getText().toString());
        values.put(Utilidades.CAMPO_NOMBRE,nombre.getText().toString());
        values.put(Utilidades.CAMPO_ESTADO,"A");
        Long idResultante=db.insert(Utilidades.TABLA_ZONA,Utilidades.CAMPO_ID,values);
        Toast.makeText(getApplicationContext(),"Id Registro"+idResultante,Toast.LENGTH_SHORT).show();
    }
}