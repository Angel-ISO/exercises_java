import  java.util.Scanner;

public class calculo {

    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        int[] programacion = new int[5];
        int[] logica = new int[5];
        int[] basesDeDatos = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("nota de programacion del estudiante " + i + ": ");
            programacion[i] = myScanner.nextInt();
            System.out.println("nota de logica del estudiante " + i + ": ");
            logica[i] = myScanner.nextInt();
            System.out.println("nota de bases de datos del estudiante " + i + ": ");
            basesDeDatos[i] = myScanner.nextInt();
        }

        float promedioProgramacion = calcularPromedio(programacion);
        float promedioLogica = calcularPromedio(logica);
        float promedioBasesDeDatos = calcularPromedio(basesDeDatos);

        float promedioTotal = (promedioProgramacion + promedioLogica + promedioBasesDeDatos) / 3;

        System.out.println("Promedio de programacion " + promedioProgramacion);
        System.out.println("Promedio de logica " + promedioLogica);
        System.out.println("Promedio de bases de datos " + promedioBasesDeDatos);
        System.out.println("Promedio total del curso " + promedioTotal);

        System.out.println("cual estudiante desea consultar el promedio? ");
        int numeroEstudiante = myScanner.nextInt();

        float promedioAlumno = PromedioEstudiante(programacion, logica, basesDeDatos, numeroEstudiante);

        System.out.println("Promedio del alumno es :" + numeroEstudiante + ": " + promedioAlumno);
    }

    public static float calcularPromedio(int[] arreglo) {
        float suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma / arreglo.length;
    }

    public static float PromedioEstudiante(int[] programacion, int[] logica, int[] basesDeDatos, int numeroEstudiante) {
        return (programacion[numeroEstudiante] + logica[numeroEstudiante] + basesDeDatos[numeroEstudiante]) / 3;
    }
}
