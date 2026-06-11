// =============================================================
//  Lección 6 — Introducción a POO: Clases y Objetos
//  Archivo de práctica — completa los TODO
// =============================================================

// TODO 1: Crea una clase llamada PersonName con:
//   - Atributos privados: firstName (String) y lastName (String)
//   - Un constructor que reciba ambos valores
//   - Un método getFullName() que devuelva firstName + " " + lastName
//   - Getters para firstName y lastName


// TODO 2: Crea una clase llamada EmailAddress con:
//   - Un atributo privado: value (String)
//   - Un constructor que valide que value contenga "@"
//     Si no contiene "@", lanza: throw new IllegalArgumentException("Email inválido")
//   - Un getter getValue()
//   - Sobreescribe toString() para que devuelva value


// TODO 3: Crea una clase llamada Profile con:
//   - Atributos privados: id (int), name (PersonName),
//     email (EmailAddress), phoneNumber (String), dateOfBirth (String)
//   - Un constructor que reciba los 5 parámetros
//   - Getters para todos los atributos
//   - Un setter para phoneNumber
//   - Un método updateName(String firstName, String lastName)
//     que cree un nuevo PersonName y lo asigne a name
//   - Un método printSummary() que imprima todos los datos con System.out.println


// TODO 4: En el main, completa el siguiente código:
public class ClasesYObjetos {

    public static void main(String[] args) {

        // Crea un PersonName con tu nombre y apellido
        PersonName nombre = // TODO

        // Crea un EmailAddress con tu email
        EmailAddress email = // TODO

        // Crea un Profile con id=1, el nombre, email, un teléfono y tu fecha de nacimiento
        Profile perfil = // TODO

        // Llama a printSummary() para mostrar el perfil
        // TODO

        // Actualiza el teléfono con setPhoneNumber()
        // TODO

        // Llama a printSummary() de nuevo para ver el cambio
        // TODO

        // BONUS: Intenta crear un EmailAddress con un valor sin "@"
        // y captura la excepción con try-catch
        // TODO
    }
}
