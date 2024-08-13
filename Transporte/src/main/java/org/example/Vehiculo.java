package org.example;

public class Vehiculo {
    String tamanoVehiculo;
    String placa;
    String modelo;
    String marca;
    String color;
    String tipo;

    public Vehiculo(String tamanoVehiculo, String placa, String modelo, String marca, String color, String tipo) {
        this.tamanoVehiculo = tamanoVehiculo;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "haz ingresado estos datos:" +
                "\nnombre = " + tamanoVehiculo + ", " +
                "\nidentificacion = " + placa + ", " +
                "\ncorreo = " + modelo + ", " +
                "\ntelefono = " + marca + ", " +
                "\ntelefono = " + color + ", " +
                "\ntelefono = " + tipo ;
    }


}
