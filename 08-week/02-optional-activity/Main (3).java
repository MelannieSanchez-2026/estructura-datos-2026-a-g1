import java.util.Scanner;

// Melannie Lizeth Sanchez Polania
//MelannieSanchez-2026

public class Main {
    

    // =========================================
    // 1. DEFINICIÓN DEL NODO
    // =========================================
    static class Nodo {
        String dato;
        Nodo siguiente;

        public Nodo(String dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =========================================
        // 2. DIBUJO DE LA LISTA ENLAZADA (SOLO AQUÍ)
        // =========================================
        /*
        REPRESENTACIÓN GRÁFICA DE UNA LISTA ENLAZADA:

        ┌──────────────┐     ┌──────────────┐     ┌──────────────┐     ┌──────────────┐
        │   DATO       │     │   DATO       │     │   DATO       │     │   DATO       │
        │   ENLACE ────┼────>│   ENLACE ────┼────>│   ENLACE ────┼────>│   ENLACE     │
        └──────────────┘     └──────────────┘     └──────────────┘     └──────┬───────┘
                                                                               │
                                                                              null

        CABEZA → Primer nodo
        ÚLTIMO NODO → Apunta a null
        */

        // =========================================
        // 3. INGRESO DE DATOS
        // =========================================
        System.out.println("Ingrese los nombres de 4 estudiantes:");

        System.out.print("Estudiante 1: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Estudiante 2: ");
        String nombre2 = scanner.nextLine();

        System.out.print("Estudiante 3: ");
        String nombre3 = scanner.nextLine();

        System.out.print("Estudiante 4: ");
        String nombre4 = scanner.nextLine();

        // =========================================
        // 4. CREACIÓN DE NODOS
        // =========================================
        Nodo nodo1 = new Nodo(nombre1);
        Nodo nodo2 = new Nodo(nombre2);
        Nodo nodo3 = new Nodo(nombre3);
        Nodo nodo4 = new Nodo(nombre4);

        // =========================================
        // 5. ENLACE DE LOS NODOS
        // =========================================
        nodo1.siguiente = nodo2;
        nodo2.siguiente = nodo3;
        nodo3.siguiente = nodo4;

        // 🔴 ÚLTIMO NODO
        nodo4.siguiente = null;

        // =========================================
        // 6. CABEZA DE LA LISTA
        // =========================================
        Nodo cabeza = nodo1; // 🔵 PRIMER NODO

        // =========================================
        // 7. SALIDA LIMPIA (SIN DIBUJO)
        // =========================================
        System.out.println("\n=================================");
        System.out.println("LISTA ENLAZADA DE ESTUDIANTES");
        System.out.println("=================================");

        System.out.println("Cabeza (primer nodo): " + cabeza.dato);

        System.out.print("Lista: ");

        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }

        System.out.println("null");

        // =========================================
        // 8. EXPLICACIÓN
        // =========================================
        System.out.println("\n¿Por qué es dinámica?");
        System.out.println("1. No tiene tamaño fijo.");
        System.out.println("2. Los nodos se crean en tiempo de ejecución.");
        System.out.println("3. Se conectan mediante referencias.");
        System.out.println("4. Permite modificar la estructura fácilmente.");
        System.out.println("5. No requiere memoria continua.");

        scanner.close();
    }
}