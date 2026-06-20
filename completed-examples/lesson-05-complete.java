import java.util.Scanner;

public class SistemaAcceso {

    public static void main(String[] args) {
        // Iniciamos escaner para leer la entrada de usuario
        Scanner teclado = new Scanner(System.in);

        System.out.println("Sistema de registro de participantes");

        // Capturar datos de entrada
        System.out.print("Ingrese nombre: ");
        String nombre_usuario = teclado.nextLine();

        System.out.print("Ingrese area o especialidad: ");
        String area_usuario = teclado.nextLine();

        // Procesamiento y Salida
        imprimir(nombre_usuario, area_usuario);

        // Cierre
        teclado.close();
    }

    public static void imprimir(String nombre, String area) {
        if (nombre.trim().isEmpty() || area.trim().isEmpty()) {
            System.out.println("Campos vacíos.");
            return;
        }

        System.out.println("CREDENCIAL");
        System.out.println("Nombre : " + nombre.toUpperCase());
        System.out.println("Area   : " + area.toUpperCase());
    }
}