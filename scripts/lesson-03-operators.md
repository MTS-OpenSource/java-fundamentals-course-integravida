# Lección 3 — Operadores y Expresiones
**Duración:** ~6 minutos

---

## [0:00 — 0:30] Introducción

> *Mostrar editor con variables ya declaradas.*

Ya sabes guardar datos en variables. Ahora aprenderás a **operar con ellos**: sumar, comparar, combinar condiciones.

Estos son los **operadores** de Java.

---

## [0:30 — 2:30] Operadores aritméticos

> *Escribir en el editor cada ejemplo.*

Son los que usas para hacer cálculos matemáticos:

```java
public class Operadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Suma:        " + (a + b));  // 13
        System.out.println("Resta:       " + (a - b));  // 7
        System.out.println("Multiply:    " + (a * b));  // 30
        System.out.println("División:    " + (a / b));  // 3
        System.out.println("Resto/Módulo:" + (a % b));  // 1
    }
}
```

> *Señalar la división.*

Ojo con la división entre enteros: `10 / 3` en Java da `3`, no `3.33`. Java descarta los decimales cuando divides dos `int`.

Si necesitas decimales, usa `double`:

```java
double resultado = 10.0 / 3;
System.out.println(resultado); // 3.3333...
```

---

## [2:30 — 4:00] Operadores de comparación

> *Agregar al editor.*

Estos operadores **comparan dos valores** y devuelven `true` o `false`:

```java
int edad = 16;

System.out.println(edad == 16);  // true  — ¿es igual a 16?
System.out.println(edad != 18);  // true  — ¿es distinto de 18?
System.out.println(edad > 10);   // true  — ¿es mayor que 10?
System.out.println(edad < 10);   // false — ¿es menor que 10?
System.out.println(edad >= 16);  // true  — ¿es mayor o igual a 16?
System.out.println(edad <= 15);  // false — ¿es menor o igual a 15?
```

> *Resaltar `==` vs `=`.*

Muy importante: `=` **asigna** un valor. `==` **compara** dos valores. Es el error más común de los principiantes.

---

## [4:00 — 5:15] Operadores lógicos

> *Agregar al editor.*

Sirven para **combinar varias comparaciones** en una sola:

```java
int edad = 16;
boolean tienePermiso = true;

// AND — ambas condiciones deben ser true
System.out.println(edad >= 13 && tienePermiso == true);  // true

// OR — al menos una condición debe ser true
System.out.println(edad >= 18 || tienePermiso == true);  // true

// NOT — invierte el valor
System.out.println(!tienePermiso);  // false
```

> *Usar una analogía hablada.*

Piénsalo así:
- `&&` es "Y también" — necesitas **las dos cosas**
- `||` es "O también" — te basta con **una de las dos**
- `!` es "No" — convierte `true` en `false` y viceversa

---

## [5:15 — 6:00] Prueba tú mismo + Cierre

> *Mostrar editor vacío con comentarios guía.*

Escribe un programa que:
1. Guarde tu edad en una variable `int`
2. Calcule cuántos años te faltan para los 18: `18 - tuEdad`
3. Verifique con `>=` si ya tienes 15 años o más
4. Imprima los tres resultados

En la próxima lección aprenderás a tomar **decisiones** en tu programa con `if-else` y a repetir acciones con **bucles**.
