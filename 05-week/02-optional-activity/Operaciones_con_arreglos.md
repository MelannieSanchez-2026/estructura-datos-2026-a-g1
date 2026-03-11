# 📊 Registro de Ventas Semanales en Java

Este programa fue desarrollado en **Java** para practicar operaciones básicas con **arreglos**.  
Permite registrar las ventas realizadas durante una semana (de lunes a domingo) y realizar diferentes cálculos a partir de esos datos.

El objetivo del ejercicio es reforzar conceptos fundamentales de programación como el **recorrido de arreglos, acumulación de valores, comparación de datos y conteo de ocurrencias**.

## 🎯 Objetivos del programa

El programa permite practicar las siguientes operaciones:

- 🔁 Recorrer un arreglo usando un ciclo `for`.
- ➕ Calcular la **suma total de ventas**.
- 📊 Calcular el **promedio de ventas**.
- 📈 Encontrar la **venta más alta**.
- 📉 Encontrar la **venta más baja**.
- 🔎 Contar cuántos días tuvieron **ventas mayores a 100**.

Estas operaciones son muy comunes en análisis de datos y en sistemas que procesan información numérica.

## ⚙️ Funcionamiento del programa

El programa sigue estos pasos:

1. Se crea un **arreglo de 7 posiciones** para almacenar las ventas de cada día de la semana.
2. Se solicita al usuario ingresar el valor de las ventas para cada día.
3. Se recorre el arreglo para:
   - Mostrar las ventas registradas.
   - Calcular la suma total.
   - Identificar el valor máximo y mínimo.
   - Contar las ventas mayores a 100.
4. Finalmente se calcula el promedio y se muestran los resultados en consola.

## 💻 Código del programa

```java
import java.util.Scanner;

public class VentasSemana {
    public static void main(String[] args) {

        // Objeto para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Arreglo que almacenará las ventas de los 7 días
        double[] ventas = new double[7];

        // Arreglo auxiliar para mostrar los nombres de los días
        String[] dias = {
                "Lunes", "Martes", "Miércoles",
                "Jueves", "Viernes", "Sábado", "Domingo"
        };

        // Variables para cálculos
        double suma = 0;              // Acumula todas las ventas
        double promedio;              // Promedio de ventas
        double max;                   // Venta más alta
        double min;                   // Venta más baja
        int contadorMayores100 = 0;   // Días con ventas mayores a 100


        // -------------------------------------------------------
        // 1. INGRESO DE DATOS
        // Se pide al usuario ingresar las ventas de cada día
        // -------------------------------------------------------

        for (int i = 0; i < ventas.length; i++) {

            System.out.print("Ingrese la venta del " + dias[i] + ": ");
            ventas[i] = scanner.nextDouble();

        }


        // -------------------------------------------------------
        // 2. INICIALIZACIÓN DE MÁXIMO Y MÍNIMO
        // Se toma el primer elemento como referencia inicial
        // -------------------------------------------------------

        max = ventas[0];
        min = ventas[0];


        System.out.println("\n-------------------------------");
        System.out.println("     VENTAS DE LA SEMANA");
        System.out.println("-------------------------------");


        // -------------------------------------------------------
        // 3. RECORRIDO DEL ARREGLO
        // Aquí se realizan varias operaciones al mismo tiempo:
        // - Mostrar ventas
        // - Sumar ventas
        // - Encontrar máximo y mínimo
        // - Contar ventas mayores a 100
        // -------------------------------------------------------

        for (int i = 0; i < ventas.length; i++) {

            // Mostrar cada venta con su día
            System.out.println(dias[i] + ": " + ventas[i]);

            // Acumular suma total
            suma += ventas[i];

            // Comparar para encontrar la venta máxima
            if (ventas[i] > max) {
                max = ventas[i];
            }

            // Comparar para encontrar la venta mínima
            if (ventas[i] < min) {
                min = ventas[i];
            }

            // Contar días con ventas mayores a 100
            if (ventas[i] > 100) {
                contadorMayores100++;
            }
        }


        // -------------------------------------------------------
        // 4. CÁLCULO DEL PROMEDIO
        // Promedio = suma total / cantidad de elementos
        // -------------------------------------------------------

        promedio = suma / ventas.length;


        // -------------------------------------------------------
        // 5. MOSTRAR RESULTADOS
        // -------------------------------------------------------

        System.out.println("\n-------------------------------");
        System.out.println("RESULTADOS");
        System.out.println("-------------------------------");

        System.out.println("Venta total: " + suma);
        System.out.println("Promedio de ventas: " + promedio);
        System.out.println("Venta más alta: " + max);
        System.out.println("Venta más baja: " + min);
        System.out.println("Días con ventas mayores a 100: " + contadorMayores100);

        // Cerrar Scanner
        scanner.close();
    }
}
```
## 🧾 Evidencia visual

Captura de la ejecución del programa en consola:

<img src="https://github.com/MelannieSanchez-2026/estructura-datos-2026-a-g1/blob/main/05-week/02-optional-activity/EvidenciaCg.png" width="800">
