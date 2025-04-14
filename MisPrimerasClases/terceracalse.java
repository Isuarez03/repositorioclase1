package MisPrimerasClases;

public class terceracalse {
	public static void main(String[] args) {
		// Declaración de variables enteras
		int numero1 = 5;
		int numero2 = 2;

		// Operaciones básicas con enteros
		int suma = numero1 + numero2;
		int modulo = numero1 % numero2;
		int resta = numero1 - numero2;
		int division = numero1 / numero2;

		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("División (entera): " + division);
		System.out.println("Módulo: " + modulo);

		// Operaciones con decimales
		float decimal1 = 34.56f;
		float decimal2 = 12.23f;

		System.out.println("Multiplicación de decimales: " + (decimal1 * decimal2));
		System.out.println("Módulo de decimales: " + (decimal1 % decimal2));

		// Cálculo del salario mensual
		float salarioAnual = 23560.95f;
		int numeroPagas = 14;

		float salarioMensual = salarioAnual / numeroPagas;

		System.out.println("Salario mensual (float): " + salarioMensual);
		System.out.println("Salario mensual (double): " + (double) salarioMensual);
	}
}
