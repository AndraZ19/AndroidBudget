package com.example.tardis.gestionareabugetului;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String  DATABASE_NAME="Accounts.db";
    public static final String  TABLE_NAME="income_table";
    public static final String  TABLE_NAME2="expense_table";
    public static final String  COL_1="ID";
    public static final String  COL_2="Name";
    public static final String  COL_3="Amount";
    public static final String  COL_A="ID";
    public static final String  COL_B="Name";
    public static final String  COL_C="Amount";


    public DatabaseHelper( Context context) {
        super(context, DATABASE_NAME, null,1);
        SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("create table " + TABLE_NAME+"(ID integer primary key autoincrement, Name text, Amount float)");
        db.execSQL("create table " + TABLE_NAME2+"(ID integer primary key autoincrement, Name text, Amount float)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
    }
}
