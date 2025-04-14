package MisPrimerasClases.src.primeraclase;

import java.util.Scanner;

public class SaberSiEsParOImpar {
	public static void main(String[] args) {
		// Crear el objeto Scanner para leer datos de entrada
		Scanner entrada = new Scanner(System.in);

		// Pedir al usuario que ingrese un número entero
		System.out.println("Introduce un número entero:");
		int numero = entrada.nextInt();

		// Constante para la división
		final int DIVISOR = 2;

		// Determinar si el número es par o impar
		if (numero % DIVISOR == 0) {
			System.out.println("El número " + numero + " es par.");
		} else {
			System.out.println("El número " + numero + " es impar.");
		}

		// Cerrar el Scanner
		entrada.close();
	}
}

