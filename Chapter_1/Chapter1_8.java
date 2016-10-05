/**
 * Created by knoma on 10/5/16.
 */
public class Chapter1_8 {


    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 0, 3, 3, 0}, {1, 2, 3, 3, 1}, {1, 2, 3, 3, 1}, {1, 2, 3, 3, 1}, {1, 2, 3, 3, 1}};
        setZero(matrix);


        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        try {
            int row = matrix.length;
            int column = matrix[0].length;


            StringBuilder sb = new StringBuilder();
            sb.append("|\t");

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    sb.append(matrix[i][j]+"\t");
                }
                sb.append("|");
                System.out.println(sb.toString());
                sb = new StringBuilder();
                sb.append("|\t");
            }

        } catch (Exception e) {
            System.out.println("Matrix is empty");
        }
    }

    private static void setZero(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] ==0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if (row[i]) nullifyRow(matrix,i);
        }

        for (int j = 0; j < column.length; j++) {
            if (column[j]) nullifyColumn(matrix,j);
        }
    }

    private static void nullifyColumn(int[][] matrix, int col) {
        for (int i=0; i < matrix.length; i++){
            matrix[i][col] = 0;
        }
    }

    private static void nullifyRow(int[][] matrix, int row) {
        for (int i=0; i < matrix.length; i++){
            matrix[row][i] = 0;
        }
    }
}
