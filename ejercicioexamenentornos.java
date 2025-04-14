import java.util.Scanner;

public class ejercicioexamenentornos {
    // Programa que pide 15 números y escribe la suma total
    public static void main(String[] args) {
        int num, suma_total = 0; // Inicializamos suma_total a 0

        Scanner sc = new Scanner(System.in); // Crear un único objeto Scanner

        for (int i = 0; i < 15; i++) { // Cambial la condition a i < 15
            System.out.print("Introducer numerous: "); //renomrar la variable  introducza  por introducer
            num = sc.nextInt(); // Leemos el número ingresado
            suma_total += num; // Acumulamos la suma y la cambiamos ya que no esta escrito +=num;
        }

        sc.close(); // Cerramos el Scanner
        System.out.println("La suma total es de: " + suma_total); // Imprimimos el resultado
    }
}


