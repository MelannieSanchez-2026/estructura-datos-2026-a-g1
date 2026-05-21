# Semana 12 – Entregable: Árbol Binario Simple

## Contexto

Este documento presenta el diseño de un árbol binario con las letras **M, F, T, A, H, R, Z**, respetando la regla principal: cada nodo puede tener **máximo dos hijos** (izquierdo y derecho).

---

## Diagrama del árbol

```
              M                  ← Nivel 0 (Raíz)
            /   \
           F     T               ← Nivel 1 (Nodos internos)
          / \   / \
         A   H R   Z             ← Nivel 2 (Hojas)
```

---

## Identificación de elementos

| Elemento            | Nodo(s)                              |
|---------------------|--------------------------------------|
| **Raíz**            | M                                    |
| **Nodos internos**  | F, T                                 |
| **Hojas**           | A, H, R, Z                           |
| **Altura**          | 2 (3 niveles: 0, 1 y 2)              |

---

## Explicación de los elementos

### Raíz
**M** es el nodo principal del árbol. No tiene padre y todos los demás nodos se organizan jerárquicamente a partir de él.

### Nodos internos
**F** y **T** son nodos que tienen padre (M) y también tienen hijos. Cada uno ocupa el nivel 1 y respeta la regla binaria: tienen exactamente dos hijos.

- F → hijo izquierdo: A | hijo derecho: H
- T → hijo izquierdo: R | hijo derecho: Z

### Hojas
**A, H, R y Z** son nodos hoja: tienen padre pero **no tienen hijos**. Se ubican en el nivel 2 y cumplen la condición de que sus referencias izquierda y derecha son `null`.

### Altura del árbol
La altura es **2**, ya que el camino más largo desde la raíz hasta una hoja pasa por 2 aristas:

```
M → F → A
```

---

## Estructura interna de cada nodo

Cada nodo del árbol almacena internamente tres elementos:

```
Nodo:
    dato
    izquierdo
    derecho
```

| Nodo | Dato | Hijo izquierdo | Hijo derecho |
|------|------|----------------|--------------|
| 1    | M    | F              | T            |
| 2    | F    | A              | H            |
| 3    | T    | R              | Z            |
| 4    | A    | null           | null         |
| 5    | H    | null           | null         |
| 6    | R    | null           | null         |
| 7    | Z    | null           | null         |

---

## Relaciones padre–hijo

| Padre | Hijo izquierdo | Hijo derecho |
|-------|----------------|--------------|
| M     | F              | T            |
| F     | A              | H            |
| T     | R              | Z            |
| A     | _(hoja)_       | _(hoja)_     |
| H     | _(hoja)_       | _(hoja)_     |
| R     | _(hoja)_       | _(hoja)_     |
| Z     | _(hoja)_       | _(hoja)_     |

---

## ¿Por qué esta estructura es un árbol binario?

- Cada nodo tiene **máximo dos hijos**: uno izquierdo y uno derecho.
- Existe una **única raíz** (M) sin padre.
- No hay ciclos ni conexiones cruzadas entre nodos.
- Las hojas tienen sus referencias `izquierdo` y `derecho` en `null`.
- La estructura es **jerárquica y limitada**, a diferencia de un árbol general donde un nodo puede tener ilimitados hijos.

---

## Comparación: árbol general vs árbol binario

| Aspecto               | Árbol general                   | Árbol binario (este ejemplo)          |
|-----------------------|---------------------------------|---------------------------------------|
| Número de hijos       | Ilimitado                       | Máximo 2                              |
| Organización          | Jerárquica                      | Jerárquica y limitada                 |
| Ejemplo               | Organigrama de empresa          | Árbol con letras M, F, T, A, H, R, Z |
| Uso común             | Estructuras organizacionales    | Búsquedas y recorridos                |

---

*Documento elaborado como entregable opcional de la Semana 12 – Árbol Binario Simple.*
