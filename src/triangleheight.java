import java.util.Scanner;

public class triangleheight {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.print("ingresa altura triangulo");
        int triangle = miScanner.nextInt();

        for (int i = 0; i <= triangle; i++) {
            for(int f=0; f<=i; f++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    }
