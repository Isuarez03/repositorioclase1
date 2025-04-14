package ejerciciosrepaso;

import java.util.Scanner;

public class EJERCICIOREPASO6 {

    public static void  main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner sc = new Scanner(System.in);

        // Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = (int)(Math.random() * 100) + 1;

        // Variable para almacenar el intento del usuario
        int intento;

        // Número máximo de intentos
        int intentosMax = 10;

        // Bucle que permite al usuario hacer hasta 5 intentos
        for (int i = 1; i <= intentosMax; i++) {
            // Pedir al usuario que introduzca un número
            System.out.print("Intento " + i + " de " + intentosMax + ": Introduce un número entre 1 y 100: ");
            intento = sc.nextInt();

            // Comparar el intento del usuario con el número aleatorio
            if (intento == numeroAleatorio) {
                System.out.println("¡Felicidades! Has adivinado el número.");
                break;
            } else if (intento > numeroAleatorio) {
                System.out.println("Te has pasado, el número es menor.");
            } else {
                System.out.println("Te has quedado corto, el número es mayor.");
            }

            // Mostrar mensaje si se alcanzan los 5 intentos sin éxito
            if (i == intentosMax) {
                System.out.println("Lo siento, has agotado tus 5 intentos. El número era: " + numeroAleatorio);
            }
        }

        sc.close();
    }
}
