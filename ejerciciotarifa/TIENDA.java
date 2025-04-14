package ejerciciotarifa;

import java.util.ArrayList;

public class TIENDA {
    private ArrayList<String> listaAlimentos;

    // Constructor
    public TIENDA() {
        listaAlimentos = new ArrayList<>();
    }

    // Métodopara agregar alimentos a la lista
    public void agregarAlimento(String alimento) {
        listaAlimentos.add(alimento);
        System.out.println(alimento + " agregado a la tienda.");
    }

    // Métodoque muestra solo las manzanas
    public void mostrarManzanas() {
        System.out.println("\nManzanas disposables en la tienda:");
        boolean hayManzanas = false;

        for (String alimento : listaAlimentos) {
            if (alimento.equalsIgnoreCase("Manzana")) {
                System.out.println("- " + alimento);
                hayManzanas = true;
            }
        }

        if (!hayManzanas) {
            System.out.println("No hay manzanas en la tienda.");
        }
    }

    // Métodopara contar cuántas manzanas hay
    public int contarManzanas() {
        int contador = 0;
        for (String alimento : listaAlimentos) {
            if (alimento.equalsIgnoreCase("Manzana")) {
                contador++;
            }
        }
        return contador;
    }

    // Métodopara eliminar una manzana (si existe)
    public void eliminarManzana() {
        if (listaAlimentos.contains("Manzana")) {
            listaAlimentos.remove("Manzana");
            System.out.println("Una manzana ha sido eliminada.");
        } else {
            System.out.println("No hay manzanas para eliminar.");
        }
    }

    public static void main(String[] args) {
        TIENDA tienda = new TIENDA();

        // Agregar alimentos
        tienda.agregarAlimento("Manzana");
        tienda.agregarAlimento("Banana");
        tienda.agregarAlimento("Manzana");
        tienda.agregarAlimento("Naranja");
        tienda.agregarAlimento("Manzana");

        // Mostrar manzanas
        tienda.mostrarManzanas();

        // Contar manzanas
        System.out.println("\nNúmero total de manzanas: " + tienda.contarManzanas());

        // Eliminar una manzana
        tienda.eliminarManzana();

        // Mostrar manzanas nuevamente
        tienda.mostrarManzanas();

        // Contar manzanas después de eliminar
        System.out.println("\nNúmero total de manzanas después de eliminar: " + tienda.contarManzanas());
    }
}
