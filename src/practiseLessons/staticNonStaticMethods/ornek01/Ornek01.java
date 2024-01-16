package practiseLessons.staticNonStaticMethods.ornek01;

public class Ornek01 {

    public static void main(String[] args) {
        // İki tane sayı tanımlama
        int sayi1 = 10;
        int sayi2 = 5;

        // HesapMakinesi sınıfındaki topla() ve cikar() metotlarını kullanarak toplama ve çıkarma işlemleri
        int toplam = HesapMakinesi.topla(sayi1, sayi2);
        int fark = HesapMakinesi.cikar(sayi1, sayi2);

        // HesapMakinesi sınıfından bir nesne oluşturma
        HesapMakinesi hesapMakinesi = new HesapMakinesi();

        // Oluşturulan nesne üzerinden carp() ve bol() metotlarını kullanarak çarpma ve bölme işlemleri
        int carpim = hesapMakinesi.carp(sayi1, sayi2);
        int bolum = hesapMakinesi.bol(sayi1, sayi2);

        // Sonuçları ekrana yazdırma
        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Çarpım: " + carpim);
        System.out.println("Bölüm: " + bolum);
    }
}
