package practiseLessons.arrays;

import java.util.Arrays;

public class Ornek02 {


    public static void main(String[] args) {


      // 5 elemanlı bir array oluşturunuz ve arrayi tersten yazdırınız.

        int [] sayilar = {1,2,3,4,5};

        for (int i = 0; i < sayilar.length / 2; i++) {

            int gecici = sayilar[i];

            sayilar[i] = sayilar[sayilar.length - 1 - i];

            sayilar[sayilar.length - 1 - i] = gecici;
        }

        System.out.println("Ters çevrilmiş hali : "+ Arrays.toString(sayilar));

    }
}
