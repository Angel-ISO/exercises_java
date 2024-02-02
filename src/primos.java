import java.util.Scanner;

public class primos {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("ingrese numero");
        int numerito = miScanner.nextInt();


        if ( numerito > 1 && java.math.BigInteger.valueOf(numerito).isProbablePrime(50)){
            System.out.println("es primo");
        } else{
            System.out.println("no es primo");

        }

    }
}
