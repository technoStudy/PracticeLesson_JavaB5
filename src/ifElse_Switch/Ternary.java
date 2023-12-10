package ifElse_Switch;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {

        // Soru 1:
        // Kullanıcıdan alınan bir sayının pozitif, negatif veya
        // sıfır olduğunu nasıl kontrol edebiliriz?
        // Ternary operatörünü kullanarak bu kontrolü yapın.

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        String durum = (sayi > 0) ? "Pozitif" : (sayi < 0) ? "Negatif" : "Sıfır";
        System.out.println("Girilen sayı " + durum + "dır.");

        // **************************************************************************************************************

        // 2. Soru: Kullanıcının girdiği yaşa göre "Ehliyet alabilirsiniz" veya
        // "Ehliyet alamazsınız" mesajı veren bir Java programı yazın. Ehliyet yaşı 18'dir.
        // Ternary operatör kullanarak gerekli kontrolü yapınız.

        Scanner input2 = new Scanner(System.in);
        System.out.print("Yaşınızı girin: ");
        int yas = input2.nextInt();

        String durum2 = (yas >= 18) ? "Ehliyet alabilirsiniz" : "Ehliyet alamazsınız";
        System.out.println(durum);


        // **************************************************************************************************************

        // Soru 3:
        // Kullanıcıdan alınan iki sayı arasındaki en büyük sayıyı bulunuz.
        // Ternary operatör kullanarak bulunuz

        Scanner input3 = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = input3.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = input3.nextInt();

        int enBuyuk = (sayi1 > sayi2) ? sayi1 : sayi2;
        System.out.println("En büyük sayı: " + enBuyuk);


        // **************************************************************************************************************

        // 4. Soru: Kullanıcının girdiği sayının tek veya çift olduğunu kontrol eden bir Java programı yazın.
        // Ternary operatör kullanarak gerekli kontrolü yapınız.

        Scanner input4 = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi3 = input4.nextInt();

        String durum4 = (sayi3 % 2 == 0) ? "Çift" : "Tek";
        System.out.println("Girilen sayı " + durum + "tır.");

        // **************************************************************************************************************

        // 5. Soru: Bir öğrencinin notunu alarak, geçme (60 ve üzeri) veya
        // kalma durumunu (59 ve altı) gösteren bir Java programı yazınız.
        // Ternary operatör kullanarak gerekli kontrolü yapınız.

        Scanner input5 = new Scanner(System.in);
        System.out.print("Öğrencinin notunu girin: ");
        int not = input5.nextInt();

        String durum5 = (not >= 60) ? "Geçti" : "Kaldı";
        System.out.println("Öğrencinin durumu: " + durum5);

    }

}

