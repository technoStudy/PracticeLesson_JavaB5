package practiseLessons.arrays2D;

public class Ornek06 {

    public static void main(String[] args) {

        /**
         Soru: 3 farklı dersin 10'ar random notunu içeren çok boyutlu bir Array oluşturup içini doldurunuz ve notları tek tek yazdırınız.

         İpuçları:
         1. İlk olarak, her bir dersin notlarını saklamak için ayrı ayrı diziler oluşturun. Her dizi 10 elemanlı olmalıdır.
         2. Ardından, tüm ders notlarını saklamak için bir 2 boyutlu dizi oluşturun. Bu dizi 3 satır ve 10 sütundan oluşmalıdır.
         3. İki adet döngü kullanarak, her bir dersin notlarını rastgele bir şekilde oluşturun ve ilgili dizilere kaydedin.
         İlk döngü dersleri temsil ederken, ikinci döngü notları temsil etmelidir.
         4. Her bir not oluşturulduğunda, ders ve not numarasını kullanarak ekrana yazdırın.
         */

        int[] ders1Notlari = new int[10]; // 10 notu saklar
        int[] ders2Notlari = new int[10]; // 10 notu saklar
        int[] ders3Notlari = new int[10]; // 10 notu saklar

        int[][] tumDersNotlari = new int[3][10]; // (3x10) 30 notu saklar

        for (int ders = 0; ders < 3; ders++) {
            for (int not = 0; not < 10; not++) {
                tumDersNotlari[ders][not] = (int) (Math.random() * 101);
                System.out.println((ders + 1) + ". ders " + (not + 1) + ". not = " + tumDersNotlari[ders][not]);
            }
            System.out.println();
        }
    }
}
