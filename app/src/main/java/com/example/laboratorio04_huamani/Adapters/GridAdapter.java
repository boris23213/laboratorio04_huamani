package com.example.laboratorio04_huamani.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.laboratorio04_huamani.R;

import java.util.ArrayList;
//se crea la clase              se aplica herencia
public class GridAdapter extends BaseAdapter {
    //se crean las variables
private Context context;
private LayoutInflater inflater;
private ArrayList<String> nombres;
private ArrayList<Integer> numeroimagenes;

//constructor
    public GridAdapter(Context context, //dame el contexto
                       ArrayList<String> nombres, //dame el arreglo de nombre
                       ArrayList<Integer> numeroimagenes) {//dame el arreglo de las imágenes
        this.context = context;
        this.nombres = nombres;
        this.numeroimagenes = numeroimagenes;
    }

    // se completan los métodos
    @Override
    public int getCount() {
        return nombres.size(); //retornar la cantidad del tamaño del arreglo nombre
    }

    @Override
    public Object getItem(int i) {
        return nombres.get(i);//extrae un nombre en especifico
    }

    @Override
    public long getItemId(int i) {
        return i;//si pide el id, traer el id especifico, en este caso la variable "i"
    }

    @Override
    public View getView
    //que se hacía normalmente cuando se quería enlazar una caja de texto al componente gráfico,
    //primero de crea el componente, el concatenado para luego ya poder trabajar
    (int i, View view, ViewGroup viewGroup) {//la variable int es fila por fila, tiene que indicar
    if (inflater == null) { //que pasa si el inflater es nulo, no sabe en qué contexto se va agregar, no sabe donde
    inflater = (LayoutInflater)  // toma uno por defecto del sistema
    context.getSystemService
    (Context.LAYOUT_INFLATER_SERVICE);
    }
    if (view == null) { // que pasaría si la vista es nula, cuando por alguna razón se quiere cargar la interfaz y nos saltamos el diseño previo
    view = inflater.inflate(R.layout.item_grid, // se va a llenar, así sea nulo, se llena con
    null);
    }
    //agregar el view, porque daría error, porque se está trabajando dentro de un arreglo
//la variable imageView está preguntando a la fila que está recibiendo ,una de las celdas de esa gridview, ya se crea ahí,
    ImageView imageView = view.findViewById(R.id.imagenUsua);//se crea una variable, que va apuntar
        // a la imagen imagenUsua, se agrega "view" porque se está trabando fila por fila
    TextView textView = view.findViewById(R.id.tvUsua);//se crea la variable que concatena a tvUsua
    textView.setText(nombres.get(i));// vas en el texto con la posición que va ir recorriendo (nombre)
    imageView.setImageResource(numeroimagenes.get(i));//este método significa, del arreglo numeroimagenes
    // que es un entero, extráeme donde has hecho la fila especifica
    //setImageResource indica donde está la ruta o recurso, donde nosotros solo tenemos que dar la variable

    return view;//retorna la vista "view"
    }
    }
/* aplicamos herencia, que herede el BasaAdapter
 * basaadapter es una clase abstracta y se tiene que implementar todos los métodos
 *
 * el método getCount, cuantos elementos tiene ese adaptador , arreglo
 * getItem, que item en específico se va extraer
 * getItemId, traer un elemento en específico
 * getView es Fila por Fila, que se va hacer fila por fila
 *
 * la variable contexto, para indicar que interfaz se va a llenar
 * la variable  LayoutInflater, variable que permitirá llenar ese o los componente
 * diseñar los arreglos, un arreglo donde se van extraer los nombre que se van a mostrar y otro don nombre de la variable de imagen
 * todas la imágenes sin excepción son mapeadas como numero*/
