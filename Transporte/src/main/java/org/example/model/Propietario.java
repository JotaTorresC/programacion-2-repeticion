package org.example.model;

import java.util.ArrayList;

public class Propietario {
    String nombre;
    String identificacion;
    String correo;
    String telefono;
    int edad;
    ArrayList <VehiculoPrincipal> vehiculo;

    public Propietario() {

    }

    public Propietario(String nombre, String identificacion, String correo, String telefono, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setVehiculo(ArrayList<VehiculoPrincipal> vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {this.edad = edad;}

    public ArrayList<VehiculoPrincipal> getVehiculo() {
        return vehiculo;
    }

    @Override
    public String toString() {
        return "haz ingresado estos datos:" +
                "\nnombre = " + nombre +
                "\nidentificacion = " + identificacion +
                "\ncorreo = " + correo +
                "\ntelefono = " + telefono +
                "\nedad = " + edad;

    }
}
