package practiseLessons.maps;

import java.util.HashMap;
import java.util.Scanner;

public class Ornek01 {
    public static void main(String[] args) {

        /**
         Soru:
         Bir metindeki her kelimenin kaç kez geçtiğini sayan ve
         sonucu bir HashMap’te saklayan bir Java programı yazınız.
         Programınız, metni kullanıcıdan alacak ve
         HashMap’i standart çıktıya yazdıracaktır.
         */


        // Tarama nesnesi oluştur
        Scanner input = new Scanner(System.in);
        // Harita nesnesi oluştur
        HashMap<String, Integer> harita = new HashMap<>();
        // Cümleyi oku
        System.out.print("Lütfen bir cümle girin: ");
        String cumle = input.nextLine();
        // Cümleyi kelimelere ayır
        String[] kelimeler = cumle.split("\\s+");
        // Her kelime için
        for (String kelime : kelimeler) {
            // Kelimeyi küçük harfe çevir
            kelime = kelime.toLowerCase();
            // Kelime Harita'te varsa, değerini bir artır
            if (harita.containsKey(kelime)) {
                harita.put(kelime, harita.get(kelime) + 1);
            }
            // Kelime Harita'te yoksa, değerini 1 olarak ekle
            else {
                harita.put(kelime, 1);
            }
        }
        // Harita'yı yazdır
        System.out.println(harita);
    }
}
