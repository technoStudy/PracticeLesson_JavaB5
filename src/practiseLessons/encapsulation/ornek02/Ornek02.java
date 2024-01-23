package practiseLessons.encapsulation.ornek02;

import java.util.List;

public class Ornek02 {

    public static void main(String[] args) {
        // BankaHesabi nesnesi oluşturma
        BankaHesabi bankaHesabi = new BankaHesabi("Ahmet", "Yılmaz", 123456, 5000.0);

        // Hesap hareketi ekleme
        bankaHesabi.hesapHareketiEkle("22.01.2024", "Para yatırma", 1000.0, "Yatırım");

        // Hesap hareketlerini alma
        List<HesapHareketi> hesapHareketleri = bankaHesabi.getHesapHareketleri();

        // Hesap hareketlerini ekrana yazdırma
        for (HesapHareketi hareket : hesapHareketleri) {
            System.out.println("Tarih: " + hareket.getTarih());
            System.out.println("Açıklama: " + hareket.getAciklama());
            System.out.println("Miktar: " + hareket.getMiktar());
            System.out.println("İşlem Türü: " + hareket.getIslemTuru());
            System.out.println("----------------------");
        }
    }
}

/**
 Ornek02 sınıfında BankaHesabi nesnesi oluşturulmuş ve bu nesne üzerinden hesapHareketiEkle metodu
 çağrılarak bir hesap hareketi eklenmiştir. Ardından, getHesapHareketleri metodu ile hesap hareketleri alınmış
 ve for döngüsü kullanılarak bu hareketler ekrana yazdırılmıştır.
 */
