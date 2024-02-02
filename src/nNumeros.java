import java.util.Scanner;

public class nNumeros {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.print("ingresa la cantidad de numeros a sumar");
        int numeritos = miScanner.nextInt();

        int resultado = 0;
        var i = 0;
        while (numeritos > i){
            System.out.print("ingresa numero");
            int numero = miScanner.nextInt();
            resultado+= numero;
            i++;
        }

        System.out.println("La suma de los números ingresados es: " + resultado);
    }
    }
