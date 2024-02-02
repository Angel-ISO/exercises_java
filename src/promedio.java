import java.util.Scanner;


public class promedio {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("ingresa 1 numero: ");
        int num1 = miScanner.nextInt();

        System.out.print("ingresa otro: ");
        int num2 = miScanner.nextInt();

        System.out.print("ingresa el ultimo: ");
        int num3 = miScanner.nextInt();

        int suma = num1+num2+num3;
        int promedio = suma / 3;

        System.out.println("El promedio es: " + promedio);

    }
}
