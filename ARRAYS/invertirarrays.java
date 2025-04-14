package ARRAYS;

public class invertirarrays {

        // Método para encontrar el número más grande en un array
        public static int encontrarMayor(int[] array) {
            int mayor = array[0]; // Inicializamos con el primer elemento
            for (int num : array) {
                if (num > mayor) {
                    mayor = num; // Actualizamos si encontramos un número más grande
                }
            }
            return mayor;
        }

        // Método para invertir el array
        public static int[] invertirArray(int[] array) {
            int[] invertido = new int[array.length]; // Creamos un nuevo array de igual tamaño
            for (int i = 0; i < array.length; i++) {
                invertido[i] = array[array.length - 1 - i]; // Asignamos los elementos en orden inverso
            }
            return invertido;
        }

        // Método para sumar todos los elementos del array
        public static int sumarElementos(int[] array) {
            int suma = 0;
            for (int num : array) {
                suma += num; // Sumamos cada elemento
            }
            return suma;
        }

        // Método para calcular el promedio de los elementos del array
        public static double calcularPromedio(int[] array) {
            int suma = sumarElementos(array); // Usamos el método anterior para sumar los elementos
            return (double) suma / array.length; // Dividimos la suma entre la cantidad de elementos
        }

        public static void main(String[] args) {
            // Declaración y ejemplo de uso de los métodos
            int[] miArray = {3, 7, 1, 9, 5}; // Array de prueba

            System.out.println("El número más grande es: " + encontrarMayor(miArray));
            System.out.println("El array invertido es: ");
            int[] invertido = invertirArray(miArray);
            for (int num : invertido) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("La suma de los elementos es: " + sumarElementos(miArray));
            System.out.println("El promedio de los elementos es: " + calcularPromedio(miArray));
        }
    }


