package ARRAYS;
import java.util.Arrays;
import java.util.Scanner;

public class coidogMO {
    public static void main(String[] args) {
            Scanner ent = new Scanner(System.in);

            // Definir la combinación correcta
            String combinacionCorrecta = "1 2 3 4 5 6 7 8 9 10";
            String[] combinacionArray = combinacionCorrecta.split(" ");

            // Leer la combinación del usuario
            String[] entradaArray = leerCombinacionUsuario(ent);

            // Comparar combinaciones
            boolean sonIguales = compararArreglos(combinacionArray, entradaArray);

            // Mostrar resultado
            mostrarResultado(sonIguales);
        }

        // Método para leer la combinación del usuario
        public static String[] leerCombinacionUsuario(Scanner ent) {
            System.out.println("Introduce una combinación de números separados por espacios (ejemplo: 1 2 3 4 5 6 7 8 9 10):");
            String entradaUsuario = ent.nextLine();
            return entradaUsuario.split(" ");
        }

        // Método para comparar dos arreglos
        public static boolean compararArreglos(String[] arreglo1, String[] arreglo2) {
            return Arrays.equals(arreglo1, arreglo2);
        }

        // Método para mostrar el resultado de la comparación
        public static void mostrarResultado(boolean sonIguales) {
            if (sonIguales) {
                System.out.println("¡Combinación correcta! Has adivinado la contraseña.");
            } else {
                System.out.println("Combinación incorrecta. Intenta de nuevo.");
            }
        }
    }