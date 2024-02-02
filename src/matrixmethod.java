public class matrixmethod {
    public static void main(String[] args) {
        int[][] numero = { {1, 2, 3, 4}, {5, 6, 7} };
        imprimirMatrix(numero);
    }


     static void imprimirMatrix(int[][] numero) {
         for (int i = 0; i < numero.length; ++i) {
             for (int j = 0; j < numero[i].length; ++j) {
                 System.out.println(numero[i][j]);
             }
         }
     }
}