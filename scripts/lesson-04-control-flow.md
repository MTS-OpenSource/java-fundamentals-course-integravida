# Lección 4 — Estructuras de Control: Decisiones y Bucles

**Duración:** ~10 minutos

---

## [0:00 — 0:45] Introducción

> *Mostrar JDoodle con un programa Java vacío.*

En la lección anterior aprendiste a comparar valores usando operadores como `>=`, `<` o `==`.

Pero comparar un valor no es suficiente. Ahora necesitamos que el programa haga algo diferente según el resultado de esa comparación.

Por ejemplo:

* Si un estudiante aprueba, mostrar un mensaje de felicitación.
* Si no aprueba, mostrar que debe seguir practicando.
* Si queremos mostrar cinco niveles de un juego, no queremos escribir el mismo mensaje cinco veces.

Para eso usamos las **estructuras de control**.

Hoy aprenderás tres:

1. `if-else` para tomar decisiones.
2. `for` para repetir una cantidad conocida de veces.
3. `while` para repetir mientras una condición sea verdadera.

---

## [0:45 — 1:30] ¿Qué es una decisión en un programa?

> *Mostrar en pantalla la siguiente idea o explicarla con un ejemplo cotidiano.*

Todos los días tomamos decisiones.

Por ejemplo:

> Si llueve, llevo paraguas.
> Si no llueve, no lo llevo.

Un programa puede hacer exactamente lo mismo.

Primero evalúa una condición que puede ser `true` o `false`.

Después decide qué bloque de código ejecutar.

En Java usamos `if` para decir “si esta condición es verdadera”.

Y usamos `else` para decir “si no se cumple”.

---

## [1:30 — 3:30] Tomar decisiones con `if-else`

> *Escribir el código paso a paso en JDoodle.*

```java
public class EstructurasControl {
    public static void main(String[] args) {
        int puntaje = 75;

        if (puntaje >= 60) {
            System.out.println("¡Aprobaste el juego!");
        } else {
            System.out.println("Sigue practicando para mejorar tu puntaje.");
        }
    }
}
```

> *Ejecutar el programa.*

El programa guarda `75` en la variable `puntaje`.

Luego pregunta:

```java
puntaje >= 60
```

Esto significa: “¿el puntaje es mayor o igual que 60?”

Como `75` sí es mayor que `60`, la condición es `true`.

Por eso se ejecuta este bloque:

```java
System.out.println("¡Aprobaste el juego!");
```

La estructura general es esta:

```java
if (condicion) {
    // Se ejecuta si la condición es true
} else {
    // Se ejecuta si la condición es false
}
```

> *Cambiar `75` por `45` y ejecutar nuevamente.*

```java
int puntaje = 45;
```

Ahora la condición es `false`, porque `45` no es mayor o igual que `60`.

Por eso Java ejecuta el bloque `else`.

Las llaves `{ }` indican qué instrucciones pertenecen al `if` y cuáles pertenecen al `else`.

---

## [3:30 — 4:20] Recordatorio: la condición debe dar `true` o `false`

> *Mostrar ejemplos breves en el editor.*

Dentro de un `if` debemos colocar una condición.

Estas condiciones devuelven `true` o `false`:

```java
edad >= 18
puntaje == 100
vidas > 0
nombre.equals("Ana")
```

Por ejemplo:

```java
int edad = 16;

if (edad >= 18) {
    System.out.println("Puedes ingresar.");
} else {
    System.out.println("Aún no tienes la edad necesaria.");
}
```

Recuerda:

```java
=    // guarda o asigna un valor
==   // compara dos valores
```

---

## [4:20 — 6:45] Repetir con `for`

> *Borrar el contenido anterior o crear un nuevo programa en JDoodle.*

Ahora aprenderemos a repetir una acción.

Imagina que quieres mostrar los niveles del 1 al 5 de un juego.

Podrías escribir cinco veces `System.out.println`, pero sería muy largo.

Para eso usamos un bucle `for`.

```java
public class RepetirConFor {
    public static void main(String[] args) {
        for (int nivel = 1; nivel <= 5; nivel++) {
            System.out.println("Nivel " + nivel + " completado");
        }
    }
}
```

> *Ejecutar el programa y mostrar el resultado.*

El resultado será:

```text
Nivel 1 completado
Nivel 2 completado
Nivel 3 completado
Nivel 4 completado
Nivel 5 completado
```

Observemos esta parte:

```java
for (int nivel = 1; nivel <= 5; nivel++)
```

Tiene tres partes:

```java
int nivel = 1
```

Crea la variable `nivel` y empieza en 1.

```java
nivel <= 5
```

Es la condición. El bucle se repite mientras `nivel` sea menor o igual que 5.

```java
nivel++
```

Aumenta el valor de `nivel` en uno después de cada repetición.

El símbolo `++` significa “sumar uno”.

Por eso:

```java
nivel++
```

es una forma corta de escribir:

```java
nivel = nivel + 1;
```

Usa `for` cuando sabes cuántas veces quieres repetir una acción.

---

## [6:45 — 8:35] Repetir con `while`

> *Crear un nuevo programa en JDoodle.*

El bucle `while` también repite instrucciones.

La diferencia es que se ejecuta mientras una condición sea verdadera.

Veamos un juego con tres vidas:

```java
public class RepetirConWhile {
    public static void main(String[] args) {
        int vidas = 3;

        while (vidas > 0) {
            System.out.println("Te quedan " + vidas + " vidas.");
            vidas--;
        }

        System.out.println("Juego terminado.");
    }
}
```

> *Ejecutar el programa.*

El resultado será:

```text
Te quedan 3 vidas.
Te quedan 2 vidas.
Te quedan 1 vidas.
Juego terminado.
```

Esta es la estructura general:

```java
while (condicion) {
    // Instrucciones que se repiten
}
```

En nuestro ejemplo:

```java
while (vidas > 0)
```

significa:

> Mientras las vidas sean mayores que cero, sigue mostrando el mensaje.

Dentro del bloque usamos:

```java
vidas--;
```

Esto resta uno a la variable `vidas`.

Es igual a escribir:

```java
vidas = vidas - 1;
```

Es importante cambiar la variable dentro del `while`.

Si `vidas` nunca cambiara, la condición siempre sería verdadera y el programa no terminaría.

---

## [8:35 — 9:25] ¿Cuándo usar `for` y cuándo usar `while`?

> *Mostrar esta comparación en pantalla.*

Usa `for` cuando conoces la cantidad de repeticiones.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Aquí sabemos que queremos repetir cinco veces.

Usa `while` cuando no sabes exactamente cuántas veces se repetirá algo.

```java
while (vidas > 0) {
    vidas--;
}
```

Aquí el programa continúa mientras todavía existan vidas.

---

## [9:25 — 10:00] Prueba tú mismo + Cierre

> *Mantener JDoodle abierto y mostrar el reto como comentario.*

Ahora prueba crear un programa que simule un juego.

Debe hacer lo siguiente:

```java
// 1. Crea una variable llamada puntaje.
// 2. Usa if-else para mostrar si el jugador ganó.
//    Gana con 50 puntos o más.
// 3. Usa un for para mostrar las rondas del 1 al 3.
// 4. Crea una variable llamadas vidas con valor 2.
// 5. Usa while para mostrar las vidas hasta que lleguen a cero.
```

Puedes empezar con esta estructura:

```java
public class MiJuego {
    public static void main(String[] args) {
        // Escribe tu código aquí
    }
}
```

Hoy aprendiste que:

* `if-else` permite que un programa tome decisiones.
* `for` repite una acción una cantidad conocida de veces.
* `while` repite una acción mientras una condición sea verdadera.

En la próxima lección aprenderás a crear métodos para organizar mejor tu código y a leer datos que el usuario escribe.
