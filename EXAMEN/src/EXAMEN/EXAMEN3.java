package EXAMEN;

import java.util.Scanner;

public class EXAMEN3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;         // Número ingresado por el usuario
        int suma = 0;       // Suma acumulada de los números
        int contador = 0;   // Contador de números ingresados

        System.out.println("Introduce números para calcular la media (ingresa 0 para terminar):");

        while (true) {
            System.out.print("Número: ");

            // Validar que la entrada sea un número entero
            if (!scanner.hasNextInt()) {
                System.out.println("Por favor, introduce un número válido.");
                scanner.next(); // Limpiar entrada inválida
                continue;
            }

            numero = scanner.nextInt(); // Leer el número ingresado

            if (numero == 0) { // Condición para salir del bucle
                break;
            }

            suma += numero;  // Sumar el número ingresado a la suma acumulada
            contador++;      // Incrementar el contador
        }

        // Verificar si se ingresaron números válidos
        if (contador == 0) {
            System.out.println("No se introdujeron números.");
        } else {
            // Calcular la media aritmética
            double media = (double) suma / contador;
            System.out.println("Números introducidos: " + contador);
            System.out.println("Suma total: " + suma);
            System.out.println("Media aritmética: " + media);
        }

        scanner.close(); // Cerrar el Scanner
    }
}
