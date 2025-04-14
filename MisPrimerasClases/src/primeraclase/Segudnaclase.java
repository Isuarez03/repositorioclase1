package MisPrimerasClases.src.primeraclase;

public class Segudnaclase {
	public static void main(String[] args) {
		// Declaración de variables
		byte miByte;
		char miletras = 'Y';
		int numeroTlfno = 666666;
		int edad = 0; // Inicialización a valor neutro
		float salarioProfesor = 865.55f;
		double salarioMinistro = 3455.65;

		// Asignación
		miByte = 12;

		// Mostrar valores por pantalla
		System.out.println("Edad inicial: " + edad);
		System.out.println("Valor de miByte: " + miByte);
		System.out.println("Letra: " + miletras);
		System.out.println("Salario Ministro: " + salarioMinistro);

		// Actualización de variables
		edad = 21; // Se asigna un nuevo valor a 'edad'
		int edadNueva = edad; // Nueva variable asignada con el valor de 'edad'

		System.out.println("Edad actualizada: " + edad);
		System.out.println("Nueva edad copiada: " + edadNueva);
	}
}
