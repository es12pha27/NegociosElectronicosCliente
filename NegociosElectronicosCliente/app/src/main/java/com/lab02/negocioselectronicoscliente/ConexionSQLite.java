package com.lab02.negocioselectronicoscliente;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexionSQLite  extends SQLiteOpenHelper {



        public   ConexionSQLite (Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(Utilidades.CREAR_TABLA_ZONA);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
            db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_ZONA);
           onCreate(db);
        }
    }