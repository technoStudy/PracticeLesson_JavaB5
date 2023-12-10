package hafta_03;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

//        //  1. Soru: Kullanıcının girdiği sayı pozitif ise "Sayı pozitiftir",
//        //  negatif ise "Sayı negatiftir" yazdıran bir Java programı yazın.
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Bir sayı girin: ");
//        int sayi = input.nextInt();
//
//        if (sayi > 0) {
//            System.out.println("Sayı pozitiftir.");
//        } else if (sayi < 0) {
//            System.out.println("Sayı negatiftir.");
//        } else {
//            System.out.println("Sayı sıfırdır.");
//        }

        // **************************************************************************************************************

        // 2. Soru: Kullanıcının girdiği yaşa göre "Ehliyet alabilirsiniz" veya
        // "Ehliyet alamazsınız" mesajı veren bir Java programı yazın. Ehliyet yaşı 18'dir.

        Scanner input2 = new Scanner(System.in);
        System.out.print("Yaşınızı girin: ");
        int yas = input2.nextInt();

        if (yas >= 18) {
            System.out.println("Ehliyet alabilirsiniz.");
        } else {
            System.out.println("Ehliyet alamazsınız.");
        }

        // **************************************************************************************************************

//        // 3. Soru: Kullanıcının girdiği iki sayıdan en büyüğünü bulan bir Java programı yazın.
//
//        Scanner input3 = new Scanner(System.in);
//        System.out.print("Birinci sayıyı girin: ");
//        int sayi1 = input3.nextInt();
//        System.out.print("İkinci sayıyı girin: ");
//        int sayi2 = input3.nextInt();
//
//        if (sayi1 > sayi2) {
//            System.out.println("En büyük sayı: " + sayi1);
//        } else {
//            System.out.println("En büyük sayı: " + sayi2);
//        }

        // **************************************************************************************************************

//        // 4. Soru: Kullanıcının girdiği sayının tek veya çift olduğunu kontrol eden bir Java programı yazın.
//
//        Scanner input4 = new Scanner(System.in);
//        System.out.print("Bir sayı girin: ");
//        int sayi3 = input4.nextInt();
//
//        if (sayi3 % 2 == 0) {
//            System.out.println("Sayı çifttir.");
//        } else {
//            System.out.println("Sayı tektir.");
//        }

        // **************************************************************************************************************

//        // 5. Soru: Bir öğrencinin notunu alarak, geçme (60 ve üzeri) veya
//        // kalma durumunu (59 ve altı) gösteren bir Java programı yazınız.
//
//        Scanner input5 = new Scanner(System.in);
//        System.out.print("Öğrencinin notunu girin: ");
//        int not = input5.nextInt();
//
//        String durum;
//        if (not >= 60) {
//            durum = "Geçti";
//        } else {
//            durum = "Kaldı";
//        }
//        System.out.println("Öğrencinin durumu: " + durum);

    }


}
