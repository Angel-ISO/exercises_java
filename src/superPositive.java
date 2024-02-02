import java.util.Scanner;

public class superPositive {
    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        System.out.print("ingresa un numero de -1000 a 1000: ");
        int numerito = miScanner.nextInt();


        if (numerito == 0)
        {
            System.out.println("el numero es  " + numerito);
        } else if (numerito > 0 && numerito < 1000 ){
            System.out.println("El numero es positivo");
        } else if(numerito >= 1000){
            System.out.println("el numero es super positivo");
        } else if (numerito < 0 && numerito > -1000) {
            System.out.println("el numero es negativo");
        } else if(numerito <= -1000){
            System.out.println(" el numero es super negativo");
        }


    }
    }
