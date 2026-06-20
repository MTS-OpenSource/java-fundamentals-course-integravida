import java.util.Scanner;

public class MiEntradaSalida {

    public static void main(String[] args) {
        // TODO 1: Inicializa Scanner para leer datos desde la consola (System.in)
        // Pista: Scanner teclado = new Scanner(System.in);

        System.out.println("Sistema de registro de participantes");

        // TODO 2: Solicita y guarda el nombre del usuario
        // Pista: System.out.print("Ingrese nombre: "); String nombre_usuario = teclado.nextLine();

        // TODO 3: Solicita y guarda el área o especialidad del usuario de la misma manera
        // Pista: System.out.print("Ingrese area o especialidad: ");


        // TODO 4: Se imprime pasando las dos variables como argumentos
        // Pista: imprimir(nombreUsuario, areaUsuario);


        // TODO 5: Se cierra el Scanner
        // Pista: teclado.close();
    }

    //Este método debe encargarse de recibir los datos y mostrarlos con un diseño limpio.

    public static void imprimir(String nombre, String area) {
        // TODO 6: Se añade una validación defensiva. 
        // Si "nombre" o "area" están vacíos (usando .trim().isEmpty()), hace un error y retorna.


        // TODO 7: Imprime la credencial
        // Pista: Se usa .toUpperCase() en String.
        // Ejemplo de salida:
        // System.out.println("CREDENCIAL");
        // System.out.println("Nombre : " + nombre.toUpperCase());
        // System.out.println("Area   : " + area.toUpperCase());
    }
}
