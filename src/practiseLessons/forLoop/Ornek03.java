package practiseLessons.forLoop;

public class Ornek03 {
    public static void main(String[] args) {

        /**
         Javada 1'den 10'a kadar olan tek sayıları ekrana yazdıran
         ancak 7 sayısına gelindiğinde sonlanan bir for döngüsü oluşturunuz.
         */

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

    }
}
