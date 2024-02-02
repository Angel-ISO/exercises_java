import java.util.Scanner;

public class hola{
    public static void main(String[] args) {

        Scanner miScaner = new Scanner(System.in);
        System.out.println("ingresa tu nombre");
        String name = miScaner.nextLine();
        System.out.println("hola, yo soy "+ name);

    }
}
