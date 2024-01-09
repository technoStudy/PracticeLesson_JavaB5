package practiseLessons.methods;

import java.util.Scanner;

public class Ornek01 {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Hesap Makinası");
            System.out.println("1. Toplama(+) için 1");
            System.out.println("2. Çıkarma(-) için 2");
            System.out.println("3. Çarpma (x) için 3");
            System.out.println("4. Bölme  (/) için 4");
            System.out.println("5. Çıkış için 1-2-3-4 den farklı bir rakam");

            int secim = scannerInt();
            if (secim != 1 && secim != 2 && secim != 3 && secim != 4){
                System.out.println("Hesap makinası kapatılıyor..");
                return;
            }
            System.out.println("Birinci sayıyı giriniz : ");
            double sayi1 = scannerDouble();
            System.out.println("İkinci sayıyı giriniz : ");
            double sayi2 = scannerDouble();
            //sonuc
            double sonuc = HesaplamaYap(secim,sayi1,sayi2);
            System.out.println("Sonuç : " + sonuc);

        }
    }

    public static int scannerInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static double scannerDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double HesaplamaYap(int secim,double sayi1, double sayi2){

        double sonuc = 0;
        switch (secim){
            case 1:
                sonuc = toplam(sayi1,sayi2);
                break;
            case 2:
                sonuc = cikarma(sayi1,sayi2);
                break;
            case 3:
                sonuc = carpma(sayi1,sayi2);
                break;
            case 4:
                sonuc = bolme(sayi1,sayi2);
                break;


        }

        return sonuc;
    }

    public static double toplam(double sayi1, double sayi2){

        return sayi1+sayi2;
    }
    public static double cikarma(double sayi1, double sayi2){

        return sayi1-sayi2;
    }
    public static double carpma(double sayi1, double sayi2){

        return sayi1*sayi2;
    }
    public static double bolme(double sayi1, double sayi2){
        if (sayi2 != 0){
            return sayi1/sayi2;
        }else {
            System.out.println("Hata : Bölme işlemi ikinci sayı sıfır olamaz.");
            return -1;
        }
    }

}
