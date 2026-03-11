# 📘 Actividad Práctica 
## Tipos de datos y arreglos unidimensionales  

### Estudiante: Melannie Lizeth Sanchez Polania

## Descripción de la actividad

En esta actividad se desarrolló un programa orientado al uso de arreglos unidimensionales para registrar y analizar las notas de un estudiante.

El objetivo fue aplicar los conceptos de:

- Tipos de datos básicos.
- Declaración y uso de arreglos.
- Recorrido de estructuras mediante ciclos.
- Cálculo de promedio.
- Evaluación mediante estructura condicional.

## Conceptos utilizados

### 1. Tipos de datos

Se utilizaron los siguientes tipos de datos:

- **double**: para almacenar las notas y el promedio, ya que permiten valores decimales.
- **int**: para el control del índice dentro del ciclo.
- **boolean (implícito en la condición)**: para determinar si el estudiante aprobó o no.

La correcta selección del tipo de dato permitió realizar operaciones matemáticas sin errores de conversión.

### 2. Arreglo unidimensional

Se declaró un arreglo de tipo `double` con tamaño fijo de 5 posiciones.

Un arreglo unidimensional permite almacenar múltiples datos del mismo tipo en posiciones indexadas que comienzan en 0.

Características aplicadas:

- Tamaño definido al momento de su creación.
- Acceso a cada elemento mediante índice.
- Recorrido completo usando un ciclo `for`.

### 3. Recorrido del arreglo

Se utilizó un ciclo `for` para:

1. Ingresar las notas.
2. Mostrar las notas almacenadas.
3. Acumular la suma total.

El recorrido permitió acceder a cada elemento utilizando su índice correspondiente.

### 4. Cálculo del promedio

El promedio se calculó mediante la fórmula:

promedio = suma / cantidad_de_notas

Donde:

- `suma` representa la acumulación de todas las notas.
- `cantidad_de_notas` corresponde al tamaño del arreglo.

### 5. Evaluación de aprobación

Se utilizó una estructura condicional `if` para verificar si:

promedio ≥ 3.0

Si la condición se cumple, el estudiante aprueba.  
De lo contrario, reprueba.

## Evidencia de ejecución

La evidencia consiste en una captura de pantalla de la consola en IntelliJ IDEA donde se observa:

- Ingreso de las 5 notas.
- Visualización de las notas almacenadas.
- Cálculo del promedio.
- Mensaje indicando si el estudiante aprobó o reprobó.

## Código en Java

```java
package EstructuraDatos;

import java.util.Scanner;

public class NotasEstudiante {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Encabezado decorativo
        System.out.println("======================================");
        System.out.println("     SISTEMA DE REGISTRO DE NOTAS     ");
        System.out.println("======================================\n");

        // Declaración del arreglo
        double[] notas = new double[5];
        double suma = 0;
        double promedio;

        // Ingreso de datos
        System.out.println("Ingrese las 5 notas del estudiante:\n");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("➤ Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Mostrar notas ingresadas
        System.out.println("\n--------------------------------------");
        System.out.println("        NOTAS REGISTRADAS");
        System.out.println("--------------------------------------");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + " → " + notas[i]);
            suma += notas[i];
        }

        // Cálculo del promedio
        promedio = suma / notas.length;

        System.out.println("\n--------------------------------------");
        System.out.printf("Promedio final: %.2f%n", promedio);
        System.out.println("--------------------------------------");

        // Evaluación del resultado
        if (promedio >= 3.0) {
            System.out.println("🎉 ¡Felicidades! Has aprobado.");
            System.out.println("Buen trabajo, pero recuerda que siempre puedes dar más.");
        } else {
            System.out.println("📘 No alcanzaste el promedio necesario.");
            System.out.println("No te desanimes, con más esfuerzo lo puedes lograr.");
        }

        System.out.println("\n======================================");
        System.out.println("        FIN DEL PROGRAMA");
        System.out.println("======================================");

        scanner.close();
    }
}
```
La captura demuestra que el programa funciona correctamente y cumple con los requerimientos planteados.

<img src="https://github.com/MelannieSanchez-2026/estructura-datos-2026-a-g1/blob/main/04-week/02-optional-activity/evidencia.png" width="800">

## Conclusión

Esta actividad permitió comprender la importancia de:

- Seleccionar correctamente los tipos de datos.
- Utilizar arreglos para organizar información homogénea.
- Recorrer estructuras de datos mediante ciclos.
- Aplicar operaciones matemáticas sobre conjuntos de datos.
- Implementar estructuras condicionales para la toma de decisiones.

El ejercicio fortalece la base lógica necesaria para trabajar posteriormente con estructuras de datos más complejas.
