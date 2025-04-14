package eerciciosrepaso.src.ejerciciosrepaso;
import java.util.Scanner;
public class EJERCICIOREPASO5 {
	    public static void main(String[] args) {
	        // Crear un objeto Scanner para leer la entrada del teclado
	        Scanner sc = new Scanner(System.in);

	        // Variables para almacenar datos
	        int numero;
	        int mayor = Integer.MIN_VALUE; // El número más alto
	        int menor = Integer.MAX_VALUE; // El número más bajo
	        int sumaTotal = 0;  // Suma de todos los números
	        int sumaPositivos = 0;  // Suma de números positivos
	        int sumaNegativos = 0;  // Suma de números negativos
	        int contador = 0;  // Contador de números introducidos

	        // Bucle para pedir números al usuario
	        do {
	            System.out.print("Introduce un número (o -1 para terminar): ");
	            numero = sc.nextInt();

	            // Si el número no es -1, procesar
	            if (numero != -1) {
	                // Actualizar suma total y contador
	                sumaTotal += numero;
	                contador++;

	                // Encontrar el mayor y menor número
	                if (numero > mayor) {
	                    mayor = numero;
	                }
	                if (numero < menor) {
	                    menor = numero;
	                }

	                // Sumar a los positivos o negativos
	                if (numero > 0) {
	                    sumaPositivos += numero;
	                } else if (numero < 0) {
	                    sumaNegativos += numero;
	                }
	            }

	        } while (numero != -1);  // El bucle termina cuando se introduce -1

	        // Calcular la media (si se ha introducido al menos un número)
	        double media = (contador > 0) ? (double) sumaTotal / contador : 0;

	        // Mostrar resultados
	        System.out.println("Resultados:");
	        System.out.println("Mayor número introducido: " + mayor);
	        System.out.println("Menor número introducido: " + menor);
	        System.out.println("Suma de todos los números: " + sumaTotal);
	        System.out.println("Suma de los números positivos: " + sumaPositivos);
	        System.out.println("Suma de los números negativos: " + sumaNegativos);
	        System.out.println("Media de todos los números: " + media);

	        sc.close();
	    }
	}


