package primeraclase;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        // Crear un escáner para leer el día de la semana.
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número de día.
        System.out.print("Ingrese un número de día (1-7): ");
        int diaSemana = scanner.nextInt();

        // Evaluar el día con un switch.
        switch (diaSemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Día laboral");
                break;
            case 6:
            case 7:
                System.out.println("Día no laboral");
                break;
            default:
                System.out.println("Número inválido. Debe ser entre 1 y 7.");
        }

        // Cerrar el escáner.
        scanner.close();
    }
}
