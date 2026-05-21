# Semana 14 – Entregable: Introducción a Eficiencia

## Contexto

Este documento presenta el análisis comparativo de dos algoritmos, evaluando cuál crece más rápido cuando el tamaño de los datos aumenta y cuál es más eficiente en términos de tiempo de ejecución.

---

## Algoritmos analizados

### Algoritmo A
```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

### Algoritmo B
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

---

## ¿Cuántas operaciones realiza cada uno?

### Algoritmo A — Un solo ciclo

El ciclo se repite exactamente `n` veces. Por cada vuelta, realiza **una sola operación** (imprimir `i`).

| Tamaño de datos (n) | Operaciones realizadas |
|---------------------|------------------------|
| 10                  | 10                     |
| 100                 | 100                    |
| 1.000               | 1.000                  |
| 10.000              | 10.000                 |

El número de operaciones crece **igual** que el tamaño de los datos. Si `n` se duplica, las operaciones también se duplican.

### Algoritmo B — Ciclo dentro de ciclo

El ciclo externo se repite `n` veces, y por cada vuelta del ciclo externo, el ciclo interno se repite otras `n` veces. Esto significa que el total de operaciones es `n × n = n²`.

| Tamaño de datos (n) | Operaciones realizadas |
|---------------------|------------------------|
| 10                  | 100                    |
| 100                 | 10.000                 |
| 1.000               | 1.000.000              |
| 10.000              | 100.000.000            |

El número de operaciones crece **al cuadrado** del tamaño de los datos. Si `n` se duplica, las operaciones se **cuadruplican**.

---

## Comparación visual del crecimiento

```
Operaciones
    |
100M|                                          ● B
    |
 10M|                             ● B
    |
 1M |                  ● B
    |
100K|
    |
 10K|        ● B          ● A
    |
  1K|              ● A
    |
 100|   ● B    ● A
    |
  10|   ● A
    |__________________________________ n
         10   100  1.000  10.000
```

El Algoritmo A crece de forma suave y controlada. El Algoritmo B se dispara rápidamente.

---

## Notación Big-O

| Algoritmo   | Notación | Significado                                      |
|-------------|----------|--------------------------------------------------|
| Algoritmo A | O(n)     | Crece proporcional al tamaño de los datos.       |
| Algoritmo B | O(n²)    | Crece al cuadrado del tamaño de los datos.       |

- **O(n)** → si `n` se multiplica por 10, el tiempo también se multiplica por 10.
- **O(n²)** → si `n` se multiplica por 10, el tiempo se multiplica por **100**.

---

## ¿Cuál crece más rápido?

El **Algoritmo B** crece mucho más rápido. Con `n = 1.000`, el Algoritmo A realiza 1.000 operaciones mientras que el Algoritmo B realiza **1.000.000**. La diferencia se vuelve crítica a medida que los datos aumentan.

---

## ¿Cuál es más eficiente?

El **Algoritmo A** es más eficiente porque:

1. Usa **un solo ciclo**, por lo que el número de operaciones crece de forma lineal y predecible.
2. Con grandes cantidades de datos, consume **significativamente menos tiempo** que el Algoritmo B.
3. Su comportamiento es **escalable**: funciona bien tanto con 10 elementos como con 10.000.

El Algoritmo B puede ser aceptable para valores pequeños de `n`, pero se vuelve **impráctico** rápidamente cuando los datos crecen, ya que su tiempo de ejecución se dispara al cuadrado.

---

## Diferencia entre eficiencia en tiempo y en espacio

| Tipo de eficiencia | Algoritmo A                         | Algoritmo B                          |
|--------------------|-------------------------------------|--------------------------------------|
| **Tiempo**         | O(n) — eficiente                    | O(n²) — ineficiente con datos grandes|
| **Espacio**        | O(1) — solo usa la variable `i`     | O(1) — solo usa las variables `i`, `j`|

En este caso, ambos algoritmos usan la misma cantidad de memoria (solo variables de contador), por lo que la diferencia clave está en la **eficiencia en tiempo**.

---

## Conclusión

Un algoritmo eficiente no es solo el que produce el resultado correcto, sino el que lo hace **en el menor tiempo posible**, especialmente cuando trabaja con grandes volúmenes de datos. El Algoritmo A, con su ciclo único O(n), representa una solución escalable y eficiente. El Algoritmo B, con sus ciclos anidados O(n²), puede funcionar para datos pequeños, pero se convierte en un problema real cuando `n` crece.

> Elegir la estructura de datos y el algoritmo correcto desde el diseño es lo que diferencia una buena solución de una solución que simplemente funciona.
