// Una clase es el "molde" para crear objetos.
// Aquí definimos la clase Paciente FUERA del main (arriba de él).
class Paciente {

    // Atributos: datos que tendrá cada paciente
    // "private" significa que solo se pueden cambiar desde dentro de la clase
    private String nombre;
    private int edad;
    private double nivelGlucosa;

    // Constructor: se ejecuta cuando creamos un objeto con "new"
    public Paciente(String nombre, int edad, double nivelGlucosa) {
        this.nombre       = nombre;
        this.edad         = edad;
        this.nivelGlucosa = nivelGlucosa;
    }

    // Getters: métodos para leer los atributos desde afuera
    public String getNombre()       { return nombre; }
    public int    getEdad()         { return edad; }
    public double getNivelGlucosa() { return nivelGlucosa; }

    // Setter: método para modificar un atributo desde afuera
    public void setNivelGlucosa(double nuevoNivel) {
        nivelGlucosa = nuevoNivel;
    }

    // Método propio de la clase: comportamiento del objeto
    public void mostrarInfo() {
        System.out.println("Paciente : " + nombre);
        System.out.println("Edad     : " + edad + " años");
        System.out.println("Glucosa  : " + nivelGlucosa + " mg/dL");
        System.out.println("----------------------------");
    }
}

public class ClasesYObjetos {

    public static void main(String[] args) {

        // Crear objetos usando el constructor con "new"
        // Cada objeto es una instancia independiente de la clase Paciente
        Paciente paciente1 = new Paciente("Ana García", 45, 95.5);
        Paciente paciente2 = new Paciente("Luis Torres", 60, 180.0);

        // Llamar al método mostrarInfo() de cada objeto
        System.out.println("=== Registro de Pacientes ===");
        paciente1.mostrarInfo();
        paciente2.mostrarInfo();

        // Usar un getter para leer un atributo
        System.out.println("Nombre del paciente 1: " + paciente1.getNombre());

        // Usar un setter para modificar un atributo
        paciente1.setNivelGlucosa(102.3);
        System.out.println("Glucosa actualizada   : " + paciente1.getNivelGlucosa() + " mg/dL");
    }
}
