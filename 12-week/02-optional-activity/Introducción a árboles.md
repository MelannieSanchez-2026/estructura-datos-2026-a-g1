# Semana 11 – Entregable: Árbol de Estructura Organizacional

## Contexto

Este documento presenta el diseño de un árbol que representa la estructura organizacional de una empresa, aplicando los conceptos de la Semana 11: nodos, raíz, hojas, altura y relaciones padre–hijo.

---

## Diagrama del árbol

```
              Gerente General          ← Nivel 0 (Raíz)
              /             \
     Departamento A     Departamento B  ← Nivel 1 (Nodos internos)
       /       \             /       \
  Empleado 1  Empleado 2  Empleado 3  Empleado 4  ← Nivel 2 (Hojas)
```

---

## Identificación de elementos

| Elemento        | Nodo(s)                                                     |
|-----------------|-------------------------------------------------------------|
| **Raíz**        | Gerente General                                             |
| **Nodos internos** | Departamento A, Departamento B                           |
| **Hojas**       | Empleado 1, Empleado 2, Empleado 3, Empleado 4              |
| **Altura**      | 2 (hay 3 niveles: 0, 1 y 2)                                 |

---

## Explicación de los elementos

### Raíz
El **Gerente General** es el nodo principal del árbol. No tiene padre; todos los demás nodos dependen jerárquicamente de él. Representa la autoridad máxima de la empresa.

### Nodos internos
El **Departamento A** y el **Departamento B** son nodos que tienen padre (el Gerente General) y también tienen hijos (los empleados). Están en el nivel 1 del árbol y representan las áreas funcionales de la organización.

### Hojas
Los **Empleados 1, 2, 3 y 4** son nodos hoja: tienen padre (su departamento respectivo), pero **no tienen hijos**. Se ubican en el nivel 2 y representan a las personas que no gestionan a otros dentro de esta estructura.

### Altura del árbol
La altura es **2**, ya que el camino más largo desde la raíz hasta una hoja pasa por 2 aristas:

```
Gerente General → Departamento A → Empleado 1
```

Esto equivale a 3 niveles (0, 1 y 2), pero la altura se mide en número de aristas (o saltos), que en este caso es 2.

---

## Relaciones padre–hijo

| Padre             | Hijos                          |
|-------------------|--------------------------------|
| Gerente General   | Departamento A, Departamento B |
| Departamento A    | Empleado 1, Empleado 2         |
| Departamento B    | Empleado 3, Empleado 4         |
| Empleado 1        | _(ninguno — es hoja)_          |
| Empleado 2        | _(ninguno — es hoja)_          |
| Empleado 3        | _(ninguno — es hoja)_          |
| Empleado 4        | _(ninguno — es hoja)_          |

---

## ¿Por qué esta estructura es un árbol?

- Los datos tienen una **jerarquía clara**: hay un líder que supervisa departamentos, y estos supervisan empleados.
- Cada nodo tiene **exactamente un padre** (excepto la raíz).
- No existen ciclos ni conexiones cruzadas entre nodos del mismo nivel.
- La organización es **vertical y ramificada**, lo opuesto a una estructura lineal como una lista o una fila.

---

## Comparación: árbol vs estructura lineal

| Aspecto               | Lista (lineal)                  | Árbol (este ejemplo)                  |
|-----------------------|---------------------------------|---------------------------------------|
| Forma                 | Secuencia                       | Jerarquía                             |
| Relación entre nodos  | Uno después del otro            | Padre – hijos                         |
| Ejemplo               | Lista de empleados              | Organigrama de la empresa             |
| Navegación            | Solo hacia adelante/atrás       | Por niveles y ramas                   |
