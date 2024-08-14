package org.example.model;

public class VehiculoCarga extends VehiculoPrincipal{

    private double capacidadCarga;
    private int numeroEjes;

    public  VehiculoCarga(){

    }

    public VehiculoCarga(double capacidadCarga, int numeroEjes, String tamanoVehiculo, String placa,
                         String modelo, String marca, String color, String numeroChasis) {

        super(tamanoVehiculo, placa, modelo, color,  marca, numeroChasis);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;

    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
