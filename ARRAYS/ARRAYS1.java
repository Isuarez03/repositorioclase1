package ARRAYS;

import java.util.Scanner;

public class ARRAYS1 {
    public static void main (String[] args) {
        Scanner ent = new Scanner(System.in);
        String frase="";

        System.out.println("Introduce una frase");
        frase = ent.nextLine();
        String[] palabras = frase.split(";");
        System.out.println("Palabrastotalesas");
    }
}
