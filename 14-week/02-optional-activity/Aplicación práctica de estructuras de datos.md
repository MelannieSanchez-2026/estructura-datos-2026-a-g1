# Semana 13 – Entregable: Aplicación Práctica de Estructuras de Datos

## Contexto

Este documento presenta el diseño de un sistema sencillo que combina múltiples estructuras de datos para resolver un problema real de gestión de información.

---

## Sistema diseñado: Gestor de Biblioteca

Un sistema que permite registrar libros, llevar el historial de préstamos, gestionar la fila de reservas y organizar los géneros literarios de forma jerárquica.

---

## Tipos de datos que maneja el sistema

| # | Tipo de dato          | Descripción                                              |
|---|-----------------------|----------------------------------------------------------|
| 1 | Libros                | Colección principal de libros registrados en la biblioteca |
| 2 | Historial de préstamos | Registro de las últimas acciones realizadas (préstamos/devoluciones) |
| 3 | Cola de reservas      | Usuarios que esperan turno para un libro disponible      |
| 4 | Categorías de géneros | Organización jerárquica de géneros y subgéneros literarios |

---

## Asignación de estructuras de datos

| Tipo de dato           | Estructura        | Justificación                                                                 |
|------------------------|-------------------|-------------------------------------------------------------------------------|
| Libros                 | Lista enlazada    | Permite agregar y eliminar libros dinámicamente sin tamaño fijo.              |
| Historial de préstamos | Pila              | La última acción registrada es la primera en consultarse o deshacerse.        |
| Cola de reservas       | Cola              | Se respeta el orden de llegada: el primero en reservar es el primero atendido.|
| Categorías de géneros  | Árbol binario     | Representa relaciones jerárquicas entre géneros y subgéneros.                 |

---

## Justificación de cada estructura

### Lista enlazada → Libros
El catálogo de libros crece y cambia constantemente: se agregan nuevos títulos y se retiran otros. La lista enlazada permite estas operaciones de forma dinámica sin necesidad de definir un tamaño fijo desde el inicio, a diferencia de un arreglo estático.

### Pila → Historial de préstamos
Cuando un usuario quiere consultar o deshacer la última acción (por ejemplo, cancelar un préstamo recién registrado), lo más lógico es acceder al evento más reciente primero. La pila sigue el principio **LIFO** (Last In, First Out), ideal para este comportamiento.

### Cola → Cola de reservas
Si varios usuarios reservan el mismo libro, deben ser atendidos en el orden en que llegaron. La cola sigue el principio **FIFO** (First In, First Out), lo que garantiza equidad y orden en el procesamiento de turnos.

### Árbol binario → Categorías de géneros
Los géneros literarios tienen una estructura jerárquica natural: un género principal puede dividirse en subgéneros, y estos en categorías más específicas. El árbol binario representa estas relaciones padre–hijo de forma clara y permite recorrerlas eficientemente.

---

## Diagrama del árbol binario de géneros

```
              Literatura           ← Nivel 0 (Raíz)
             /          \
         Ficción       No Ficción  ← Nivel 1 (Nodos internos)
         /    \           /    \
    Ciencia  Terror  Historia  Ciencia  ← Nivel 2 (Hojas)
    Ficción                    Popular
```

---

## Idea conceptual en Java

```java
// Lista enlazada: catálogo de libros
List<String> libros = new LinkedList<>();
libros.add("El Principito");
libros.add("Cien años de soledad");

// Pila: historial de préstamos
Stack<String> historial = new Stack<>();
historial.push("Préstamo: El Principito - Usuario: Ana");
historial.push("Devolución: Cien años de soledad - Usuario: Luis");

// Cola: reservas pendientes
Queue<String> reservas = new LinkedList<>();
reservas.add("Usuario: Carlos - Libro: El Principito");
reservas.add("Usuario: María - Libro: El Principito");

// Árbol binario: categorías de géneros (estructura conceptual)
// Nodo raíz: Literatura
// Hijo izquierdo: Ficción | Hijo derecho: No Ficción
```

---

## Interacción entre las estructuras

```
  [Lista enlazada]         [Cola de reservas]
   Catálogo de libros  →   Usuarios en espera
         |                        |
         ↓                        ↓
  Cuando un libro         Cuando el libro
  está disponible         se libera, el
                          primero en cola
                          es atendido
         |
         ↓
  [Pila - Historial]
  Cada préstamo o
  devolución se registra
  → se puede deshacer
  la última acción
         |
         ↓
  [Árbol binario]
  El libro registrado
  se clasifica dentro
  de su género en la
  jerarquía de categorías
```

### Flujo de una operación completa

1. Un nuevo libro se agrega a la **lista enlazada** (catálogo).
2. Se clasifica dentro del **árbol binario** según su género literario.
3. Un usuario solicita el libro → entra a la **cola de reservas**.
4. Cuando el libro está disponible, se presta al primero de la cola.
5. El préstamo se registra en la **pila** del historial.
6. Si hay un error, se consulta la pila para deshacer la última acción.

---

## Comparación de estructuras usadas

| Estructura     | Principio     | Operación principal       | Uso en el sistema              |
|----------------|---------------|---------------------------|--------------------------------|
| Lista enlazada | Dinámica      | Agregar / eliminar        | Catálogo de libros             |
| Pila           | LIFO          | Push / Pop                | Historial de préstamos         |
| Cola           | FIFO          | Enqueue / Dequeue         | Reservas de usuarios           |
| Árbol binario  | Jerárquico    | Insertar / recorrer       | Clasificación de géneros       |
