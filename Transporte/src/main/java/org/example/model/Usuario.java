package org.example.model;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private int edad;
    private double peso;
    ArrayList<VehiculoTransporte> vehiculoTransporte;

    public Usuario(){

    }

    public Usuario(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre  + " " +
                "peso = " + peso + "Kg\n";
    }
}
