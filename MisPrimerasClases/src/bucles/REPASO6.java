package bucles;

import java.util.Scanner;

public class REPASO6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		int numero1 =0, numero2 =0;
		System.out.println ("Introduce un numero entero:");
		numero1 = ent.nextInt(); //declara la variable de lo anterior int es para numeros
		System.out.println("Introduce el segundo numero:");
		numero2 = ent.nextInt();
		if (numero1 < numero2) {
			System.out.println("contando.............." + numero1);
		}
	else {
		while(numero1 >= numero2) {
			System.out.println("Contando............." + numero1);
	}

	}
}
}