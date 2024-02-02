import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {

        Scanner miScaner = new Scanner(System.in);

        System.out.println("ingresa un numero entero:");
        Integer num1 = miScaner.nextInt();
        System.out.println("ingresa otro numero entero:");
        Integer num2 = miScaner.nextInt();

        int multiplicacion = num1 * num2;
        System.out.println("el resultado es:  " + multiplicacion);

    }
    
}
