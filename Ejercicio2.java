//Calculadora avanzada 

import java.util.Scanner;

public class Ejercicio2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese la base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + Math.pow(num1, num2));
                    break;
                case 6:
                    System.out.print("Ingrese el número: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        System.out.println("Resultado: " + Math.sqrt(num1));
                    } else {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                    break;
                case 7:
                    System.out.println("Gracias por usar la calculadora avanzada. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 7);

        scanner.close();


    }

    public static void mostrarMenu() {
        System.out.println("----- Calculadora Avanzada -----");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");
        System.out.println("6- Raíz Cuadrada");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }
}