package section10.exerciciomatrizfixacao;

public class ExercicioMatrizFixacaoExecutar {

    public static void executar() {

        int lines = 3;
        int columns = 4;

        int[][] matrix = new int[lines][columns];

        matrix[0][0] = 4;
        matrix[0][1] = 5;
        matrix[0][2] = 3;
        matrix[0][3] = 4;

        matrix[1][0] = 1;
        matrix[1][1] = 2;
        matrix[1][2] = 4;
        matrix[1][3] = 6;

        matrix[2][0] = 3;
        matrix[2][1] = 2;
        matrix[2][2] = 5;
        matrix[2][3] = 6;

        print(matrix);
        System.out.println();

        int lineChose = 2;
        int columnChose = 3;
        int number = matrix[lineChose][columnChose];
        System.out.println("Chosen Number = " + number);

        printLeftNumber(matrix,lineChose,columnChose,columns);
        printRigthNumber(matrix,lineChose,columnChose,columns);
        printTopNumber(matrix,lineChose,columnChose,lines);
        printBottomNumber(matrix,lineChose,columnChose,lines);
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

    private static void printLeftNumber(int[][] matrix, int currentLine, int currentColumn, int numberOfColumns) {
        int column = currentColumn - 1;

        if(column < 0 || column >= numberOfColumns) {
            System.out.println("Nenhum número a esquerda");
            return;
        }

        System.out.println("Esquerda: " + matrix[currentLine][column]);
    }

    private static void printRigthNumber(int[][] matrix, int currentLine, int currentColumn, int numberOfColumns) {
        int column = currentColumn + 1;

        if(column < 0 || column >= numberOfColumns) {
            System.out.println("Nenhum número a direita");
            return;
        }

        System.out.println("Direita: " + matrix[currentLine][column]);
    }

    private static void printTopNumber(int[][] matrix, int currentLine, int currentColumn, int numberOfLines) {
        int line = currentLine - 1;

        if(line < 0 || line >= numberOfLines) {
            System.out.println("Nenhum número acima");
            return;
        }

        System.out.println("Acima: " + matrix[line][currentColumn]);
    }

    private static void printBottomNumber(int[][] matrix, int currentLine, int currentColumn, int numberOfLines) {
        int line = currentLine + 1;

        if(line < 0 || line >= numberOfLines) {
            System.out.println("Nenhum número abaixo");
            return;
        }

        System.out.println("Abaixo: " + matrix[line][currentColumn]);
    }
}
