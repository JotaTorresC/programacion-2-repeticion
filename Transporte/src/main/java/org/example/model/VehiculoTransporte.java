package org.example.model;

import java.util.ArrayList;

public class VehiculoTransporte extends VehiculoPrincipal{

    private int maximoPasajero;

    ArrayList<Usuario> usuarios;

    public VehiculoTransporte(){

    }

    public VehiculoTransporte(int maximoPasajero, String tamanoVehiculo, String placa, String modelo, String marca, String color, String numeroChasis) {

        super(tamanoVehiculo, placa, modelo, marca, color, numeroChasis);
        this.maximoPasajero = maximoPasajero;

    }

    public int getMaximoPasajero() {
        return maximoPasajero;
    }

    public void setMaximoPasajero(int maximoPasajero) {
        this.maximoPasajero = maximoPasajero;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
