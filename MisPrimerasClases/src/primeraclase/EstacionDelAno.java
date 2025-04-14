package primeraclase;

	import java.util.Random;

	public class EstacionDelAno {
	    public static void main(String[] args) {
	        // Generar un número aleatorio entre 1 y 15
	        int mes = (int) (Math.random() * 15) + 1;

	        System.out.println("Número generado: " + mes);
	        String estacion;

	        // Determinar la estación del año según el mes
	        switch (mes) {
	            case 1: // Enero
	            case 2: // Febrero
	            case 3: // Marzo
	                estacion = "Invierno";
	                break;
	            case 4: // Abril
	            case 5: // Mayo
	            case 6: // Junio
	                estacion = "Primavera";
	                break;
	            case 7: // Julio
	            case 8: // Agosto
	            case 9: // Septiembre
	                estacion = "Verano";
	                break;
	            case 10: // Octubre
	            case 11: // Noviembre
	            case 12: // Diciembre
	                estacion = "Otoño";
	                break;
	            default:
	                estacion = "Error: Valor no válido. Debe estar entre 1 y 12.";
	                break;
	        }

	        // Mostrar la estación
	        System.out.println("La estación correspondiente es: " + estacion);
	    }
	}



