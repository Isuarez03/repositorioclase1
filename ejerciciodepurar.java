import java.util.*;
/*
 * Programa que lea un número entero N y muestre la tabla de multiplicar de ese número.
 */
public class ejerciciodepurar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for (int i = 1; i <= 10; i++) { // Cambiar el límite a i <= 10 para incluir el 10
            System.out.println(n + " * " + i + " = " + n * i);
        }

        sc.close(); // Cerrar el Scanner para evitar fugas de recursos
    }
}
