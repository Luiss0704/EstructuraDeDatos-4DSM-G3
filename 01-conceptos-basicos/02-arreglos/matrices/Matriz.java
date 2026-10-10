package mx.edu.uttt.matrices;

public class Matriz {
    static void main(String[] args) {
        iniciar();
    }


    public static void iniciar() {
        int m[][] = {
                {1, 3, 9},
                {3, 5, 10}
        };
    }


    public static void forMatriz(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            System.out.print("| ");
            for (int column = 0; column < m[row].length; column++) {
                System.out.print(m[row][column] + " | ");
            }
            System.out.println();
        }
    }


    public static void whileMatriz(int[][] m) {
        int row = 0;
        int column = 0;

        while (row < m.length) {
            System.out.print("| ");
            while (column < m[row].length) {
                System.out.print(m[row][column] + " | ");
                column++;
            }
            System.out.println();
            row++;
            column = 0;
        }
    }


    public static void doWhileMatriz(int[][] m) {
        int row = 0;
        int column = 0;

        do {
            System.out.print("| ");
            column = 0;

            do {
                System.out.print(m[row][column] + " | ");
                column++;
            } while (column < m[row].length);

            System.out.println();
            row++;
        } while (row < m.length);
    }


    public static void forWhileMatriz(int[][] m) {
        int column = 0;

        for (int row = 0; row < m.length; row++) {
            column = 0;
            System.out.print("| ");

            while (column < m[row].length) {
                System.out.print(m[row][column] + " | ");
                column++;
            }

            System.out.println();
        }
    }


    public static void forEachMatriz(int[][] m) {
        for (int row[] : m) {
            System.out.print("| ");

            for (int valor : row) {
                System.out.print(valor + " | ");
            }

            System.out.println();
        }
    }
}
