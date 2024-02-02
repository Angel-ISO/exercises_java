import java.util.Scanner;

public class radioarea {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("ingresa radio del circulo: ");
        double radio = miScanner.nextDouble();


        double area = 3.14 * Math.pow(radio, 2);
        double perimetro = 2 * 3.14 * radio;


        System.out.println("el area del circulo: "+ area);
        System.out.println("el perimetro del circulo: " + perimetro);
    }
    }
