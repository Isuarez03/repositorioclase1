package ARRAYS;

public class ARRAYS5000 {
    public class ArraysExtensos {
        public static void main(String[] args) {
            // Declaración de varios arrays grandes
            int[] numeros1 = new int[5000];
            int[] numeros2 = new int[5000];
            int[] numeros3 = new int[5000];

            // Inicialización de los arrays
            inicializarArray(numeros1, 1);
            inicializarArray(numeros2, 2);
            inicializarArray(numeros3, 3);

            // Realizar operaciones en los arrays
            imprimirSegmento(numeros1, 0, 10);
            buscarNumero(numeros2, 1000);
            sumarArray(numeros3);
            modificarValores(numeros1);

            // Repetir operaciones para aumentar líneas
            for (int i = 0; i < 100; i++) {
                repetirOperacion(numeros1, i);
                repetirOperacion(numeros2, i);
                repetirOperacion(numeros3, i);
            }
        }

        // Inicializa un array con un patrón específico
        public static void inicializarArray(int[] array, int multiplicador) {
            for (int i = 0; i < array.length; i++) {
                array[i] = i * multiplicador;
            }
        }

        // Imprime un segmento de un array
        public static void imprimirSegmento(int[] array, int inicio, int fin) {
            System.out.println("Segmento del array:");
            for (int i = inicio; i <= fin && i < array.length; i++) {
                System.out.println("array[" + i + "] = " + array[i]);
            }
        }

        // Busca un número en un array
        public static void buscarNumero(int[] array, int objetivo) {
            boolean encontrado = false;
            for (int num : array) {
                if (num == objetivo) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                System.out.println("El número " + objetivo + " está en el array.");
            } else {
                System.out.println("El número " + objetivo + " no está en el array.");
            }
        }

        // Suma los elementos de un array
        public static void sumarArray(int[] array) {
            long suma = 0;
            for (int num : array) {
                suma += num;
            }
            System.out.println("Suma total del array: " + suma);
        }

        // Modifica los valores del array multiplicándolos por 2
        public static void modificarValores(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] *= 2;
            }
            System.out.println("Se han multiplicado todos los valores por 2.");
        }

        // Operación repetitiva para extender líneas
        public static void repetirOperacion(int[] array, int iteracion) {
            System.out.println("Iteración #" + iteracion);
            for (int i = 0; i < array.length; i++) {
                if (i % 10 == 0) {
                    array[i] += iteracion;
                }
            }
        }
    }

}
