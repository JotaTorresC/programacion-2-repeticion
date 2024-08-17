package org.example.model;

public class Main{

    public static void main(String[] args) throws Exception {
        MainTransporte transporte = new MainTransporte();

        System.out.println("----------------");
        System.out.println("----------------");
        transporte.inicializarDatosDePrueba();

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

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("aki se muestra el total de pasajeros de un carro buscando por placa");
        transporte.buscarCantidadPasajeroVehiculoTransporte();

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("aki se muestra muestra que usuarios tienen mas del peso permitido");
        transporte.imprimirUsuariosPorPeso(50);

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("aki se la cantidad de propietarios mayores de 40 años");
        transporte.contarPropietariosMayores();

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("aki se la cantidad total de pasajeros en el dia");
        transporte.calcularTotalPasajeros();

    }
}
