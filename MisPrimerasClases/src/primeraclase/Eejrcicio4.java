package primeraclase;

public class Eejrcicio4 {
	public static void main (String[] arg) {
//		int numero1 = 1, numero2 = 2;
//		System.out.println("numero1 = " + numero1);
//		System.out.println("numero2 = " + numero2);
//	    numero1 = numero2;
//		numero2 = numero1;
//		System.out.println("intercambiamos");
//		System.out.println("numero1 = " + numero1); //"numero1 = " es una string 
//		System.out.println("numero1 = " + numero2);
		int a=1, b=2, c=3, d=4; 
		int vuxiliar = b;
		
		b=c;
		c=a;
		a=d;
		d=b;
		System.out.println("a:" + a + " b:" + b +
				"c:" + c + "d:" + d);
	}

}
