import java.util.Scanner;

public class diassemana {
    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        System.out.print("ingresa un numero de 1 a 7: ");
        int numerito = miScanner.nextInt();


        switch (numerito) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
    }
    }
}
