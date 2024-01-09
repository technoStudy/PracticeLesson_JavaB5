package practiseLessons.arrays;

import java.util.Arrays;

public class Ornek03 {
    public static void main(String[] args) {


      // 6 elemanlı int bir dizide en büyük ve en küçük değerleri yazdırınız.

        int [] sayilar = {12,5,23,45,8,19};
        Arrays.sort(sayilar);
        System.out.println(sayilar[0]);
        System.out.println(sayilar[sayilar.length-1]);
        System.out.println("15. satır : "+Arrays.toString(sayilar));

        int konum = Arrays.binarySearch(sayilar,19);

        System.out.println("Konum : "+ konum);


        int [] sayilar1 = {12,5,23,45,8,19};
        int [] sayilarKopya = Arrays.copyOf(sayilar1,3);
        System.out.println("Orjinali : "+ Arrays.toString(sayilar1));
        System.out.println("Kopyası : "+ Arrays.toString(sayilarKopya));

        int [] sayilar2 = new int[10];

        Arrays.fill(sayilar2, 44);

        System.out.println("içerik : " + Arrays.toString(sayilar2));





    }
}
