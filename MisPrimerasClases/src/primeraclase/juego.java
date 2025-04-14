package primeraclase;

import java.util.Random;
import java.util.Scanner;

public class juego {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int numeroAleatorio = random.nextInt(100) + 1; // Número entre 1 y 100
		int intentos = 0;
		int adivinanza = 0;

		System.out.println("¡Bienvenido al juego de adivinanza de números!");
		System.out.println("He elegido un número entre 1 y 100. ¡Intenta adivinarlo!");

		// Ciclo principal para el juego
		while (adivinanza != numeroAleatorio) {
			System.out.print("Introduce tu adivinanza: ");
			adivinanza = scanner.nextInt();
			intentos++;

			if (adivinanza < numeroAleatorio) {
				System.out.println("Demasiado bajo. Intenta de nuevo.");
			} else if (adivinanza > numeroAleatorio) {
				System.out.println("Demasiado alto. Intenta de nuevo.");
			} else {
				System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
			}
		}

		// Cerrar el escáner
		scanner.close();
	}
}
