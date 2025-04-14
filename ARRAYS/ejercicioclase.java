package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioclase {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        // Definir la combinación correcta
        String combinacionCorrecta = "1 2 3 4 5 6 7 8 9 10";
        String[] combinacionArray = combinacionCorrecta.split(" ");

        // Leer la combinación del usuario
        System.out.println("Introduce una combinación de números separados por espacios (ejemplo: 1 2 3 4 5 6 7 8 9 10):");
        String entradaUsuario = ent.nextLine();
        String[] entradaArray = entradaUsuario.split(" ");

        // Comparar combinaciones
        boolean sonIguales = Arrays.equals(combinacionArray, entradaArray);

        // Mensajes de salida
        if (sonIguales) {
            System.out.println("¡Combinación correcta! Has adivinado la contraseña.");
        } else {
            System.out.println("Combinación incorrecta. Intenta de nuevo.");
        }
    }

}
