import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner miScaner = new Scanner(System.in);
        System.out.println("insert the temperature on farenheight");
        int grados = miScaner.nextInt();
        double celcius = (grados-32)/1.8;
        System.out.println("the temperature is: C"+ celcius);

    }
}