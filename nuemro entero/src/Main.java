import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numEstudiantes=0;
        System.out.print("Introduce el numero de estudiantes");
        numEstudiantes = Integer.parseInt(ent.nextLine());
        for(int i=1 ; i <= numEstudiantes ; i++) {
            System.out.println("Introduce la nota del estudiante nº " + i);
        }
    }
}