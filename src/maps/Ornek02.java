package practiseLessons.maps;

import java.util.HashMap;
import java.util.Scanner;

public class Ornek02 {
    public static void main(String[] args) {

        /**
         Soru:
         Kullanıcıdan alınan bir cümledeki harflerin sayısını hesaplayan bir Java programı yazın.
         Program, harfleri alfabetik olarak sıralamalı ve her harfin kaç kez tekrarlandığını yazdırmalıdır.
         */


        // Tarama nesnesi oluştur
        Scanner input = new Scanner(System.in);

        // HashMap nesnesi oluştur
        HashMap<Character, Integer> harfler = new HashMap<>();

        // Kullanıcıdan cümleyi al
        System.out.print("Cümle girin: ");
        String cumle = input.nextLine();

        // Cümledeki harfleri say
        for (int i = 0; i < cumle.length(); i++) {
            char harf = cumle.charAt(i);

            // Harf alfabetik değilse, atla
            if (!(harf >= 'a' && harf <= 'z') && !(harf >= 'A' && harf <= 'Z')) {
                continue;
            }

            // Harf HashMap'te varsa, değerini bir artır
            if (harfler.containsKey(harf)) {
                harfler.put(harf, harfler.get(harf) + 1);
            }
            // Harf HashMap'te yoksa, değerini 1 olarak ekle
            else {
                harfler.put(harf, 1);
            }
        }

        // HashMap'i yazdır
        System.out.println("Harf Sayısı:");
        for (char harf : harfler.keySet()) {
            int adet = harfler.get(harf);
            System.out.println(harf + " - " + adet + " adet");
        }
    }
}
