package practiseLessons.sets;

import java.util.TreeSet;

public class Ornek02 {
    public static void main(String[] args) {

        /**
         Soru: Bir TreeSet oluşturun ve içine 1 ila 100 arası 10 adet rastgele sayı ekleyin.
         Sonra TreeSet’in ilk, son, en küçük ve en büyük elemanlarını yazdırın.
         Ayrıca, TreeSet’in 20’den küçük ve 80’den büyük elemanlarını içeren bir alt kümesini yazdırın.
         */

        // Bir TreeSet oluşturun
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            int number= (int) (Math.random()*101);
            treeSet.add(number);
        }


//        Random random = new Random();
//
//        for (int i = 0; i < 10; i++) {
//            int number = random.nextInt(101);
//            treeSet.add(number);
//        }

        // TreeSet'in elemanlarını yazdırın
        System.out.println("TreeSet'in elemanları: " + treeSet);

        // TreeSet'in ilk elemanını yazdırın
        System.out.println("TreeSet'in ilk elemanı: " + treeSet.first());

        // TreeSet'in son elemanını yazdırın
        System.out.println("TreeSet'in son elemanı: " + treeSet.last());

        // TreeSet'in en küçük elemanını yazdırın
        System.out.println("TreeSet'in en küçük elemanı: " + treeSet.pollFirst());

        // TreeSet'in en büyük elemanını yazdırın
        System.out.println("TreeSet'in en büyük elemanı: " + treeSet.pollLast());

        // TreeSet'in 20'den küçük ve 80'den büyük elemanlarını içeren bir alt kümesini oluşturun
        TreeSet<Integer> altKume = new TreeSet<>();

        for (int sayi : treeSet) {
            if (sayi > 20 && sayi < 80) {
                altKume.add(sayi);
            }
        }
        // Alt kümenin elemanlarını yazdırın
        System.out.println("TreeSet'in 20'den küçük ve 80'den büyük elemanları: " + altKume);

    }
}
