package ejerciciosrepaso;

import java.util.Scanner;

public class EJERCICIOREPASO1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir la contraseña
        String contrasenaCorrecta = "miContraseña123"; // Cambia esto a la contraseña deseada
        
        // Contador de intentos
        int intentos = 3;

        // Bucle para solicitar la contraseña
        while (intentos > 0) {
            System.out.print("Introduce la contraseña: ");
            String contrasenaUsuario = scanner.nextLine();

            // Comprobar la contraseña
            if (contrasenaUsuario.equals(contrasenaCorrecta)) {
                System.out.println("¡Enhorabuena!");
                break; // Salir del bucle si la contraseña es correcta
            } else {
                intentos--;
                System.out.println("Contraseña incorrecta. Te quedan " + intentos + " intento(s).");
            }
        }

        if (intentos == 0) {
            System.out.println("Has agotado todos los intentos.");
        }

        scanner.close();
    }
}

