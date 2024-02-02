import java.util.Scanner;

public class Almacenar {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("ingresa la cantidad para guardar");
        int numeritos = miScanner.nextInt();
        int[] guardar = new int[numeritos];

        var i = 0;
        while (numeritos > i){
            System.out.print("ingresa numero  guardar");
            guardar[i] = miScanner.nextInt();
            i++;
        }

        for (int num : guardar){
            System.out.println("los numeros son " + num);
        }

    }
    }
