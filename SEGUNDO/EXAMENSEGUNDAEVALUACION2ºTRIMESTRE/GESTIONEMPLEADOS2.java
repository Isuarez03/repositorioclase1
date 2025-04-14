package SEGUNDO.EXAMENSEGUNDAEVALUACION2ºTRIMESTRE;

import java.util.ArrayList;
import java.util.Scanner;

public class GESTIONEMPLEADOS2 {

    public static <Empleado> void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double totalSueldos = 0;

        System.out.println("Gestión de Empleados\n");

        while (true) {
            // Solicitar los datos del empleado
            System.out.print("Introduce el nombre del empleado (o 'salir' para terminar): ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.print("Introduce el DNI del empleado: ");
            String dni = scanner.nextLine();
            while (!validarDNI(dni)) {
                System.out.print("DNI inválido. Introduce un DNI correcto (Ej: 12345678A): ");
                dni = scanner.nextLine();
            }

            System.out.print("Introduce los años en la empresa: ");
            int aniosEmpresa = scanner.nextInt();
            while (aniosEmpresa < 0) {
                System.out.print("Años inválidos. Introduce un valor positivo: ");
                aniosEmpresa = scanner.nextInt();
            }

            System.out.print("Introduce el sueldo base del empleado: ");
            double sueldoBase = scanner.nextDouble();
            while (sueldoBase <= 0) {
                System.out.print("Sueldo base inválido. Introduce un valor positivo: ");
                sueldoBase = scanner.nextDouble();
            }

            scanner.nextLine();
            System.out.print("Introduce el puesto del empleado: ");
            String puesto = scanner.nextLine();

            Empleado empleado = new Empleado(nombre, dni, aniosEmpresa, sueldoBase, puesto);
            listaEmpleados.add(empleado);

            System.out.println("Empleado añadido correctamente.\n");
        }

        System.out.println("\nLista de Empleados:");
        for (Empleado empleado : listaEmpleados) {
            empleado.mostrarDatos();
            double sueldoTotal = empleado.getClass().getModifiers();
            System.out.println("Sueldo Total: " + sueldoTotal + "€");
            totalSueldos += sueldoTotal;
        }

        System.out.println("\nTotal de Sueldos: " + totalSueldos + "€");
        scanner.close();
    }

    private static boolean validarDNI(String dni) {
        if (dni == null || dni.length() != 9) {
            return false;
        }

        String numeros = dni.substring(0, 8);
        char letra = dni.charAt(8);
        String letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE";

        try {
            int num = Integer.parseInt(numeros);
            return letra == letrasValidas.charAt(num % 23);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}