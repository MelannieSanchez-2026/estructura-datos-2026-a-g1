import java.util.Scanner;

//MELANNIE LIZETH SANCHEZ POLNIA
//MelannieSanchez-2026

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;

        if (count == 0) {
            System.out.print("Enter the size of the vector: ");
            count = scanner.nextInt();
        }

        // Vectores
        Double[] vectorA = new Double[count];
        Double[] vectorB = new Double[count];
        Double[] vectorC = new Double[count]; // suma
        Double[] vectorResta = new Double[count];
        Double[] vectorMultiplicacion = new Double[count];

        int i;

        // Vector A
        for (i = 0; i < vectorA.length; i++) {
            vectorA[i] = (double) (i + 1);
        }

        // Vector B
        for (i = 0; i < vectorB.length; i++) {
            vectorB[i] = vectorA[i] * 2;
        }

        // Suma (C)
        for (i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        // Resta
        for (i = 0; i < vectorResta.length; i++) {
            vectorResta[i] = vectorA[i] - vectorB[i];
        }

        // Multiplicación
        for (i = 0; i < vectorMultiplicacion.length; i++) {
            vectorMultiplicacion[i] = vectorA[i] * vectorB[i];
        }

        // Salida
        System.out.println("\nVector A:");
        for (i = 0; i < vectorA.length; i++) {
            System.out.print(vectorA[i].intValue() + " - ");
        }

        System.out.println("\nVector B:");
        for (i = 0; i < vectorB.length; i++) {
            System.out.print(vectorB[i].intValue() + " * ");
        }

        System.out.println("\nSuma (A + B):");
        for (i = 0; i < vectorC.length; i++) {
            System.out.print(vectorC[i].intValue() + " | ");
        }

        System.out.println("\nResta (A - B):");
        for (i = 0; i < vectorResta.length; i++) {
            System.out.print(vectorResta[i].intValue() + " | ");
        }

        System.out.println("\nMultiplicación (A * B):");
        for (i = 0; i < vectorMultiplicacion.length; i++) {
            System.out.print(vectorMultiplicacion[i].intValue() + " | ");
        }
    }
}