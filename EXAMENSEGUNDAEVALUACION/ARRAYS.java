package EXAMENSEGUNDAEVALUACION;

public class ARRAYS {
    public static void main(String[] args) {
        int num = 4; // Define an integer variable
        char[] letras = {'a', 'b', 'c', 'd'}; // Define and initialize a character array

        // Access and print a specific position in the array
        System.out.println("Posición 2 de letras: " + letras[2]); // Accessing index 2 (third element)

        // Iterate through the array with a for loop
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Position: " + i + " Valor: " + letras[i]);
        }

        // Example of a String array for days of the week
        String[] DiaSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        // Use a foreach loop to iterate through the String array
        for (String dia : DiaSemana) {
            System.out.println("Foreach: " + dia);
        }

        System.out.println("FIN");
    }
}
