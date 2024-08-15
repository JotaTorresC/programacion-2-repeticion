package org.example.model;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTransporte {

     ArrayList<Propietario> propietarios ;
     ArrayList<VehiculoPrincipal> vehiculos;
     ArrayList<VehiculoTransporte> vehiculoTransportes;
     ArrayList<Usuario> usuarios;

    public MainTransporte(){
        propietarios = new ArrayList<>();
        vehiculos = new ArrayList<>();
        vehiculoTransportes = new ArrayList<>();
        usuarios = new ArrayList<>();

    }

    public void inicializarDatosDePrueba() {
        VehiculoPrincipal vehiculoPrincipal1 = new VehiculoPrincipal();
        vehiculoPrincipal1.setPlaca("tsy47f");

        Propietario propietario1 = new Propietario();
        propietario1.setNombre("jason");
        propietario1.setEdad(25);

        Propietario propietario2 = new Propietario();
        propietario2.setNombre("jason");
        propietario2.setEdad(99);

        Propietario propietario3 = new Propietario();
        propietario3.setNombre("jason");
        propietario3.setEdad(10);



        System.out.println("El nombre del propietario es " + propietario1.getNombre() +
                " y la placa de su carro es " + vehiculoPrincipal1.getPlaca());

        VehiculoTransporte vehiculoTransporte1 = new VehiculoTransporte();
        vehiculoTransporte1.setPlaca("jpt79g");
        vehiculoTransporte1.setMaximoPasajero(5);

        VehiculoTransporte vehiculoTransporte2 = new VehiculoTransporte();
        vehiculoTransporte2.setPlaca("bjk28k");
        vehiculoTransporte2.setMaximoPasajero(3);

        VehiculoTransporte vehiculoTransporte3 = new VehiculoTransporte();
        vehiculoTransporte3.setPlaca("ijh56g");
        vehiculoTransporte3.setMaximoPasajero(4);

        Usuario usuario1 = new Usuario();
        usuario1.setPeso(20);
        usuario1.setNombre("natalia");
        Usuario usuario2 = new Usuario();
        usuario2.setPeso(50);
        usuario2.setNombre("juan");
        Usuario usuario3 = new Usuario();
        usuario3.setPeso(100);
        usuario3.setNombre("samuel");

        propietarios.add(propietario1);
        propietarios.add(propietario2);
        propietarios.add(propietario3);
        vehiculos.add(vehiculoPrincipal1);
        vehiculoTransportes.add(vehiculoTransporte1);
        vehiculoTransportes.add(vehiculoTransporte2);
        vehiculoTransportes.add(vehiculoTransporte3);
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

    }

    public  void crearPropietario(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del propietario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el numero de identificacion del propietario: ");
        String identificacion = scanner.nextLine();

        System.out.print("Ingrese el correo del propietario: ");
        String correo = scanner.nextLine();

        System.out.print("Ingrese el telefono del propietario: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese la edad del propietario: ");
        int edad = scanner.nextInt();
        
        // Crear el objeto Propietario
        Propietario propietario = new Propietario(nombre, identificacion, correo, telefono, edad);

        propietarios.add(propietario);

        System.out.println("\n" + propietario);

    }

    public  void crearVehiculo(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vehiculo: ");
        String tamanoVehiculo = scanner.nextLine();

        System.out.print("Ingrese la placa del vehiculo: ");
        String placa = scanner.nextLine();

        System.out.print("Ingrese el modelo del vehiculo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese ingrese la marca del vehiculo: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el color del vehiculo: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese el tipo del vehiculo: ");
        String tipo = scanner.nextLine();

        VehiculoPrincipal vehiculo = new VehiculoPrincipal(tamanoVehiculo, placa, modelo, marca, color, tipo);

        vehiculos.add(vehiculo);

        System.out.println("\n" + vehiculo);
    }

    /*public int calcularTotalPasajeros() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de pasajeros y agregarla al vehículo.
        System.out.print("Ingrese la cantidad de pasajeros del viaje: ");
        int cantidadPasajeros = scanner.nextInt();

        Vehiculo vehiculoActual = vehiculos.get(vehiculos.size() - 1);
        vehiculoActual.setCantidadPasajeros(cantidadPasajeros);

        int totalPasajeros = 0;
        for (Vehiculo vehiculo : vehiculos) {
            totalPasajeros += vehiculo.getCantidadPasajeros();
        }

        return totalPasajeros;
    }*/


    public  void buscarNumeroPlacaCarro() throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de placa que desea buscar: ");
        String numeroPlaca = scanner.nextLine();

        boolean carroEncontrado = false;

        for (Propietario propietario : propietarios) {
            for (VehiculoPrincipal vehiculo : vehiculos){
                if (vehiculo.getPlaca().equals(numeroPlaca)){

                    System.out.print("el dueño del carro es " + propietario.getNombre());
                    carroEncontrado = true;
                    break;
                }

                if (carroEncontrado) {

                    break;

                }
            }
        }

        if (!carroEncontrado) {

            throw new Exception("Este carro no existe");

        }
    }

    public  void buscarCantidadPasajeroVehiculoTransporte() throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de placa que desea buscar: ");
        String numeroPlaca = scanner.nextLine();

        boolean carroEncontrado = false;


        for (VehiculoTransporte vehiculoTransporte : vehiculoTransportes){
            if (vehiculoTransporte.getPlaca().equals(numeroPlaca)){
                System.out.print("la cantidad de pasajeros en el dia fue " + vehiculoTransporte.getMaximoPasajero());
                carroEncontrado = true;
                break;
            }

            if (carroEncontrado) {

                break;
            }
        }

        if (!carroEncontrado) {

            throw new Exception("Este carro no existe");

        }
    }

    public void imprimirUsuariosPorPeso(double pesoMinimo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getPeso() > pesoMinimo) {
                System.out.println(usuario);
            }
        }
    }

    public void contarPropietariosMayores() {
        int contador = 0;
        for (Propietario propietario : propietarios) {
            if (propietario.getEdad() > 40) {
                contador++;
            }
        }
        System.out.println("Número de propietarios mayores de 40 años: " + contador);
    }

}