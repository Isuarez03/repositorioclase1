import java.util.Scanner;º
public class Pruebalibros {
    public static void main(String[] args) {

        Libro[] libros = new Libro[3]; // Puedes ajustar el tamaño según lo necesario
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < libros.length; i++) {
            System.out.println("Introduce los datos para el libro " + (i + 1) + ":");

            System.out.print("Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Autor: ");
            String autor = scanner.nextLine();

            System.out.print("Año de publicación: ");
            int anioPublicacion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            libros[i] = new Libro(titulo, autor, anioPublicacion);
        }

        System.out.println("\nInformación de los libros:");
        for (Libro libro : libros) {
            System.out.println("-------------------");
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Año de publicación: " + libro.getAnioPublicacion());
        }
    }
}

class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;


    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
}

