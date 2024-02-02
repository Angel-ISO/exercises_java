import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int w = 3;
        int h = 3;

        int[][] tabla = new int[h][w];

        imprimirTablero(tabla);

        int turno = 1;

        while (true) {
            int fila = leerFila();
            int columna = leerColumna();

            if (tabla[fila][columna] == 0) {
                tabla[fila][columna] = turno;
                turno = (turno == 1 ? 2 : 1);

                imprimirTablero(tabla);

                if (comprobarGanador(tabla)) {
                    System.out.println(" jugador " + (turno == 1 ? "X" : "O") + " gano");
                    break;
                }

                if (comprobarEmpate(tabla)) {
                    System.out.println("empate");
                    break;
                }
            } else {
                System.out.println(" casilla ocupada.");
            }
        }

        System.out.println("quieres jugar de nuevo ?");
        if (myScanner.nextLine().equalsIgnoreCase("n")) {
            System.out.println("gracias por jugar");
        } else {
            main(args);
        }
    }

    public static void imprimirTablero(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print("| " + (tabla[i][j] == 0 ? " " : (tabla[i][j] == 1 ? "X" : "O")) + " ");
            }
            System.out.println("|");
            if (i < tabla.length - 1) {
                System.out.println("---------");
            }
        }
    }

    public static int leerFila() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la fila (0-2): ");
        return scanner.nextInt();
    }

    public static int leerColumna() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la columna (0-2): ");
        return scanner.nextInt();
    }

    public static boolean comprobarGanador(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i][0] != 0 && tabla[i][0] == tabla[i][1] && tabla[i][1] == tabla[i][2]) {
                return true;
            }
            if (tabla[0][i] != 0 && tabla[0][i] == tabla[1][i] && tabla[1][i] == tabla[2][i]) {
                return true;
            }
        }

        if (tabla[0][0] != 0 && tabla[0][0] == tabla[1][1] && tabla[1][1] == tabla[2][2]) {
            return true;
        }
        if (tabla[0][2] != 0 && tabla[0][2] == tabla[1][1] && tabla[1][1] == tabla[2][0]) {
            return true;
        }

        return false;
    }

    public static boolean comprobarEmpate(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
