package javaClassMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        boolean devam = true;
        while (devam) {
            System.out.println("1. Yeni kişi ekle ");
            System.out.println("2. Çıkış ");
            System.out.print("Seçim : ");
            int secim = scannerInt.nextInt();

            switch (secim) {

                case 1:
                    System.out.print("Kişi Adı : ");
                    String ad = scannerStr.nextLine();
                    System.out.print("Kişi Yaşı : ");
                    int yas = scannerInt.nextInt();
                    System.out.print("Hobileri (virgülle ayırarak girin) : ");
                    String hobilerStr = scannerStr.nextLine();
                    String[] hobiler = hobilerStr.split(",");
                    Hobi hobi = new Hobi();
                    hobi.kisi(ad, yas, hobiler);
                    hobi.bilgiGoster();
                    break;
                case 2:
                    devam = false;
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim lütfen tekrar deneyiniz");
                    break;
            }

        }
    }
}
