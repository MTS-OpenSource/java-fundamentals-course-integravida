public class MisDatos {

    public static void main(String[] args) {
        // String: texto entre comillas dobles
        String nombre = "Carlos";

        // int: número entero sin decimales
        int edad = 16;

        // double: número con decimales
        double altura = 1.72;

        // boolean: solo true o false
        boolean tieneMascota = true;

        // Imprimir cada variable usando + para unir texto y valor
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Tiene mascota: " + tieneMascota);

        // Las variables pueden cambiar de valor
        edad = 17;
        System.out.println("Edad actualizada: " + edad);
    }
}
