package com.example.laboratorio04_huamani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irGridView(View view){
        Intent intent = new Intent
                (this,ejemplogrid.class);
        startActivity(intent);
    }
    public void irDatosPersona(View view){
        Intent intent = new Intent
                (this,datos_persona.class);
        startActivity(intent);
    }
}