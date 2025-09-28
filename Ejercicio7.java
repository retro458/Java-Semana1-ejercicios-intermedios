import java.util.Scanner;
import java.util.Random;

public class Ejercicio7 {

    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("===== Juego: Adivina el número =====");
        jugar();
        sc.close();
    }

    public static void jugar() {
        int numeroSecreto = rand.nextInt(100) + 1; // genera entre 1 y 100
        int intentos = 0;
        int adivinanza;

        do {
            System.out.print("Ingresa tu intento (1-100): ");
            adivinanza = sc.nextInt();
            intentos++;

            if (adivinanza > numeroSecreto) {
                System.out.println("Demasiado alto");
            } else if (adivinanza < numeroSecreto) {
                System.out.println("Demasiado bajo");
            } else {
                System.out.println("¡Felicidades! Lo lograste en " + intentos + " intentos.");
            }

        } while (adivinanza != numeroSecreto);
    }
}
