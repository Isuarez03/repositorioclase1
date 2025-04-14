package ejerciciosrepaso;

import java.util.Scanner;

public class buclesqwerty {
    public static void main(String[] args) {
        final String PASSWORD = "qwerty"; // Cambiado de comillas simples a dobles
        String inputPass = "";
        Scanner ent = new Scanner(System.in);
        boolean correcto = false; // Variable para controlar el bucle

        do {
            System.out.println("Introduce la contraseña:");
            inputPass = ent.nextLine(); // Cambiado a nextLine()

            if (PASSWORD.equals(inputPass)) { // Corrección de comparación
                System.out.println("Enhorabuena");
                correcto = true; // Cambio de 'aierto' a 'correcto'
            } else {
                System.out.println("Contraseña incorrecta, intenta de nuevo.");
            }

        } while (!correcto); // Continuar hasta que la contraseña sea correcta

        ent.close(); // Cerrar el escáner
    }
}

