package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class numerosordenarlo {
            String[] args; static {
         Scanner ent = new Scanner (System.in);
        int[] numeros = {1, 2, 3, 4, 5, 6 ,7, 8, 9, 10};

        // Llamar al método para ordenar los números
        ordenarNumeros(numeros);

        // Imprimir los números ordenados
        System.out.println("Números ordenados: " + Arrays.toString(numeros));

    }

    // Método para ordenar los números utilizando el algoritmo de burbuja
    public static void ordenarNumeros(int[] numeros) {
        int n = numeros.length;
        boolean intercambiado;
        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar
                }
            }
        }
    }
}