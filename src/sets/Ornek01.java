package practiseLessons.sets;

import java.util.HashSet;
import java.util.Scanner;

public class Ornek01 {
    public static void main(String[] args) {

        /**
         Soru: Bir HashSet oluşturun ve içine kullanıcıdan alacağınız 5 adet String eleman ekleyin.
         Sonra HashSet’in boyutunu, içindeki elemanları ve “Java” elemanının var olup olmadığını yazdırın.
         */

        // Bir Scanner nesnesi oluşturun
        Scanner scanner = new Scanner(System.in);

        // Bir HashSet oluşturun
        HashSet<String> set = new HashSet<>();

        // Kullanıcıdan 5 adet String eleman alın
        System.out.println("Lütfen 5 adet String eleman giriniz:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            set.add(input);
        }

        // HashSet'in boyutunu yazdırın
        System.out.println("HashSet'in boyutu: " + set.size());

        // HashSet'in elemanlarını yazdırın
        System.out.println("HashSet'in elemanları: " + set);

        // HashSet'in "Java" elemanını içerip içermediğini yazdırın
        System.out.println("HashSet 'Java' elemanını içeriyor mu? " + set.contains("Java"));

        // Scanner nesnesini kapatın
        scanner.close();
    }
}
