package practiseLessons.arrays2D;

public class Ornek02 {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // matrix'in 2. satırındaki tüm elemanları ekrana yazdırın.

        for (int i = 0; i < matrix[1].length; i++) {
            System.out.print(matrix[1][i] + " ");
        }

    }
}
