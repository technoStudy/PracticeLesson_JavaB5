package practiseLessons.arrays2D;

public class Ornek09 {

    public static void main(String[] args) {

        /**
         2 satır ve sırasıyla 3 ve 6 sütundan oluşan bir 2 boyutlu dizi oluşturup,
         bu diziyi FOR DÖNGÜSÜ KULLANARAK rastgele değerlerle doldurun ve elemanlarını ekrana yazdırınız.
         */

        int[][] farkliBoyutlar = new int[2][];
        farkliBoyutlar[0] = new int[3]; // İlk satırda 3 sütun
        farkliBoyutlar[1] = new int[6]; // İkinci satırda 6 sütun


        System.out.println("****************");
        for (int i = 0; i < farkliBoyutlar.length; i++) { // satır sayısı

            for (int j = 0; j < farkliBoyutlar[i].length; j++) { // sütun sayısı
                farkliBoyutlar[i][j] = (int) (Math.random() * (100 + 1));
                System.out.print(farkliBoyutlar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("****************");
    }
}
