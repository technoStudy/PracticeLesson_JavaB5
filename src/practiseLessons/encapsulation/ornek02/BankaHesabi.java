package practiseLessons.encapsulation.ornek02;

import java.util.ArrayList;
import java.util.List;

public class BankaHesabi {
    private String musteriAdi;
    private String musteriSoyadi;
    private int hesapNumarasi;
    private double hesapBakiyesi;
    private List<HesapHareketi> hesapHareketleri;

    public BankaHesabi(String musteriAdi, String musteriSoyadi, int hesapNumarasi, double hesapBakiyesi) {
        this.musteriAdi = musteriAdi;
        this.musteriSoyadi = musteriSoyadi;
        this.hesapNumarasi = hesapNumarasi;
        this.hesapBakiyesi = hesapBakiyesi;
        this.hesapHareketleri = new ArrayList<>();
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public String getMusteriSoyadi() {
        return musteriSoyadi;
    }

    public void setMusteriSoyadi(String musteriSoyadi) {
        this.musteriSoyadi = musteriSoyadi;
    }

    public int getHesapNumarasi() {
        return hesapNumarasi;
    }

    public double getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(double hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public void hesapHareketiEkle(String tarih, String aciklama, double miktar, String islemTuru) {
        HesapHareketi hareket = new HesapHareketi(tarih, aciklama, miktar, islemTuru);
        hesapHareketleri.add(hareket);
    }

    public List<HesapHareketi> getHesapHareketleri() {
        return hesapHareketleri;
    }
}

/**
 BankaHesabi sınıfı müşteri bilgilerini ve hesap hareketlerini tutmak için kullanılıyor.
 Bu sınıfın özellikleri (ad, soyad, hesap numarası, hesap bakiyesi) private olarak tanımlanmış
 ve bu özelliklere erişim için getter ve setter metodları kullanılarak
 müşteri bilgilerinin doğrudan erişilebilir olmasının önüne geçilmiştir.

 Ayrıca, BankaHesabi sınıfında hesapHareketiEkle metodu tanımlanmıştır.
 Bu metod, tarih, açıklama, miktar ve işlem türü parametrelerini alarak
 yeni bir HesapHareketi nesnesi oluşturur ve bu nesneyi hesapHareketleri listesine ekler.
 Bu sayede, hesap hareketlerinin güvenli bir şekilde eklenmesi sağlanmıştır.
 */
