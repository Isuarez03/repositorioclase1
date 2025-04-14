package primeraclase;

import java.util.Scanner;

public class clase { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca un número entero
        System.out.print("Introduce el primer número entero: ");
        int primerNumero = scanner.nextInt();

        // Pedir al usuario que introduzca un segundo número entero
        System.out.print("Introduce el segundo número entero: ");
        int segundoNumero = scanner.nextInt();

        // Mostrar el mensaje final
        System.out.println("fin");

        // Cerrar el scanner
        scanner.close();
    }
}

