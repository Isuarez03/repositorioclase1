package EXMAMENSUGNDAEVALUACIONSEGUNDOEXAMEN;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class Reserva {
    int numeroHabitacion;
    String dniCliente;
    String nombreCliente;
    LocalDate fechaEntrada;
    LocalDate fechaSalida;

    public Reserva(int numeroHabitacion, String dniCliente, String nombreCliente, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.numeroHabitacion = numeroHabitacion;
        this.dniCliente = dniCliente;
        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Habitación: " + numeroHabitacion + ", Cliente: " + nombreCliente + " (DNI: " + dniCliente + "), Desde: " + fechaEntrada + " Hasta: " + fechaSalida;
    }
}

class Hotel {
    ArrayList<Reserva> reservas = new ArrayList<>();

    boolean agregarReserva(String dniCliente, String nombreCliente, LocalDate fechaEntrada, LocalDate fechaSalida, int numeroHabitacion) {
        for (Reserva reserva : reservas) {
            if (reserva.numeroHabitacion == numeroHabitacion &&
                    !(fechaSalida.isBefore(reserva.fechaEntrada) || fechaEntrada.isAfter(reserva.fechaSalida))) {
                System.out.println("La habitación ya está reservada en esas fechas.");
                return false;
            }
        }
        reservas.add(new Reserva(numeroHabitacion, dniCliente, nombreCliente, fechaEntrada, fechaSalida));
        System.out.println("Reserva realizada con éxito.");
        return true;
    }

    Reserva buscarReservaPorDNI(String dniCliente) {
        for (Reserva reserva : reservas) {
            if (reserva.dniCliente.equals(dniCliente)) {
                return reserva;
            }
        }
        return null;
    }

    void cancelarReserva(String dniCliente) {
        for (Reserva reserva : reservas) {
            if (reserva.dniCliente.equals(dniCliente)) {
                reservas.remove(reserva);
                System.out.println("Reserva cancelada con éxito.");
                return;
            }
        }
        System.out.println("No se encontró una reserva con ese DNI.");
    }

    void listarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas.");
        } else {
            for (Reserva reserva : reservas) {
                System.out.println(reserva);
            }
        }
    }
}

public class Noenviar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        while (true) {
            System.out.println("\n--- Sistema de Reservas de Hotel ---");
            System.out.println("1. Reservar Habitación");
            System.out.println("2. Buscar Reserva por DNI");
            System.out.println("3. Cancelar Reserva");
            System.out.println("4. Listar Reservas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpieza del buffer

            switch (opcion) {
                case 1:
                    System.out.print("DNI Cliente: ");
                    String dni = scanner.nextLine();
                    System.out.print("Nombre Cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Número de Habitación: ");
                    int numHabitacion = scanner.nextInt();
                    System.out.print("Fecha de Entrada (AAAA-MM-DD): ");
                    LocalDate entrada = LocalDate.parse(scanner.next());
                    System.out.print("Fecha de Salida (AAAA-MM-DD): ");
                    LocalDate salida = LocalDate.parse(scanner.next());
                    hotel.agregarReserva(dni, nombre, entrada, salida, numHabitacion);
                    break;
                case 2:
                    System.out.print("DNI Cliente: ");
                    dni = scanner.nextLine();
                    Reserva reserva = hotel.buscarReservaPorDNI(dni);
                    if (reserva != null) {
                        System.out.println(reserva);
                    } else {
                        System.out.println("No se encontró la reserva.");
                    }
                    break;
                case 3:
                    System.out.print("DNI Cliente: ");
                    dni = scanner.nextLine();
                    hotel.cancelarReserva(dni);
                    break;
                case 4:
                    hotel.listarReservas();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
