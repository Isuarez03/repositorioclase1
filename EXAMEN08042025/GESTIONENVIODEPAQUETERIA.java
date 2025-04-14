package EXAMEN08042025;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
public class GESTIONENVIODEPAQUETERIA {
    System.out.pritnln("añadir nuevo envio (nacional o internacional)");
    System.out.println("mostrar todos los envios");
    System.out.println("guardar o salir");
     Scanner scanner = new Scanner(System.in);
    int envio = 1;
            do {
        System.out.print("añadir nuevo envio (nacional o internacional: ");
        if (scanner.hasNextInt()) {
        }
        boolean;
            int envio= 1
            envio = scanner.nextInt();
            if (envio) {
                System.out.println("envio debe ser util ");
            }
        } else {
            System.out.println("ingrese datos del envio.");
            scanner.next();
        }
    } while (

    public int getEnvio() {
        return envio;
    );
}
