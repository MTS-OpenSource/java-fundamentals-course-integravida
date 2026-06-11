public class MisOperadores {

    public static void main(String[] args) {
        // --- Operadores aritméticos ---
        int a = 10;
        int b = 3;

        System.out.println("=== Aritméticos ===");
        System.out.println("Suma:        " + (a + b)); // 13
        System.out.println("Resta:       " + (a - b)); // 7
        System.out.println("Multiplica:  " + (a * b)); // 30
        System.out.println("División:    " + (a / b)); // 3 (entero)
        System.out.println("Módulo:      " + (a % b)); // 1

        // División con decimales — usar double
        double division = 10.0 / 3;
        System.out.println("División exacta: " + division); // 3.3333...

        // --- Operadores de comparación ---
        int edad = 16;

        System.out.println("\n=== Comparación ===");
        System.out.println("edad == 16: " + (edad == 16)); // true
        System.out.println("edad != 18: " + (edad != 18)); // true
        System.out.println("edad > 10:  " + (edad > 10)); // true
        System.out.println("edad < 10:  " + (edad < 10)); // false
        System.out.println("edad >= 16: " + (edad >= 16)); // true
        System.out.println("edad <= 15: " + (edad <= 15)); // false

        // --- Operadores lógicos ---
        boolean tienePermiso = true;

        System.out.println("\n=== Lógicos ===");
        System.out.println(
            "Mayor de 13 Y tiene permiso: " + (edad >= 13 && tienePermiso)
        ); // true
        System.out.println(
            "Mayor de 18 O tiene permiso: " + (edad >= 18 || tienePermiso)
        ); // true
        System.out.println("NO tiene permiso:            " + (!tienePermiso)); // false

        // --- Ejercicio integrado ---
        System.out.println("\n=== Mi ejercicio ===");
        int miEdad = 16;
        int aniosFaltantes = 18 - miEdad;
        boolean tiene15OMas = miEdad >= 15;

        System.out.println("Mi edad: " + miEdad);
        System.out.println("Me faltan " + aniosFaltantes + " años para los 18");
        System.out.println("Tengo 15 o más: " + tiene15OMas);
    }
}
