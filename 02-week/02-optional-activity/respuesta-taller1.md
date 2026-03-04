# Actividad Práctica – Estructuras de Datos

## Estudiante: Melanie Lizeth Sánchez Polanía 

## Aplicaciones seleccionadas:
- Instagram
- TikTok

<img src="https://www.periodicocubano.com/wp-content/uploads/2025/01/Instagram-lanza-funciones-similares-a-TikTok-para-hacerle-la-competencia-1200x675.jpg" width="550">

## 📸 INSTAGRAM

### 1️⃣ Tipo de dato: Usuarios
**Datos que maneja:**
- Nombre de usuario
- Correo electrónico
- Foto de perfil
- Biografía
- Seguidores y seguidos

**Organización:**
Podría organizarse mediante una **estructura tipo objeto o registro**, donde cada usuario es una entidad con múltiples atributos.

Ejemplo:
- Lista de usuarios
  - Usuario 1
  - Usuario 2
  - Usuario 3

### 2️⃣ Tipo de dato: Publicaciones
**Datos que maneja:**
- Imagen o video
- Descripción
- Fecha de publicación
- Número de likes
- Comentarios

**Organización:**
Podría organizarse en una **lista enlazada o arreglo dinámico**, donde las publicaciones se ordenan por fecha (más recientes primero).

### 3️⃣ Tipo de dato: Comentarios
**Datos que maneja:**
- Usuario que comenta
- Texto del comentario
- Fecha
- Respuestas

**Organización:**
Podrían organizarse en una **estructura tipo árbol**, ya que existen comentarios principales y respuestas dentro de ellos.

## 🎵 TIKTOK

### 1️⃣ Tipo de dato: Videos
**Datos que maneja:**
- Archivo de video
- Descripción
- Música utilizada
- Número de vistas
- Likes y compartidos

**Organización:**
Podrían almacenarse en una **lista ordenada por algoritmo**, dependiendo de intereses del usuario.

### 2️⃣ Tipo de dato: Interacciones
**Datos que maneja:**
- Likes
- Comentarios
- Compartidos
- Tiempo de visualización

**Organización:**
Podrían organizarse mediante **tablas de registro**, donde cada interacción queda asociada a un usuario y a un video específico.

### 3️⃣ Tipo de dato: Seguidores
**Datos que maneja:**
- Lista de personas que siguen al usuario
- Lista de personas seguidas

**Organización:**
Podría representarse como un **grafo**, donde cada usuario es un nodo y las conexiones representan las relaciones de seguimiento.

Conclusión

Es importante reconocer que en aplicaciones como Instagram y TikTok ya se utilizan estructuras como:

- Listas
- Árboles
- Grafos
- Registros

Esto demuestra que la organización de datos está presente en situaciones cotidianas y es fundamental para el funcionamiento eficiente de las aplicaciones que usamos diariamente.

### 📌 Descripción de la evidencia – Comentarios y Respuestas

En la captura se observa una publicación específica con su sección de comentarios.

<img src="https://github.com/MelannieSanchez-2026/estructura-datos-2026-a-g1/blob/main/02-week/02-optional-activity/imagen.jpeg" width="200">

Desde el punto de vista estructural, los comentarios pueden representarse como una **estructura tipo árbol**, ya que existe una jerarquía:

- Comentario principal
  - Respuesta 1
  - Respuesta 2
    - Subrespuesta (si aplica)

Cada comentario almacena:
- Usuario
- Texto
- Fecha
- Número de likes
- Respuestas asociadas

**Orden:**  
Los comentarios principales aparecen listados y cada uno puede contener nodos secundarios (respuestas).

**Operaciones identificables:**
- Insertar comentario
- Insertar respuesta
- Eliminar comentario
- Recorrer la estructura jerárquica
- Dar like a comentario

### 📌 Descripción de la evidencia – Lista de Seguidores

En la captura se observa la sección de seguidores de un perfil.

<img src="https://github.com/MelannieSanchez-2026/estructura-datos-2026-a-g1/blob/main/02-week/02-optional-activity/imagen1.jpeg" width="200">

Visualmente se presenta como una lista vertical de usuarios, donde cada elemento contiene:
- Foto de perfil
- Nombre de usuario
- Botón de seguimiento

Desde el punto de vista conceptual, esta estructura puede modelarse como:

1. Una **lista**, para mostrar los seguidores.
2. Un **grafo dirigido**, donde:
   - Cada usuario es un nodo.
   - Cada relación de seguimiento es una arista.

**Orden:**  
Generalmente se muestran en orden cronológico o según relevancia.

**Operaciones identificables:**
- Agregar seguidor
- Eliminar seguidor
- Buscar usuario
- Recorrer la lista
