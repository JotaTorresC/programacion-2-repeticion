package org.example.model;

import java.util.ArrayList;

public class VehiculoPrincipal {
    String tamanoVehiculo;
    String placa;
    String modelo;
    String marca;
    String color;
    String numeroChasis;
    ArrayList<Propietario> asociados;


    public VehiculoPrincipal() {

    }

    public VehiculoPrincipal(String tamanoVehiculo, String placa, String modelo, String marca,
                             String color, String numeroChasis) {
        this.numeroChasis = numeroChasis;
        this.tamanoVehiculo = tamanoVehiculo;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;

    }

    public String getTamanoVehiculo() {
        return tamanoVehiculo;
    }

    public void setTamanoVehiculo(String tamanoVehiculo) {
        this.tamanoVehiculo = tamanoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public ArrayList<Propietario> getAsociados() {
        return asociados;
    }

    public void setAsociados(ArrayList<Propietario> asociados) {
        this.asociados = asociados;
    }

    @Override
    public String toString() {
        return "haz ingresado estos datos:" +
                "\ntamaño = " + tamanoVehiculo +
                "\nplaca = " + placa +
                "\nmodelo = " + modelo +
                "\nmarca = " + marca +
                "\ncolor = " + color +
                "\ntipo = " + numeroChasis ;
    }
}
