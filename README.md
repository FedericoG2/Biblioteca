# 📚 Sistema de Gestión de Biblioteca

Un sistema de consola desarrollado en **Java** que permite gestionar el inventario de una biblioteca, aplicando principios fundamentales de la Programación Orientada a Objetos (POO).

## 🚀 Instrucciones de Ejecución

1. **Requisitos:** Tener instalado el JDK (versión 17 o superior) y un IDE como NetBeans, IntelliJ o Eclipse.
2. **Clonación/Descarga:** 
   - Clonar el repositorio: `git clone https://github.com/FedericoG2/Biblioteca.git`
   - O descargar y extraer el archivo ZIP.
3. **Ejecución:**
   - Abrir el proyecto en el IDE.
   - Localizar la clase `Principal.java` (o `Main.java`) en el paquete `com.mycompany.biblioteca`.
   - Hacer clic derecho y seleccionar **Run File**.

## 📂 Estructura del Proyecto

El proyecto sigue una arquitectura de capas simple:

- `Prestable`: Interfaz que define el contrato de comportamiento con los métodos prestar() y devolver()
- `MaterialBiblioteca`: Clase abstracta que implementa Prestable y define los atributos comunes (Título, Año).
- `Libro`: Clase hija que extiende de MaterialBiblioteca e implementa la lógica específica (Autor) y los métodos de la interfaz.
- `Biblioteca`: Clase controladora que gestiona la lógica de la lista (ArrayList) y los métodos de negocio.
- `Main`: Interfaz de usuario por consola con menú interactivo y manejo de excepciones.

## 👤 Integrantes y Roles

*   **Federico Gonzalez**: Estudiante de Analista en Sistemas en IES Siglo 21 - Rol : Desarrollo. 
    *   *Nota: Proyecto realizado de forma individual.*

## 🧠 Desafíos Encontrados

- **Encapsulamiento:** Decidir correctamente entre modificadores `private` y `protected` para permitir que las clases hijas accedan a variables necesarias sin exponerlas al `Main`.
- **Persistencia en memoria:** Gestión de búsquedas y actualizaciones de estado (prestado/disponible) dentro de una colección dinámica (`ArrayList`).
- **Validación de entrada:** Implementación de bloques `try-catch` para evitar que el programa colapse ante entradas de texto erróneas del usuario.

## 🛠️ Uso de IA y Herramientas Externas

- **Gemini (IA):** Utilizada como apoyo pedagógico para entender conceptos de herencia, el funcionamiento de la anotación `@Override`, y la configuración de seguridad (Tokens) en el despliegue a GitHub.
- **Git/GitHub:** Para el control de versiones y almacenamiento remoto.
- **Apache Maven:** Para la gestión de la estructura del proyecto y compilación.
