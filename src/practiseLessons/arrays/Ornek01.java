package practiseLessons.arrays;

import java.util.Arrays;

public class Ornek01 {

    public static void main(String[] args) {

        int sayi = 5;
        int[] sayiArray = new int[5];
        //  [6][14][21][7][66]  uzunluk = 5 "lenght"
        //  [0][1][2][3][4]  index = 5
        String ad = "Bilal";
        String[] adArray = new String[15];
        //  ["bir"]["iki"]["üç"]["dört"]["beş"]  uzunluk = 5 "lenght"
        //     [0]   [1]    [2]   [3]     [4]  index = 5


        // 5 elemanlı bir tamsayı dizisi oluşturma ve ekrana
        // tek tek yazdırma işlemi yapınız

        int[] soru1Array = new int[6];
        soru1Array[0] = 6;
        soru1Array[1] = 14;
        soru1Array[2] = 21;
        soru1Array[3] = 7;
        soru1Array[4] = 66;
        soru1Array[5] = 44;

        System.out.println(Arrays.toString(soru1Array));
        System.out.println(soru1Array[0]);
        System.out.println(soru1Array[1]);
        System.out.println(soru1Array[2]);
        System.out.println(soru1Array[3]);
        System.out.println(soru1Array[4]);
        System.out.println(soru1Array[5]);

        for (int i = 0; i < soru1Array.length; i++) {
            System.out.println("arrays : " + soru1Array[i]);

        }
        //System.out.println("bunun cevabı ne : " + soru1Array.length);
    }
}
