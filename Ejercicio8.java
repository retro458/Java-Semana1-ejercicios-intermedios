import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio8 {

    private static Scanner sc = new Scanner(System.in);

    // Clase  para representar un producto
    static class Producto {
        String nombre;
        double precio;
        int cantidad;

        Producto(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }
    }

    public static void main(String[] args) {
        ArrayList<Producto> inventario = new ArrayList<>();
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    registrarProducto(inventario);
                    break;
                case 2:
                    mostrarProductos(inventario);
                    break;
                case 3:
                    valorTotalInventario(inventario);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema de inventario...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }

    // ===== Métodos =====
    public static void mostrarMenu() {
        System.out.println("\n===== Sistema de Inventario =====");
        System.out.println("1. Registrar producto");
        System.out.println("2. Mostrar productos registrados");
        System.out.println("3. Calcular valor total del inventario");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void registrarProducto(ArrayList<Producto> inventario) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la cantidad del producto: ");
        int cantidad = sc.nextInt();
        sc.nextLine(); 

        inventario.add(new Producto(nombre, precio, cantidad));
        System.out.println("Producto registrado correctamente.");
    }

    public static void mostrarProductos(ArrayList<Producto> inventario) {
        if (inventario.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }

        System.out.println("\nProductos registrados:");
        for (Producto p : inventario) {
            System.out.println("Nombre: " + p.nombre + ", Precio: $" + p.precio + ", Cantidad: " + p.cantidad);
        }
    }

    public static void valorTotalInventario(ArrayList<Producto> inventario) {
        if (inventario.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }

        double total = 0;
        for (Producto p : inventario) {
            total += p.precio * p.cantidad;
        }

        System.out.println("Valor total del inventario: $" + total);
    }
}
