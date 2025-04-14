package EXAMENSEGUNDAEVALUACION;

import java.io.InputStream;
import java.util.Scanner;

import java.util.Scanner;

public class EXAMENPRIMERAEVALUACIONEJ2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que escriba una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Separar la frase en palabras y almacenarlas en un array
        String[] palabras = frase.split(" ");

        // Imprimir las palabras una por una
        System.out.println("Palabras de la frase:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
