package EXAMENSEGUNDAEVALUACION;

import java.util.Scanner;

public class EXAMENPRIMERAEVALUACIONEJERCICIO1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar presupuesto
        System.out.print("Introduce el presupuesto: ");
        double presupuesto = scanner.nextDouble();

        // Validación para presupuesto negativo
        if (presupuesto < 0) {
            System.out.println("El presupuesto no puede ser negativo.");
            scanner.close();
            return; // Termina el programa si el presupuesto es inválido
        }

        // Solicitar el número de personas
        System.out.print("Introduce el número de personas: ");
        int personas = scanner.nextInt();

        // Validación para número de personas no válido
        if (personas <= 0) {
            System.out.println("El número de personas debe ser mayor a 0.");
            scanner.close();
            return; // Termina el programa si el número de personas es inválido
        }

        // Sugerencias basadas en el presupuesto y el número de personas
        if (presupuesto >= 1000 && personas < 4) {
            System.out.println("Sugerencia: Viajar en coche.");
        } else if (presupuesto >= 500 && presupuesto < 1000) {
            System.out.println("Sugerencia: Viajar en autobús.");
        } else if (presupuesto < 500) {
            System.out.println("Sugerencia: Viajar en bicicleta.");
        }

        // Mensaje final
        System.out.println("Gracias por usar el programa.");
        scanner.close();
    }
}
