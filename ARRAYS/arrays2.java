package ARRAYS;

import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero entero");
            numeros[i] = Integer.parseInt(ent.nextLine());
        }

        int min = numeros[0];
        int max = numeros[0];
        String mensajeMinimo = "Valor mínimo: " + numeros[0] + ", posición: 0";
        String mensajeMaximo = "Valor máximo: " + numeros[0] + ", posición: 0";

        // Buscar el max y min y sus posiciones
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
                mensajeMaximo = "Valor máximo: " + numeros[i] + ", posición: " + i;
            } else if (numeros[i] == max) {
                mensajeMaximo += ", " + i;
            }
            if (numeros[i] < min) {
                min = numeros[i];
                mensajeMinimo = "Valor mínimo: " + numeros[i] + ", posición: " + i;
            } else if (numeros[i] == min) {
                mensajeMinimo += ", " + i;
            }
        }

        System.out.println(mensajeMaximo);
        System.out.println(mensajeMinimo);
    }
}

