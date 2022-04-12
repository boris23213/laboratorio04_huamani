package com.example.laboratorio04_huamani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.example.laboratorio04_huamani.Adapters.GridAdapter;

import java.util.ArrayList;

public class ejemplogrid extends AppCompatActivity {
    //se crea la variable
    private GridView gv01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplogrid);

        //se enlaza la variable

        gv01=(GridView) findViewById(R.id.gva1);

        //se va a llenar el arreglo de nombre e imágenes
//arreglo para los nombres

        ArrayList<String> nombres=new ArrayList<>();
        nombres.add("Boris");
        nombres.add("Juan");
        nombres.add("Luis");
        nombres.add("Gustavo");
        //Arreglo para las imágenes


        ArrayList<Integer> numeroimagenes = new ArrayList<>();
        numeroimagenes.add(R.drawable.boris_imag);
        numeroimagenes.add(R.drawable.juan_imag);
        numeroimagenes.add(R.drawable.luis_imag);
        numeroimagenes.add(R.drawable.gustavo_img);


        //llenar el adapter con la clase que se ha creado, se envía el arreglo nombre e imágenes
        GridAdapter adapter =new GridAdapter(this,nombres,numeroimagenes);
        //y que lo llene
        gv01.setAdapter(adapter);
    }
}