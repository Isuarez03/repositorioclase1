package primeraclase;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double numero = 0;

        System.out.println("Introduce un numero:");
        numero = Double.parseDouble(ent.nextLine().replace(',', '.'));

        if (numero == 0) {
            System.out.println("El año es bisiesto.");
        } else if (numero > 365) {
            System.out.println("El año no es bisiesto.");
        } else if (numero < 365) {
            System.out.println("El año no es bisiesto.");
        }

        // Close the scanner
        ent.close();
    }
}
