package EXAMENSEGUNDAEVALUACION;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Parquimetro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la hora de entrada
        System.out.println("Bienvenido al sistema de parquímetro.");
        System.out.println("Introduce la hora de entrada (formato HH:MM):");
        String horaEntradaStr = scanner.nextLine();

        // Convertir la hora de entrada a LocalTime
        LocalTime horaEntrada = LocalTime.parse(horaEntradaStr);

        // Obtener la hora de salida (hora actual)
        LocalTime horaSalida = LocalTime.now();

        // Calcular la duración del estacionamiento
        Duration duracion = Duration.between(horaEntrada, horaSalida);
        long minutosEstacionado = duracion.toMinutes();

        // Verificar si la duración es válida (no negativa)
        if (minutosEstacionado < 0) {
            System.out.println("Error: La hora de entrada no puede ser posterior a la hora actual.");
            return;
        }

        // Calcular el costo
        double costo;
        if (minutosEstacionado < 120) { // Menos de 2 horas
            costo = minutosEstacionado * 0.05;
        } else { // 2 horas o más
            costo = minutosEstacionado * 0.03;
        }

        // Mostrar resultados
        System.out.println("\n--- Resumen del estacionamiento ---");
        System.out.println("Hora de entrada: " + horaEntrada);
        System.out.println("Hora de salida: " + horaSalida);
        System.out.println("Tiempo estacionado: " + minutosEstacionado + " minutos");
        System.out.printf("Costo total: %.2f €\n", costo);

        scanner.close();
    }

}
