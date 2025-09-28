//EJERCICIO 1-CAJERO AUTOMATICO

import java.util.Scanner;

public class Ejercicio1 {
    //variable con valor inicial para el saldo
    private static double saldo = 1000.0;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: $");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Cantidad inválida. Intente de nuevo.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: $");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Cantidad inválida o fondos insuficientes. Intente de nuevo.");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 4);

        scanner.close();
    }



    // ====== Metodo para menu ==== 
    public static void mostrarMenu() {
        System.out.println("----- Cajero Automático -----");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }


}