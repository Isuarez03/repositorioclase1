package MisPrimerasClases.src.bucles;
import java.util.Scanner;

public class BUCLENUMEROS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce números enteros (0 para terminar):");

        // Bucle para pedir números hasta que el usuario ingrese 0
        while (true) {
            numero = scanner.nextInt(); // Leer el número ingresado por el usuario

            if (numero == 0) { // Si el número es 0, salimos del bucle
                break;
            }

            suma += numero; // Sumar el número a la suma acumulada
            contador++; // Incrementar el contador de números introducidos
        }

        // Verificar si se introdujeron números
        if (contador == 0) {
            System.out.println("No se introdujeron números.");
        } else {
            // Calcular la media aritmética
            double media = (double) suma / contador;
            System.out.println("Números introducidos: " + contador);
            System.out.println("Suma total: " + suma);
            System.out.println("Media aritmética: " + media);
        }

        scanner.close(); // Cerrar el objeto Scanner
    }
}
