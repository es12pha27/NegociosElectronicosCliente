package com.lab02.negocioselectronicoscliente;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ZonasTodas extends AppCompatActivity {
    List<ListElement> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zonas_todas);
        init();
    }
    public void init(){
    elements=new ArrayList<>();
        elements=mostrarZonas();
        ListAdapter listAdapter=new ListAdapter(elements,this);
        RecyclerView recyclerView=findViewById(R.id.recyclerViewList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
    public List<ListElement> mostrarZonas(){
            ConexionSQLite conn= new ConexionSQLite(this,"Cliente",null,1);
            SQLiteDatabase db=conn.getReadableDatabase();
            Cursor cursor=db.rawQuery("SELECT * FROM "+Utilidades.TABLA_ZONA,null);
           elements=new ArrayList<>();
    if(cursor.moveToFirst()){
    do{
        elements.add(new ListElement(cursor.getString(0),cursor.getString(1),cursor.getString(2)));
    }while(cursor.moveToNext());

}
          return elements;
        }
}