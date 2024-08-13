package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTransporte {

    static ArrayList<Propietario> propietarios = new ArrayList<>();
    static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    //preguntar porq en todos los metodos me pidio que los colocara estaticos
    //y porque no me dejo hacerlo asi
    /*public MainTransporte(){
         propietarios = new ArrayList<>();
         vehiculos = new ArrayList<>();

    }*/

    public static void mostrarDatosDePrueba() {

        String modeloCarro = "kia";
        int cantidadPersonas = 25;
        String tipoCarro = "El tipo de carro es de pasajeros";

        System.out.println("estos son los datos de prueba" + "\n" + "Modelo: " + modeloCarro + "\n" + "Cantidad de personas: " +
                cantidadPersonas + "\n" + tipoCarro);

    }

    public static void crearPropietario(){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del propietario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el numero de identificacion del propietario: ");
        String identificacion = scanner.nextLine();

        System.out.print("Ingrese el correo del propietario: ");
        String correo = scanner.nextLine();

        System.out.print("Ingrese el telefono del propietario: ");
        String telefono = scanner.nextLine();
        
        // Crear el objeto Propietario
        Propietario propietario = new Propietario(nombre, identificacion, correo, telefono);

        propietarios.add(propietario);

        System.out.println("\n" + propietario);

    }

    public static void crearVehiculo(){

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

        Vehiculo vehiculo = new Vehiculo(tamanoVehiculo, placa, modelo, marca, color, tipo);

        vehiculos.add(vehiculo);

        System.out.println("\n" + vehiculo);
    }

    public static void buscarNumeroPlacaCarro() throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de placa que desea buscar: ");
        String numeroPlaca = scanner.nextLine();

        boolean carroEncontrado = false;

        for (Propietario propietario : propietarios) {
            for (Vehiculo vehiculo : vehiculos){
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



    public static void main(String[] args) throws Exception {

        System.out.println("----------------");
        System.out.println("----------------");
        mostrarDatosDePrueba();

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("aki se muestra los datos del propietario");
        crearPropietario();

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("aki se muestra los datos del vehiculo");
        crearVehiculo();


        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("aki se muestra el propietario del carro ");
        buscarNumeroPlacaCarro();


    }

}