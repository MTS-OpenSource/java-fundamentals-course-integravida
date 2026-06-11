# Lección 2 — Variables y Tipos de Datos
**Duración:** ~8 minutos

---

## [0:00 — 0:40] Introducción

> *Mostrar editor online con código vacío.*

En la lección anterior aprendiste a imprimir texto en pantalla.

Pero los programas reales necesitan **recordar información**: el nombre de un usuario, su edad, su puntaje en un juego.

Para eso existen las **variables**.

---

## [0:40 — 2:00] ¿Qué es una variable?

> *Dibujar o mostrar animación de una caja con etiqueta.*

Imagina una variable como una **caja con un nombre**.

Dentro de la caja guardas un dato. Puedes abrirla cuando quieras para leer o cambiar ese dato.

```
┌─────────────┐
│    edad     │  ←  nombre de la variable
│─────────────│
│     15      │  ←  valor guardado
└─────────────┘
```

En Java, para crear una variable necesitas decir **tres cosas**:
1. Qué tipo de dato vas a guardar
2. El nombre de la variable
3. El valor inicial

---

## [2:00 — 4:30] Los 4 tipos de datos básicos

> *Escribir en el editor cada ejemplo mientras se explica.*

### `int` — números enteros

```java
int edad = 15;
int puntaje = 100;
int año = 2024;
```

Usa `int` cuando el número **no tiene decimales**.

---

### `double` — números decimales

```java
double altura = 1.65;
double temperatura = 36.6;
double precio = 9.99;
```

Usa `double` cuando el número **sí tiene decimales**.

---

### `String` — texto

```java
String nombre = "Ana";
String ciudad = "Lima";
String mensaje = "Bienvenido al curso";
```

El texto siempre va entre **comillas dobles**. La S de `String` es **mayúscula**.

---

### `boolean` — verdadero o falso

```java
boolean estaActivo = true;
boolean tieneTarea = false;
```

Solo puede tener dos valores: `true` o `false`. Muy útil para decisiones.

---

## [4:30 — 6:00] Usar variables en pantalla

> *Escribir el siguiente bloque en el editor paso a paso.*

Ahora vamos a crear varias variables y mostrarlas:

```java
public class MisDatos {
    public static void main(String[] args) {
        String nombre = "Carlos";
        int edad = 16;
        double altura = 1.72;
        boolean estudia = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Estudia: " + estudia);
    }
}
```

> *Señalar el `+` al mostrar.*

El símbolo `+` entre comillas y una variable **une el texto con el valor**. A esto se le llama **concatenación**.

> *Ejecutar y mostrar el resultado.*

---

## [6:00 — 7:15] Cambiar el valor de una variable

> *Mostrar en editor.*

Las variables pueden cambiar de valor durante el programa:

```java
int puntaje = 0;
System.out.println("Puntaje inicial: " + puntaje);

puntaje = 50;
System.out.println("Nuevo puntaje: " + puntaje);

puntaje = 100;
System.out.println("Puntaje final: " + puntaje);
```

Nota que al **cambiar** el valor no escribes el tipo (`int`) de nuevo. Solo escribes el nombre y el nuevo valor.

---

## [7:15 — 8:00] Prueba tú mismo + Cierre

> *Mantener editor en pantalla.*

Crea un programa con tus propios datos:
- Tu nombre
- Tu edad
- Tu materia favorita
- Si tienes mascota (true o false)

Imprímelos todos en pantalla.

En la próxima lección veremos **operadores**: cómo sumar, restar, comparar valores y más.
