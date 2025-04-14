package ejerciciosrepaso;

import java.util.Scanner;

public class numerodeventas { 
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numVentas = 0;

        System.out.println("¿Cuántos productos quiere comprar?");
        numVentas = ent.nextInt(); 

        double precio = 0.0, total = 0.0; 
        for (int i = 1; i <= numVentas; i++) {
            System.out.println("Introduce el precio del producto " + i + ":"); 
            precio = ent.nextDouble();
            total += precio;
        }
        System.out.println("Total a pagar: " + total); 
        ent.close();
    }
}
