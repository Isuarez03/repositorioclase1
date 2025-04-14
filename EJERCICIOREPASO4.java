package ejerciciosrepaso;
import java.util.Scanner;
public class EJERCICIOREPASO4 {

	    public static void main(String[] args) {
	        // Crear un objeto Scanner para leer la entrada del teclado
	        Scanner sc = new Scanner(System.in);

	        // Pedir al usuario que escriba una frase
	        System.out.print("Introduce una frase: ");
	        String frase = sc.nextLine();  // Leer la frase completa incluyendo espacios

	        // Separar la frase en palabras usando el espacio como delimitador
	        String[] palabras = frase.split(" ");

	        // Mostrar las palabras separadas
	        System.out.println("Palabras separadas:");
	        for (String palabra : palabras) {
	            System.out.println(palabra);
	        }

	        sc.close();
	    }
	}



