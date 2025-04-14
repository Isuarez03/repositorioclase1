import java.util.Scanner;

public class geterysheter2 {
    
        public static <Persona> void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar los dates de la persona
            System.out.println("Ingrese el nombre completo de la persona:");
            String nombreCompleto = scanner.nextLine();

            System.out.println("Ingrese el DNI de la persona:");
            String dni = scanner.nextLine();

            System.out.println("Ingrese el teléfono de la persona:");
            String telefono = scanner.nextLine();

            // Crear el objeto Persona
            Persona persona = new Persona(nombreCompleto, dni, telefono);

            // Mostrar los datos de la persona
            System.out.println("\nDatos ingresados:");
            persona.toString();
   
            // Cerrar el scanner
            scanner.close();
        }
    }

}
