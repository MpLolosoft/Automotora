package Automotora;

import java.util.Scanner;

public class Automotora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Auto auto1;
        Auto auto2;
        Auto auto3;
        Auto auto4;
        Auto auto5;

        System.out.println("Ingrese la informacion de los autos");
        System.out.println("Ingrese el Numero de serie del vehiculo #1");
        int numeroSerie1 = scanner.nextInt();
        System.out.println("Ingrese la marca del vehiculo #1");
        String marca1 = scanner.next();
        System.out.println("Ingrese el color del vehiculo #1");
        String color1 = scanner.next();
        System.out.println("Ingrese fecha de fabricacion #1");
        int fabricacion1 = scanner.nextInt();
        System.out.println("Ingrese 1 si cuenta con Velocidad crucero #1");
        boolean velociadCrucero1 = scanner.nextBoolean();

        auto1 = new Auto(numeroSerie1, marca1, color1, fabricacion1, velociadCrucero1);

        System.out.println("**************************************************************************");

        System.out.println("Ingrese el Numero de serie del vehiculo #2");
        int numeroSerie2 = scanner.nextInt();
        System.out.println("Ingrese la marca del vehiculo #2");
        String marca2 = scanner.next();
        System.out.println("Ingrese el color del vehiculo #2");
        String color2 = scanner.next();
        System.out.println("Ingrese fecha de fabricacion #2");
        int fabricacion2 = scanner.nextInt();
        System.out.println("Ingrese 1 si cuenta con Velocidad crucero #2");
        boolean velociadCrucero2 = scanner.nextBoolean();

        auto2 = new Auto(numeroSerie2, marca2, color2, fabricacion2, velociadCrucero2);

        System.out.println("**************************************************************************");

        System.out.println("Ingrese el Numero de serie del vehiculo #3");
        int numeroSerie3 = scanner.nextInt();
        System.out.println("Ingrese la marca del vehiculo #3");
        String marca3 = scanner.next();
        System.out.println("Ingrese el color del vehiculo #3");
        String color3 = scanner.next();
        System.out.println("Ingrese fecha de fabricacion #3");
        int fabricacion3 = scanner.nextInt();
        System.out.println("Ingrese 1 si cuenta con Velocidad crucero #3");
        boolean velociadCrucero3 = scanner.nextBoolean();

        auto3 = new Auto(numeroSerie3, marca3, color3, fabricacion3, velociadCrucero3);

        System.out.println("**************************************************************************");

        System.out.println("Ingrese el Numero de serie del vehiculo #4");
        int numeroSerie4 = scanner.nextInt();
        System.out.println("Ingrese la marca del vehiculo #4");
        String marca4 = scanner.next();
        System.out.println("Ingrese el color del vehiculo #4");
        String color4 = scanner.next();
        System.out.println("Ingrese fecha de fabricacion #4");
        int fabricacion4 = scanner.nextInt();
        System.out.println("Ingrese 1 si cuenta con Velocidad crucero #4");
        boolean velociadCrucero4 = scanner.nextBoolean();

        auto4 = new Auto(numeroSerie4, marca4, color4, fabricacion4, velociadCrucero4);

        System.out.println("**************************************************************************");

        System.out.println("Ingrese el Numero de serie del vehiculo #5");
        int numeroSerie5 = scanner.nextInt();
        System.out.println("Ingrese la marca del vehiculo #5");
        String marca5 = scanner.next();
        System.out.println("Ingrese el color del vehiculo #5");
        String color5 = scanner.next();
        System.out.println("Ingrese fecha de fabricacion #5");
        int fabricacion5 = scanner.nextInt();
        System.out.println("Ingrese 1 si cuenta con Velocidad crucero #5");
        boolean velociadCrucero5 = scanner.nextBoolean();

        auto5 = new Auto(numeroSerie5, marca5, color5, fabricacion5, velociadCrucero5);

        System.out.println("**************************************************************************");

        Auto[] autos = new Auto[]{auto1, auto2, auto3, auto4, auto5};

        System.out.println("Caracteristicas de los autos disponibles");
        for (int i = 0; i < autos.length; i++) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Carcateristicas de los vehiculos # " + i + 1);
            System.out.println("Numero de serie: " + autos[i].getNumeroSerie());
            System.out.println("Marca:  " + autos[i].getMarca());
            System.out.println("Color:" + autos[i].getColor());
            System.out.println("Fabricacion:   " + autos[i].getFabricacion());
            System.out.println("Velicidad Crucero:   " + autos[i].getVelocidadCrucero());
            System.out.println("Precio: " + autos[i].calcularPrecio());
            System.out.println("---------------------------------------------------------------------------");
        }


    }
}

