package practiseLessons.array2D;

public class Ornek05 {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // matrix'in her bir sütunundaki elemanların toplamını ekrana yazdırın.

        for (int i = 0; i < matrix.length; i++) {
            int sutunToplam = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                    sutunToplam += matrix[j][i];
            }
            System.out.println("Sütun " + (i+1) + " toplamı: " + sutunToplam);
        }
    }
}
