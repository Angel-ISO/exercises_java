import java.util.Scanner;

public class basicoperations {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.print("ingresa la cantidad de numeros ");
        int numeritos = miScanner.nextInt();


        int resultado = 0;
        var i = 0;
        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;

        while (numeritos > i){
            System.out.print("ingresa numero");
            int numero = miScanner.nextInt();
            resultado += numero;
            i++;
            if (numero < menor) {
                menor = numero;
            }
            if (numero > mayor) {
                mayor = numero;
            }
        }

        double promedio = (double) resultado / numeritos;

        System.out.println("El menor número ingresado es: " + menor);
        System.out.println("El mayor número ingresado es: " + mayor);
        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
    }
