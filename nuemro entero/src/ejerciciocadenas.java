import java.util.Scanner;

public class ejerciciocadenas {
    public static void main (String[] args) {

    Scanner ent = new Scanner(System.in);
    String datosEntrada = "", datosMostrar="";

    do {
        System.out.println("Introduce tu nombre");
        datosEntrada = ent.nextLine();
    }While(datosEntrada.matches("[A-Z][a-z]{3,}]"));

    }
    private static void While(boolean matches) {

}