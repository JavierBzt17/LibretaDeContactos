package ec.edu.ups.poo.principal;
import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuántas personas quieres ingresar?");
        int numeroDePersona = scanner.nextInt();
        Persona[] personas = new Persona[numeroDePersona];

        System.out.println("Cuántos familiares quieres ingresar?");
        int numeroDeFamiliar = scanner.nextInt();
        Familiar[] familiares = new Familiar[numeroDeFamiliar];

        //Iniciar
        for (int i = 0; i < numeroDePersona; i++) {
            Persona persona = new Persona();
            System.out.print("Ingrese el numero de cedula: ");
            persona.setCedula(scanner.next());
            System.out.print("Ingrese el nombre: ");
            persona.setNombre(scanner.next());
            System.out.print("Ingrese el apellido: ");
            persona.setApellido(scanner.next());
            System.out.print("Ingrese la direccion: ");
            persona.setDireccion(scanner.next());
            personas[i] = persona;
        }
        // Se mejorara el codigo de una manera mas estetica
        for (int i = 0; i < numeroDeFamiliar; i++) {
            Familiar familiar = new Familiar();
            System.out.print("Ingrese el numero de cedula: ");
            familiar.setCedula(scanner.next());
            System.out.print("Ingrese el nombre: ");
            familiar.setNombre(scanner.next());
            System.out.print("Ingrese el apellido: ");
            familiar.setApellido(scanner.next());
            System.out.print("Ingrese la direccion: ");
            familiar.setDireccion(scanner.next());
            System.out.print("Ingrese el parentesco: ");
            familiar.setParentesco(scanner.next());
            System.out.print("Ingrese el tipo de sangre: ");
            familiar.setTipoDeSangre(scanner.next());
            System.out.print("Ingrese el año de nacimiento: ");
            int year = scanner.nextInt();
            System.out.print("Ingrese el mes de nacimiento: ");
            int month = scanner.nextInt() - 1;
            System.out.print("Ingrese el día de nacimiento: ");
            int day = scanner.nextInt();
            GregorianCalendar fechaNacimiento = new GregorianCalendar(year, month-1, day);
            familiar.setFechaDeNacimiento(fechaNacimiento);

            familiares[i] = familiar;
        }
        System.out.println("--- Información de las Personas ---");
        for (Persona persona : personas) {
            System.out.println(persona);
            System.out.println(" ");
        }
        System.out.println("--- Información de los Familiares ---");
        for (Familiar familiar : familiares) {
            System.out.println(familiar);
            System.out.println(" ");
        }

        scanner.close();
    }
}
