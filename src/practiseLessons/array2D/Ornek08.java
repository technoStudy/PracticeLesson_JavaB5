package practiseLessons.array2D;

public class Ornek08 {

    public static void main(String[] args) {

        /**
         2 satır ve sırasıyla 3 ve 6 sütundan oluşan bir 2 boyutlu dizi oluşturup,
         bu diziyi FOR DÖNGÜSÜ KULLANMADAN rastgele değerlerle doldurun ve
         elemanlarını FOR DÖNGÜSÜ KULLANARAK ekrana yazdırınız.
         */

        int[][] farkliBoyutlar = {
                { (int) (Math.random() * (100 + 1)), (int) (Math.random() * (100 + 1)), (int) (Math.random() * (100 + 1)) },
                { (int) (Math.random() * (100 + 1)), (int) (Math.random() * (100 + 1)), (int) (Math.random() * (100 + 1)),
                        (int) (Math.random() * (100 + 1)), (int) (Math.random() * (100 + 1)), (int) (Math.random() * (100 + 1)) }
        };

        for (int i = 0; i < farkliBoyutlar.length; i++) {
            for (int j = 0; j < farkliBoyutlar[i].length; j++) {
                System.out.print(farkliBoyutlar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
