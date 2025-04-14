import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase Producto que representa un artículo en el carrito de la compra
class Producto {
    String nombre;
    double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para obtener la descripción del producto
    public String getDescripcion() {
        return nombre + " - $" + precio;
    }
}

// Clase CarritoDeCompra que gestiona los productos en el carrito
class CarritoDeCompra {
    List<Producto> productos;

    // Constructor
    public CarritoDeCompra() {
        productos = new ArrayList<>();
    }

    // Método para agregar un producto al carrito
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para eliminar un producto del carrito
    public void eliminarProducto(String nombre) {
        productos.removeIf(producto -> producto.nombre.equalsIgnoreCase(nombre));
    }

    // Método para calcular el total de la compra
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.precio;
        }
        return total;
    }

    // Método para mostrar los productos en el carrito
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Productos en el carrito:");
            for (Producto producto : productos) {
                System.out.println(producto.getDescripcion());
            }
        }
    }

    // Método para aplicar un descuento
    public double aplicarDescuento(double porcentaje) {
        double total = calcularTotal();
        return total - (total * (porcentaje / 100));
    }
}

public class CarritoDeCompraApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarritoDeCompra carrito = new CarritoDeCompra();

        while (true) {
            System.out.println("\nBienvenido a tu carrito de compra");
            System.out.println("1. Agregar un producto");
            System.out.println("2. Eliminar un producto");
            System.out.println("3. Ver productos en el carrito");
            System.out.println("4. Ver total de la compra");
            System.out.println("5. Aplicar descuento");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    // Añadir un producto nuevo
                    System.out.print("Introduce el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Introduce el precio del producto: ");
                    double precioProducto = scanner.nextDouble();
                    carrito.agregarProducto(new Producto(nombreProducto, precioProducto));
                    System.out.println("Producto '" + nombreProducto + "' agregado al carrito.");
                    break;

                case 2:
                    // Eliminar un producto por nombre
                    System.out.print("Introduce el nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    carrito.eliminarProducto(nombreEliminar);
                    System.out.println("Producto '" + nombreEliminar + "' eliminado del carrito.");
                    break;

                case 3:
                    // Ver productos en el carrito
                    carrito.mostrarProductos();
                    break;

                case 4:
                    // Ver total de la compra
                    System.out.println("El total de la compra es: $" + carrito.calcularTotal());
                    break;

                case 5:
                    // Aplicar descuento
                    System.out.print("Introduce el porcentaje de descuento: ");
                    double descuento = scanner.nextDouble();
                    double totalConDescuento = carrito.aplicarDescuento(descuento);
                    System.out.println("El total con el descuento aplicado es: $" + totalConDescuento);
                    break;

                case 6:
                    // Salir
                    System.out.println("Gracias por usar el carrito de compra. ¡Hasta luego!");
                    return;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
