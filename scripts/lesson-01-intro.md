# Lección 1 — ¿Qué es Java y la Programación?
**Duración:** ~6 minutos

---

## [0:00 — 0:45] Introducción

> *Mostrar pantalla en blanco del editor online (JDoodle). Hablar mirando a cámara o narración en off.*

Hola, bienvenido al curso de Java para principiantes.

En esta primera lección vamos a responder tres preguntas muy simples:
- ¿Qué es programar?
- ¿Qué es Java?
- ¿Cómo se ve un programa de verdad?

No necesitas instalar nada. Todo lo haremos directo en el navegador.

---

## [0:45 — 2:00] ¿Qué es programar?

> *Mostrar una animación simple o dibujo en pantalla de una persona dando instrucciones.*

Imagina que le das instrucciones a alguien paso a paso:

1. Abre la puerta.
2. Entra a la cocina.
3. Enciende la luz.

Eso es exactamente lo que hace un programa: **una lista de instrucciones que la computadora sigue en orden**.

La diferencia es que la computadora no entiende español. Necesitas hablarle en un **lenguaje de programación**.

---

## [2:00 — 3:30] ¿Qué es Java?

> *Mostrar el logo de Java brevemente, luego regresar al editor.*

Java es uno de los lenguajes de programación más usados en el mundo. Lo encontrarás en:

- Aplicaciones de bancos y hospitales
- Videojuegos como Minecraft
- Aplicaciones de Android
- Sistemas de empresas grandes

¿Por qué aprender Java?

- Es **ordenado y claro** — te obliga a escribir código limpio
- Es **multiplataforma** — corre en Windows, Mac y Linux
- Tiene **muchísimos recursos** para aprender

---

## [3:30 — 5:00] Tu primer programa

> *Abrir JDoodle en pantalla. Escribir el código en vivo lentamente.*

Vamos a escribir el programa más famoso del mundo: **Hola Mundo**.

Abre el editor en el enlace de la descripción y escribe esto:

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
    }
}
```

> *Pausar y señalar cada parte mientras se explica.*

Vamos parte por parte:

- `public class HolaMundo` — defines el nombre de tu programa. En Java todo vive dentro de una **clase**.
- `public static void main(String[] args)` — este es el **punto de inicio**. Cuando ejecutas el programa, Java busca exactamente esta línea para saber por dónde empezar.
- `System.out.println(...)` — esta instrucción le dice a Java: **imprime esto en pantalla**.
- `"Hola, mundo!"` — el texto entre comillas es lo que se va a mostrar.

> *Hacer clic en Run y mostrar el resultado.*

¡Lo ves! En la consola aparece: `Hola, mundo!`

---

## [5:00 — 5:45] Prueba tú mismo

> *Mantener el editor en pantalla.*

Ahora es tu turno. Cambia el texto `"Hola, mundo!"` por tu nombre. Por ejemplo:

```java
System.out.println("Hola, soy Ana!");
```

Haz clic en Run y mira cómo cambia el resultado.

También puedes agregar más líneas:

```java
System.out.println("Hola, soy Ana!");
System.out.println("Estoy aprendiendo Java.");
System.out.println("Esto es genial!");
```

Cada `println` imprime una línea nueva.

---

## [5:45 — 6:00] Cierre

En la próxima lección aprenderás a **guardar información** en tu programa usando variables. Nos vemos ahí.
