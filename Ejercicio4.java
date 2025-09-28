//Serie fibonacci

import java.util.Scanner;

public class Ejercicio4 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos de la serie Fibonacci que desea ver: ");
        int n = scanner.nextInt();

       mostrarFibonacci(n);

        scanner.close();
    }

    public static void mostrarFibonacci(int num) {
       if(num <=0){
       System.out.println("Debe ingresasr un numero mayor a");
       return;
       }
    long a=0, b=1; //los primeros dos terminos
    System.out.print("Serie Fibonacci:("+ num + "Terminos): ");

    for(int i=1; i<=num; i++) {
        System.out.print(a + (i < num ? ", " : ""));
        long siguiente = a + b; //siguiente termino es la suma de los dos anteriores
        a = b; //actualizar a y b para el siguiente termino
        b = siguiente;
    }
    System.out.println();
  }

}