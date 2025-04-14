package bucles;

import java.util.Random;
import java.util.Scanner;

public class blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int userPoints = 0;//entero sin decimal
        int dealerPoints = 0;//entero sin decimal
        boolean userBusted = false;//Aproximadamente 2.010.000 resultados  ¿Qué son los Valores Booleanos? Para comenzar, es esencial entender qué son exactamente los valores booleanos. En el contexto de la programación, un valor booleano es un tipo de dato que puede tener uno de dos valores: verdadero (representado generalmente por «true») o falso (representado como «false»).Un valor booleano es un tipo de dato en programación que puede tener dos posibles valores: verdadero (representado generalmente por «true») o falso (representado como «false»)1
        boolean dealerBusted = false;

        // Turno del usuario
        while (userPoints < 21) { //La sintaxis básica es la siguiente: do { // Código a ejecutar al menos una vez } while (condicion); 
            System.out.println("Tus puntos: " + userPoints);
            System.out.print("¿Quieres recibir una carta? (s/n): ");
            String choice = scanner.nextLine();
            /* condicional if
             * public class Main {
    public static void main(String[] args) {
        //variables del programa
        int numero1 = 10;
        int numero2 = 15;
        int numero3 = 10;

        //condicional if
        if (numero1 < numero2) {
            System.out.print("Esto es verdadero.");
        }
    }
}
             */

            if (choice.equalsIgnoreCase("s")) {
                int card = random.nextInt(10) + 1; // Carta entre 1 y 10
                userPoints += card;
                System.out.println("Recibiste una carta de " + card + ". Tus puntos ahora son: " + userPoints);

                if (userPoints > 21) {
                    userBusted = true;
                    break; // El usuario se pasa de 21
                }
            } else {
                break; // El usuario se planta
            }
        }

        // Turno de la banca
        if (!userBusted) {
            while (dealerPoints < 16) {
                int card = random.nextInt(10) + 1; // Carta entre 1 y 10
                dealerPoints += card;
                System.out.println("La banca recibe una carta de " + card + ". Puntos de la banca: " + dealerPoints);
                
                if (dealerPoints > 21) {
                    dealerBusted = true;
                    break; // La banca se pasa de 21
                }
            }
        }

        // Resultados finales
        System.out.println("\nResultados finales:");
        System.out.println("Tus puntos: " + userPoints + (userBusted ? " (te has pasado)" : ""));
        System.out.println("Puntos de la banca: " + dealerPoints + (dealerBusted ? " (banca se ha pasado)" : ""));
        
        if (userBusted) {
            System.out.println("¡La banca gana!");
        } else if (dealerBusted || userPoints > dealerPoints) {
            System.out.println("¡Tú ganas!");
        } else if (userPoints < dealerPoints) {
            System.out.println("¡La banca gana!");
        } else {
            System.out.println("¡Es un empate!");
        }

        scanner.close();
    }
}
