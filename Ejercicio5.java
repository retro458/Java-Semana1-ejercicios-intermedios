import java.util.Scanner;

public class Ejercicio5 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese un número para calcular su factorial: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long resultado = factorial(n);
            System.out.println("El factorial de " + n + " es: " + resultado);
        }

        sc.close();
    }

    // Método para calcular factorial 
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
