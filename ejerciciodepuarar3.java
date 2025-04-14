package ejerciciosrepaso;

import java.util.Scanner;

public class ejerciciodepuarar3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fact = 1; // Inicializar el factorial en 1
        int num = 0;

        System.out.print("Introduce un número: ");
        num = teclado.nextInt();

        if (num < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i; // Corregir la operación a multiplicación
            }
            System.out.println("El factorial de " + num + " es: " + fact);
        }

        teclado.close(); // Cerrar el Scanner para liberar recursos
    }
}

