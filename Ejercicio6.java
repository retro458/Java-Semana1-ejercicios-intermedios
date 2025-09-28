import java.util.Scanner;

public class Ejercicio6 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Número de estudiantes no válido.");
            return;
        }

        double[] notas = new double[n];
        ingresarNotas(notas);
        mostrarEstadisticas(notas);

        sc.close();
    }

    // Método para ingresar las notas
    public static void ingresarNotas(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            if (notas[i] < 0) {
                System.out.println("Nota no válida, se asignará 0.");
                notas[i] = 0;
            }
        }
    }

    // Método para calcular y mostrar estadísticas
    public static void mostrarEstadisticas(double[] notas) {
        double suma = 0;
        double mayor = notas[0];
        double menor = notas[0];

        for (double nota : notas) {
            suma += nota;
            if (nota > mayor) mayor = nota;
            if (nota < menor) menor = nota;
        }

        double promedio = suma / notas.length;

        System.out.println("\n===== Estadísticas =====");
        System.out.println("Promedio general: " + promedio);
        System.out.println("Nota más alta: " + mayor);
        System.out.println("Nota más baja: " + menor);
    }
}
