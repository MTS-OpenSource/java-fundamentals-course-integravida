// =============================================================
//  Lección 6 — Introducción a POO: Clases y Objetos
//  Proyecto: GlucoSmart (IntegraVida)
//  Ejemplo completo con: clase, atributos, constructor,
//  getters/setters, encapsulación y método personalizado.
// =============================================================

// ── Value Object: PersonName ──────────────────────────────────
// Un Value Object representa un concepto simple del dominio.
// No tiene identidad propia; su igualdad se basa en su valor.
class PersonName {
    private String firstName;
    private String lastName;

    public PersonName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName;  }
}

// ── Value Object: EmailAddress ────────────────────────────────
class EmailAddress {
    private String value;

    public EmailAddress(String value) {
        if (!value.contains("@")) {
            throw new IllegalArgumentException("Email inválido: " + value);
        }
        this.value = value;
    }

    public String getValue() { return value; }

    @Override
    public String toString() { return value; }
}

// ── Aggregate: Profile ────────────────────────────────────────
// El Aggregate es la clase principal del bounded context.
// Encapsula su estado y expone comportamiento a través de métodos.
class Profile {

    // Atributos privados — encapsulación
    private int id;
    private PersonName name;
    private EmailAddress email;
    private String phoneNumber;
    private String dateOfBirth;   // formato: YYYY-MM-DD

    // Constructor
    public Profile(int id, PersonName name, EmailAddress email,
                   String phoneNumber, String dateOfBirth) {
        this.id          = id;
        this.name        = name;
        this.email       = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    // ── Getters ──────────────────────────────────────────────
    public int          getId()          { return id;          }
    public PersonName   getName()        { return name;        }
    public EmailAddress getEmail()       { return email;       }
    public String       getPhoneNumber() { return phoneNumber; }
    public String       getDateOfBirth() { return dateOfBirth; }

    // ── Setters (solo campos actualizables) ──────────────────
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void updateName(String firstName, String lastName) {
        this.name = new PersonName(firstName, lastName);
    }

    // ── Método de comportamiento ─────────────────────────────
    public void printSummary() {
        System.out.println("─────────────────────────────────");
        System.out.println("  Perfil #" + id);
        System.out.println("  Nombre : " + name.getFullName());
        System.out.println("  Email  : " + email.getValue());
        System.out.println("  Teléf. : " + phoneNumber);
        System.out.println("  Nac.   : " + dateOfBirth);
        System.out.println("─────────────────────────────────");
    }
}

// ── Clase principal — punto de entrada ───────────────────────
public class ClasesYObjetos {

    public static void main(String[] args) {

        // 1. Crear Value Objects
        PersonName   nombre = new PersonName("Abigail", "Raymundo");
        EmailAddress email  = new EmailAddress("abigail@glucosmart.com");

        // 2. Instanciar el Aggregate Profile
        Profile perfil = new Profile(
            1,
            nombre,
            email,
            "+51 987 654 321",
            "2004-08-15"
        );

        // 3. Mostrar el perfil
        System.out.println("✅ Perfil creado:");
        perfil.printSummary();

        // 4. Actualizar datos usando setters
        perfil.setPhoneNumber("+51 999 111 222");
        perfil.updateName("Abigail Nadhim", "Raymundo Villarroel");

        System.out.println("✏️  Perfil actualizado:");
        perfil.printSummary();

        // 5. Acceder a atributos con getters
        System.out.println("Nombre completo : " + perfil.getName().getFullName());
        System.out.println("Email           : " + perfil.getEmail());

        // 6. Demostrar validación del Value Object
        System.out.println("\n⚠️  Probando validación de email:");
        try {
            EmailAddress emailInvalido = new EmailAddress("no-es-un-email");
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
    }
}
