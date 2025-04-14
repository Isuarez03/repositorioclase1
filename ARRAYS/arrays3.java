package ARRAYS;
import java.util.ArrayList;
import java.util.Random;
public class arrays3 {
        public static void main(String[] args) {
            // Crear el array principal y llenarlo con números aleatorios
            int[] numeros = new int[15];
            Random random = new Random();

            System.out.println("Array original:");
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
                System.out.print(numeros[i] + " ");
            }
            System.out.println();

            // Crear listas para pares e impares
            ArrayList<Integer> pares = new ArrayList<>();
            ArrayList<Integer> impares = new ArrayList<>();

            // Clasificar los números en pares e impares
            for (int num : numeros) {
                if (num % 2 == 0) {
                    pares.add(num);
                } else {
                    impares.add(num);
                }
            }

            // Convertir las listas en arrays
            int[] arrayPares = pares.stream().mapToInt(Integer::intValue).toArray();
            int[] arrayImpares = impares.stream().mapToInt(Integer::intValue).toArray();

            // Imprimir los arrays de pares e impares
            System.out.println("Array de números pares:");
            for (int num : arrayPares) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println("Array de números impares:");
            for (int num : arrayImpares) {
                System.out.print(num + " ");
            }
        }
    }


