package practiseLessons.array2D;

import java.util.Arrays;

public class Ornek07 {

    public static void main(String[] args) {

        // 4*4 bir int 2D Array tanımlayınız ve random doldurup ekrana yazdırınız 0 den 10'a kadar(10 dahil)

        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 11);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
