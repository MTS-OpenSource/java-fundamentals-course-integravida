public class MiJuego {

```
public static void main(String[] args) {

    int puntaje = 70;

    if (puntaje >= 50) {
        System.out.println("¡Ganaste el juego!");
    } else {
        System.out.println("Sigue practicando para mejorar tu puntaje.");
    }

    for (int ronda = 1; ronda <= 3; ronda++) {
        System.out.println("Ronda " + ronda);
    }

    int vidas = 2;

    while (vidas > 0) {
        System.out.println("Te quedan " + vidas + " vidas.");
        vidas--;
    }

    System.out.println("Juego terminado.");
}
```

}
