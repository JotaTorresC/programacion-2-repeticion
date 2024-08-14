package org.example.model;

public class Main{

    public static void main(String[] args) throws Exception {

        MainTransporte transporte = new MainTransporte();

        System.out.println("----------------");
        System.out.println("----------------");
        transporte.inicializarDatosDePrueba();

        transporte.buscarCantidadPasajeroVehiculoTransporte();

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("aki se muestra los datos del propietario");
        transporte.crearPropietario();

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("aki se muestra los datos del vehiculo");
        transporte.crearVehiculo();

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("aki se muestra el propietario del carro ");
        transporte.buscarNumeroPlacaCarro();

    }
}
