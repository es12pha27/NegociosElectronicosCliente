package com.lab02.negocioselectronicoscliente;

public class Utilidades {

    //Constantes campos tabla zona
    public static final String TABLA_ZONA="zona";
    public static final String CAMPO_ID="codigo";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_ESTADO="estado";

    public static final String CREAR_TABLA_ZONA="CREATE TABLE " +
            ""+TABLA_ZONA+" ("+CAMPO_ID+" " +
            "INTEGER, "+CAMPO_NOMBRE+" TEXT,"+CAMPO_ESTADO+" TEXT)";

 }
