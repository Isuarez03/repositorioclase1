import java.util.*; // Importación fuera de la clase

public class CodigoComplejo {

    static class Nodo {
        int x, y;
        double g, h;
        Nodo padre;

        Nodo(int x, int y) {
            this.x = x;
            this.y = y;
            this.g = Double.MAX_VALUE;
            this.h = 0;
            this.padre = null;
        }

        double getF() {
            return g + h;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Nodo nodo = (Nodo) obj;
            return x == nodo.x && y == nodo.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    static class Mapa {
        private int[][] mapa;
        private int filas, columnas;

        Mapa(int filas, int columnas) {
            this.filas = filas;
            this.columnas = columnas;
            mapa = new int[filas][columnas];
        }

        void establecerObstaculo(int x, int y) {
            mapa[x][y] = 1;
        }

        boolean esValido(int x, int y) {
            return x >= 0 && y >= 0 && x < filas && y < columnas && mapa[x][y] != 1;
        }

        List<Nodo> obtenerVecinos(Nodo nodo) {
            List<Nodo> vecinos = new ArrayList<>();
            int[][] direcciones = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

            for (int[] direccion : direcciones) {
                int nuevoX = nodo.x + direccion[0];
                int nuevoY = nodo.y + direccion[1];
                if (esValido(nuevoX, nuevoY)) {
                    vecinos.add(new Nodo(nuevoX, nuevoY));
                }
            }

            return vecinos;
        }
    }

    static class AEstrella {
        private Mapa mapa;
        private Nodo inicio, objetivo;
        private PriorityQueue<Nodo> abierta;
        private Set<Nodo> cerrada;

        AEstrella(Mapa mapa, Nodo inicio, Nodo objetivo) {
            this.mapa = mapa;
            this.inicio = inicio;
            this.objetivo = objetivo;
            this.abierta = new PriorityQueue<>(Comparator.comparingDouble(Nodo::getF));
            this.cerrada = new HashSet<>();
        }

        private double calcularHeuristica(Nodo nodo) {
            return Math.abs(nodo.x - objetivo.x) + Math.abs(nodo.y - objetivo.y);
        }

        private List<Nodo> reconstruirCamino(Nodo nodo) {
            List<Nodo> camino = new ArrayList<>();
            while (nodo != null) {
                camino.add(nodo);
                nodo = nodo.padre;
            }
            Collections.reverse(camino);
            return camino;
        }

        List<Nodo> ejecutar() {
            inicio.g = 0;
            inicio.h = calcularHeuristica(inicio);
            abierta.add(inicio);

            while (!abierta.isEmpty()) {
                Nodo nodoActual = abierta.poll();
                if (nodoActual.equals(objetivo)) {
                    return reconstruirCamino(nodoActual);
                }

                cerrada.add(nodoActual);

                for (Nodo vecino : mapa.obtenerVecinos(nodoActual)) {
                    if (cerrada.contains(vecino)) continue;

                    double nuevoG = nodoActual.g + 1; // Coste de mover a un vecino
                    if (nuevoG < vecino.g) {
                        vecino.padre = nodoActual;
                        vecino.g = nuevoG;
                        vecino.h = calcularHeuristica(vecino);
                        if (!abierta.contains(vecino)) {
                            abierta.add(vecino);
                        }
                    }
                }
            }

            return null; // No se encontró ningún camino
        }
    }

    public static void main(String[] args) {
        Mapa mapa = new Mapa(10, 10);

        // Establecer algunos obstáculos
        mapa.establecerObstaculo(3, 3);
        mapa.establecerObstaculo(3, 4);
        mapa.establecerObstaculo(3, 5);
        mapa.establecerObstaculo(4, 3);

        Nodo inicio = new Nodo(0, 0);
        Nodo objetivo = new Nodo(9, 9);

        AEstrella aEstrella = new AEstrella(mapa, inicio, objetivo);
        List<Nodo> camino = aEstrella.ejecutar();

        if (camino != null) {
            System.out.println("Camino encontrado:");
            for (Nodo nodo : camino) {
                System.out.println("[" + nodo.x + "," + nodo.y + "]");
            }
        } else {
            System.out.println("No se encontró un camino.");
        }
    }
}

