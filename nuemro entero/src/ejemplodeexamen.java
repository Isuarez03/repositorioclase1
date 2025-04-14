import java.util.Scanner;

public class ejemplodeexamen {
    import java.util.Scanner;
import java.util.Random;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1º) Mostrar una frase en orden inverso
            System.out.println("1º) Escribe una frase:");
            String frase = scanner.nextLine();
            mostrarFraseInversa(frase);

            // 2º) Tabla de conversión de grados Kelvin a Fahrenheit
            System.out.println("\n2º) Tabla de conversión de grados Kelvin a Fahrenheit:");
            mostrarTablaConversion();

            // 3º) Generar 100 números aleatorios y mostrar el menor y sus apariciones
            System.out.println("\n3º) Generar números aleatorios y analizar:");
            analizarNumerosAleatorios();
        }

        // Ejercicio 1: Mostrar frase en orden inverso
        public static void mostrarFraseInversa(String frase) {
            StringBuilder inversa = new StringBuilder(frase);
            System.out.println("Frase inversa: " + inversa.reverse());
        }

        // Ejercicio 2: Tabla de conversión de Kelvin a Fahrenheit
        public static void mostrarTablaConversion() {
            System.out.printf("%-10s %-10s%n", "Kelvin", "Fahrenheit");
            for (int kelvin = 0; kelvin <= 500; kelvin += 50) {
                double fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;
                System.out.printf("%-10d %-10.2f%n", kelvin, fahrenheit);
            }
        }

        // Ejercicio 3: Generar 100 números aleatorios y analizar el menor
        public static void analizarNumerosAleatorios() {
            int[] numeros = new int[100];
            int min = Integer.MAX_VALUE;
            int conteoMin = 0;

            // Generar números aleatorios
            for (int i = 0; i < 100; i++) {
                numeros[i] = (int) (Math.random() * 50) + 1;
                if (numeros[i] < min) {
                    min = numeros[i];
                    conteoMin = 1;
                } else if (numeros[i] == min) {
                    conteoMin++;
                }
            }

            // Mostrar resultados
            System.out.println("El número más bajo generado es: " + min);
            System.out.println("Aparece " + conteoMin + " veces.");
        }
    }
//Explicación del programa
//Ejercicio 1: Utiliza StringBuilder para invertir la cadena ingresada.
//2: Usa un bucle for para calcular y mostrar la conversión de Kelvin a Fahrenheit en intervalos de 50 grados.
        //Ejercicio 3: Genera 100 números aleatorios, encuentra el menor y cuenta cuántas veces aparece utilizando un simple bucle for.
//Ejecución
//Entrada para el primer ejercicio: Una frase cualquiera ingresada por el usuario.
        //Salida: La frase mostrada en orden inverso.
//Salida del segundo ejercicio: Una tabla formateada de valores Kelvin y su conversión a Fahrenheit.
//Salida del tercer ejercicio: El número más bajo entre los generados aleatoriamente y cuántas veces aparece.
}
