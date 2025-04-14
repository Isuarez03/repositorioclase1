package primeraclase;

import java.util.Scanner; // Importa el Scanner para leer entradas

public class declarartecaldo3 {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner entrada = new Scanner(System.in);

		// Constante que define el multiplicador para convertir millas a kilómetros
		final float MULTIPLICADOR = 1.60934f;

		// Pedir al usuario que introduzca las millas
		System.out.print("Introduce las millas: ");
		double millas = entrada.nextDouble(); // Leer el valor de millas como número decimal

		// Convertir las millas a kilómetros
		float kilometros = (float) millas * MULTIPLICADOR;

		// Mostrar el resultado
		System.out.println("Kilómetros = " + kilometros);

		// Cerrar el objeto Scanner
		entrada.close();
	}
}
