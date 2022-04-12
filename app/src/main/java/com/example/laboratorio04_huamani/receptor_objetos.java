package com.example.laboratorio04_huamani;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.laboratorio04_huamani.Clases.Persona;

public class receptor_objetos extends AppCompatActivity {
//el objetivo es que se envié todo un objeto, no variable por variable
    // para ello se tiene que definir las clases q recibe cada variable, nombre, apellidos y teléfono
    //se crea un paquete llamado clases, donde se crea la clase que corresponde, esta clase persona
// va exponer de las variables que se va enviar
private TextView texto;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor_objetos);
       texto=(TextView) findViewById(R.id.tvDatosReceptorObjetos);//cambia la id del Text View
       //se envía un objeto de la clase persona, pero no se extrae la cadena , si no, el objeto
       String mensaje="";
       Persona p = (Persona) getIntent().getExtras().getSerializable("objpersona") ;
       //lo optimiza
       mensaje = p.getNombre()+ "\n" + p.getApellido() + "\n" + p.getTelefono();
       texto.setText(mensaje);
    }
}