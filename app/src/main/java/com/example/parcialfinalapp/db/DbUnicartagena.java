package com.example.parcialfinalapp.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;

public class DbUnicartagena extends  DbHelper{

    Context context;

    public DbUnicartagena(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertarPrograma(String nombre){

        long id = 0;

        try{

            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("nombre", nombre );
            id = db.insert(TABLA_PROGRAMAS, null, values);

        }catch (Exception ex){
            ex.toString();
        }
        return id;
    }
}
