package ejerciciosrepaso;

import java.util.Scanner;

public class EJERCICOREPASO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de ventas a introducir
        System.out.print("Introduce el número de ventas a registrar: ");
        int numVentas = scanner.nextInt();
        
        // Inicializar un arreglo par almacenar las ventas
        double[] ventas = new double[numVentas];

        // Pedir las ventas al usuario
        for (int i = 0; i < numVentas; i++) {
            System.out.print("Introduce la venta " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
        }

        // Calcular la suma de todas las ventas
        double sumaVentas = 0;
        for (double venta : ventas) {
            sumaVentas += venta;
        }

        // Mostrar el resultado
        System.out.println("La suma total de las ventas es: " + sumaVentas);

        scanner.close();
    }
}
