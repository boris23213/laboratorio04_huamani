package com.example.laboratorio04_huamani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.laboratorio04_huamani.Clases.Persona;

import java.io.Serializable;

public class datos_persona extends AppCompatActivity {
EditText nombre,apellido,telefono;
TextView respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_persona);
//sobre la interfaz de datos_persona, el botón grabar, las variables deben de ser enviadas a otra interfaz, las va a capturar y las va a mostrar

        nombre= (EditText) findViewById(R.id.txtnombre);
        apellido= (EditText) findViewById(R.id.txtapellido);
        telefono= (EditText) findViewById(R.id.txttelefono);
        respuesta= (TextView) findViewById(R.id.tvmostrarpersona);
    }


    // tendría que enviar los datos a otra interfaz, pero antes de envíalo, indicarle cómo se van a llamar las variables y que se va enviar
//el botón mostrarDatosPersona va llamar al interfaz receptor, pero antes indicar que variables de va enviar

    public void mostrarDatosPersona(View view){
        //el objeto Bundle es usado para enviar una variable de una actividad a otra
        Bundle obj = new Bundle();
        //putString, se está indicando a ese objeto que se va enviar, una de la variable se va a llamar vnombre, se enviara lo que se escriba en la caja de texto
        obj.putString("vnombre",nombre.getText().toString());
        obj.putString("vapellido",apellido.getText().toString());
        obj.putString("vtelefono",telefono.getText().toString());
        // se carga, pero primero se va enviar y luego mostrar la interfaz
        Intent intent = new Intent
                (this,receptor.class);
        //putExtras cuando los envían
        intent.putExtras(obj);
        startActivity(intent);
    }




    //se crea el método para mostrar datos, pero con objeto
    public void mostrarDatosPersonaObjeto(View view){
        //la diferencia con mostrarDatosPersona, que en esta se creaba una variable con un nombre en específico y se mandaba una por una
//lo que se hace en mostrarDatosPersonaObjeto, es crear un objeto de la clase persona
        Bundle obj = new Bundle();
        //en el constructor o get y set,
        Persona per = new Persona();
        //al componente nombre, envés de llenar de forma individual, se está llenando el objeto
        per.setNombre(nombre.getText().toString());
        per.setApellido(apellido.getText().toString());
        per.setTelefono(telefono.getText().toString());
        //llenar el Bundle
// se envía el objeto, a la variable se le va llamar objpersona y el objeto va ser Serializable
        // de esta manera, se envía a la otra interfaz el objeto, la clase, envés de enviar variable por variable
        obj.putSerializable("objpersona", (Serializable) per);
        Intent intent = new Intent
                (this,receptor_objetos.class);
        intent.putExtras(obj);
        startActivity(intent);
    }
}



/*se quiere enviar los datos a otra interfaz
 * para lograrlo, se tiene que observar que en la clase que se envía los datos, ósea la clase intent
 * también se pueda enviar variables, valores, primero variables sueltas como también poder mandar objetos*/
