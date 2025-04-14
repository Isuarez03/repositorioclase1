package ejerciciosrepaso;

import java.util.Scanner;

public class ejerciciodepuar2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        // Lectura de dos números enteros A y B
        // A debe ser menor que B
        do {
            System.out.print("Introduce un número entero: ");
            A = sc.nextInt();
            System.out.print("Introduce otro número entero mayor que el anterior: ");
            B = sc.nextInt();
            if (A >= B) {
                System.out.println("El segundo número debe ser mayor que el primero");
            }
        } while (A >= B);

        // Mostrar los números pares entre A y B.
        System.out.println("\nNúmeros pares desde " + A + " hasta " + B + " : ");
        for (int i = A; i <= B; i++) { // Cambiar el inicio del bucle a A
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close(); // Cerrar el Scanner para liberar recursos
    }
}

