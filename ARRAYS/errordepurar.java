package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class errordepurar {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        // Definir la combinación correcta
        String combinacionCorrecta = "1 2 3 4 5 6 7 8 9 10";
        String[] combinacionArray = combinacionCorrecta.split(" ");

        // Leer la combinación del usuario
        System.out.println("Introduce una combinación de números separados por espacios (ejemplo: 1 2 3 4 5 6 7 8 9 10):");
        String entradausuario = ent.nextLine();
        String[] entradaArray = entradaUsuario.split(" ");

        // Comparar combinaciones (Error: usa "==" en lugar de Arrays.equals)
        bolean sonIguales = combinacionArray == entradaArray;

        // Mensajes de salida
        if (sonIguales) {
            System.out.printl("¡Combinación correcta! Has adivinado la contraseña.");
        } else {
            System.out.println("Combinación incorrecta. Intenta de nuevo.");
        }
    }
}
