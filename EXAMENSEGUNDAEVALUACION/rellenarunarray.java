package EXAMENSEGUNDAEVALUACION;

import java.util.Scanner;

public class rellenarunarray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce una frase:");
            String frase = scanner.nextLine();

            int[] asciiValues = new int[frase.length()];

            for (int i = 0; i < frase.length(); i++) {
                asciiValues[i] = frase.charAt(i); // Obtener y convertir el carácter a su valor ASCII
            }


            System.out.println("Valores ASCII de la frase:");
            for (int i = 0; i < asciiValues.length; i++) {
                System.out.println("Carácter: '" + frase.charAt(i) + "' -> ASCII: " + asciiValues[i]);
            }

            scanner.close();
        }
    }


