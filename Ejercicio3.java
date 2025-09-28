//Numero primo

import java.util.Scanner;

public class Ejercicio3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese un numero: ");
       int num = scanner.nextInt();

       if(esPrimo(num)){
        System.out.println("El numero " + num + " es primo");
       } else {
        System.out.println("El numero " + num + " no es primo");
       }

        scanner.close();
 }
    public static boolean esPrimo(int n) {
        if (n <= 1) return false;   // 0, 1 y negativos no son primos
        if (n == 2) return true;    // 2 es primo
        if (n % 2 == 0) return false; // pares > 2 no son primos

        //probar divisores desde 3 hasta raiz de n, esto para evitar comparar el numero de entrada hasta el infinito
        for(int i=3; i <= Math.sqrt(n); i +=2) {
            if (n % i==0) return false;
        }
        return true;
    }

}