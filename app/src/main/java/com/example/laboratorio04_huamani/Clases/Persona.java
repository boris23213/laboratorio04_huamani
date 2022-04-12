package com.example.laboratorio04_huamani.Clases;

import java.io.Serializable;

public class Persona implements Serializable {
    //se crean las variables
    private  String nombre;
    private  String apellido;
    private  String telefono;
    //generar el constructor de todos los datos

    public Persona() {
    }

    public Persona(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    //generar los métodos get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
