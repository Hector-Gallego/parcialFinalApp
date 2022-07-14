package com.example.parcialfinalapp;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.parcialfinalapp.db.DbHelper;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void  crearBD(View view){

        DbHelper dbHelper = new DbHelper(this);
        SQLiteDatabase db =  dbHelper.getWritableDatabase();

        if(db != null){
            Toast.makeText(this, "base de datos creada", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "error al crear la base de datos", Toast.LENGTH_SHORT).show();
        }

    }
}
