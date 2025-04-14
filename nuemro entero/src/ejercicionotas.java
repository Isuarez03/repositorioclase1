import java.util.Scanner;

public class ejercicionotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de estudiantes
        System.out.print("Ingrese el número total de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        // Validar entrada
        while (numEstudiantes <= 0) {
            System.out.print("Por favor, ingrese un número válido de estudiantes: ");
            numEstudiantes = scanner.nextInt();
        }

        // Arreglo para almacenar las notas
        int[] notas = new int[numEstudiantes];

        // Entrada de notas
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + " (0-100): ");
            int nota = scanner.nextInt();

            while (nota < 0 || nota > 100) {
                System.out.print("Nota inválida. Ingrese nuevamente la nota del estudiante " + (i + 1) + " (0-100): ");
                nota = scanner.nextInt();
            }

            notas[i] = nota;
        }

        // Cálculo de promedio y estadísticas
        int sumaNotas = 0;
        int aprobados = 0;
        int suspendidos = 0;

        // Clasificación de notas
        int excelente = 0;
        int bueno = 0;
        int regular = 0;
        int insuficiente = 0;

        for (int nota : notas) {
            sumaNotas += nota;

            if (nota >= 50) {
                aprobados++;
            } else {
                suspendidos++;
            }

            // Clasificar las notas
            if (nota >= 90) {
                excelente++;
            } else if (nota >= 75) {
                bueno++;
            } else if (nota >= 50) {
                regular++;
            } else {
                insuficiente++;
            }
        }

        double promedio = (double) sumaNotas / numEstudiantes;

        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Promedio de la clase: " + promedio);
        System.out.println("Número de estudiantes aprobados: " + aprobados);
        System.out.println("Número de estudiantes suspendidos: " + suspendidos);

        // Mostrar clasificación
        System.out.println("\n--- Clasificación de Notas ---");
        System.out.println("Excelente (90-100): " + excelente);
        System.out.println("Bueno (75-89): " + bueno);
        System.out.println("Regular (50-74): " + regular);
        System.out.println("Insuficiente (0-49): " + insuficiente);
    }
}
