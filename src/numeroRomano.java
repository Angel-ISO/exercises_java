import java.util.Scanner;


public class numeroRomano {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 100: ");
        int numero = myScanner.nextInt();

        if (numero >= 1 && numero <= 100) {
            String roman = convertirARomano(numero);
            System.out.println("El valor en romano es: " + roman);
        } else {
            System.out.println("que sea de 1 a 100 ");
        }
    }

    private static String convertirARomano(int numero) {
        StringBuilder resultado = new StringBuilder();

        while (numero >= 100) {
            resultado.append("C");
            numero -= 100;
        }

        switch (numero / 10) {
            case 9:
                resultado.append("XC");
                break;
            case 8:
                resultado.append("LXXX");
                break;
            case 7:
                resultado.append("LXX");
                break;
            case 6:
                resultado.append("LX");
                break;
            case 5:
                resultado.append("L");
                break;
            case 4:
                resultado.append("XL");
                break;
            case 3:
                resultado.append("XXX");
                break;
            case 2:
                resultado.append("XX");
                break;
            case 1:
                resultado.append("X");
                break;
        }

        switch (numero % 10) {
            case 9:
                resultado.append("IX");
                break;
            case 8:
                resultado.append("VIII");
                break;
            case 7:
                resultado.append("VII");
                break;
            case 6:
                resultado.append("VI");
                break;
            case 5:
                resultado.append("V");
                break;
            case 4:
                resultado.append("IV");
                break;
            case 3:
                resultado.append("III");
                break;
            case 2:
                resultado.append("II");
                break;
            case 1:
                resultado.append("I");
                break;
        }

        return resultado.toString();
    }
}

