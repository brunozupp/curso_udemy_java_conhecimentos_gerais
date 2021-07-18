package section10.exerciciomatriz;

public class ExercicioMatrizExecutar {

    public static void executar() {

        int lines = 3;
        int columns = 3;

        int[][] matrix = new int[lines][columns];

        matrix[0][0] = 5;
        matrix[0][1] = -3;
        matrix[0][2] = 10;

        matrix[1][0] = 15;
        matrix[1][1] = 8;
        matrix[1][2] = 2;

        matrix[2][0] = 7;
        matrix[2][1] = 9;
        matrix[2][2] = -4;

        print(matrix);

        System.out.println();

        printDiagonal(matrix);

        System.out.println();

        System.out.println("Quantidade de números negativos = " + countNegativeNumbers(matrix));
    }

    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {

            var line = matrix[i];

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(line[j] + " ");
            }
            System.out.println();
        }
    }

    private static void printDiagonal(int[][] matrix) {
        System.out.print("Diagonal = ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    private static int countNegativeNumbers(int[][] matrix) {

        int counter = 0;

        for (int i = 0; i < matrix.length; i++) {

            var line = matrix[i];

            for (int j = 0; j < matrix[i].length; j++) {
                if(line[j] < 0) counter++;
            }
        }

        return counter;
    }
}
