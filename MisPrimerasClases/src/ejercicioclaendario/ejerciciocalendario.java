package MisPrimerasClases.src.ejercicioclaendario;

public class ejerciciocalendario {
	public static void main(String[] args) {
		// Generar un número aleatorio entre 1 y 12 (meses del año)
		int mes = (int) (Math.random() * 12) + 1;

		System.out.println("Número generado: " + mes);
		String estacion;

		// Determinar la estación del año según el mes
		switch (mes) {
			case 12: // Diciembre
			case 1:  // Enero
			case 2:  // Febrero
				estacion = "Invierno";
				break;
			case 3:  // Marzo
			case 4:  // Abril
			case 5:  // Mayo
				estacion = "Primavera";
				break;
			case 6:  // Junio
			case 7:  // Julio
			case 8:  // Agosto
				estacion = "Verano";
				break;
			case 9:  // Septiembre
			case 10: // Octubre
			case 11: // Noviembre
				estacion = "Otoño";
				break;
			default:
				estacion = "Error: Valor no válido. Debe estar entre 1 y 12.";
				break;
		}

		// Mostrar la estación correspondiente
		System.out.println("La estación correspondiente es: " + estacion);
	}
}
