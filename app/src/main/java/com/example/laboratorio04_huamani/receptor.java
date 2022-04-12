package com.example.laboratorio04_huamani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class receptor extends AppCompatActivity {
    //referencia del textview donde se mostrarán los datos
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);
        texto=(TextView) findViewById(R.id.tvDatosReceptor);


        String mensaje="";//concatenación de los datos
        Intent obt=getIntent();
        //get extras es cuando lo recepciona, es de tipo Bundle
        Bundle datos=obt.getExtras();


        //mensaje que va ser la concatenación de estos datos, los cuales se menciona la variable creada y luego lo imprime
//por medio de un objeto Bundle, se está llenando los datos, se está enviando, se está obteniendo, e imprimiendo tal como se envió

        mensaje= (String) datos.get("vnombre")+ "\n" + datos.getString("vapellido") + "\n" + (String) datos.get("vtelefono");
        texto.setText(mensaje);
    }
}
/*esta interfaz solo va a tener una tarjeta de texto donde se van a mostrar las variables
 * el diseño va ser
 * tvDatosReceptor*/
