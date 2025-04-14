package bucles;

import java.util.Scanner;

public class  adivinarelnumero extends REPASO6 {

    public static void main(String[] args) {
        // Declaración de variables y objetos
        int aleatorio = (int) ((Math.random() * 100) + 1);
        Scanner ent = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Adivina el número (entre 1 y 100):");

        // Bucle para seguir pidiendo números hasta acertar
        while (true) {
            inputNum = ent.nextInt();

            if (aleatorio == inputNum) {
                System.out.println("¡Has acertado!");
                break; // Salir del bucle si acierta
            } else if (aleatorio > inputNum) {
                System.out.println("El número aleatorio es mayor.");
            } else {
                System.out.println("El número aleatorio es menor.");
            }
        }

        ent.close(); // Cerrar el escáner al final
    }
}

