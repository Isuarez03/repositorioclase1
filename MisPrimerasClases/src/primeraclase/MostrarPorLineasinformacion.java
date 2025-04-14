package MisPrimerasClases.src.primeraclase;

import java.util.Scanner;

public class MostrarPorLineasinformacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce números enteros (0 para terminar):");

        while (true) {
            try {
                numero = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next(); // Limpiar el buffer
                continue;
            }

            if (numero == 0) {
                break;
            }
            suma += numero;
            contador++;
        }

        if (contador == 0) {
            System.out.println("No se introdujeron números.");
        } else {
            double media = (double) suma / contador;
            System.out.println("Números introducidos: " + contador);
            System.out.printf("Media aritmética: %.2f%n", media);
        }

        scanner.close();
    }
}
