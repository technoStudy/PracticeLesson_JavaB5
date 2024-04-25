package practiseLessons.encapsulation.ornek02;

import java.util.ArrayList;
import java.util.List;

public class BankaHesabi {
    private final int hesapNumarasi; // Hesap numarasını temsil eden özellik
    private final List<HesapHareketi> hesapHareketleri; // Hesap hareketlerini tutan liste
    private String musteriAdi; // Müşteri adını temsil eden özellik
    private String musteriSoyadi; // Müşteri soyadını temsil eden özellik
    private double hesapBakiyesi; // Hesap bakiyesini temsil eden özellik

    public BankaHesabi(String musteriAdi, String musteriSoyadi, int hesapNumarasi, double hesapBakiyesi) {
        this.musteriAdi = musteriAdi;
        this.musteriSoyadi = musteriSoyadi;
        this.hesapNumarasi = hesapNumarasi;
        this.hesapBakiyesi = hesapBakiyesi;
        this.hesapHareketleri = new ArrayList<>(); // Hesap hareketleri listesini başlatma
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
        hesapHareketleri.add(hareket); // Yeni hesap hareketini listeye ekleme
    }

    public List<HesapHareketi> getHesapHareketleri() {
        return hesapHareketleri;
    }



//    @Override
//    public String toString() {
//        return "BankaHesabi{" +
//                "hesapNumarasi=" + hesapNumarasi +
//                ", hesapHareketleri=" + hesapHareketleri +
//                ", musteriAdi='" + musteriAdi + '\'' +
//                ", musteriSoyadi='" + musteriSoyadi + '\'' +
//                ", hesapBakiyesi=" + hesapBakiyesi +
//                '}';
//    }

    @Override
    public String toString() {
        String result = "Ad: " + this.musteriAdi+ "\n"
                + "Soyad: " + this.musteriSoyadi + "\n"
                + "Hesap Numarası: " + hesapNumarasi + "\n"
                + "Bakiye: " + this.hesapBakiyesi + "\n\n";

        result += "Hesap Hareketleri:\n";
        for (HesapHareketi hareket : hesapHareketleri) {
            result += "Tarih: " + hareket.getTarih() + "\n"
                    + "Açıklama: " + hareket.getAciklama() + "\n"
                    + "Miktar: " + hareket.getMiktar() + "\n"
                    + "İşlem Türü: " + hareket.getIslemTuru() + "\n"
                    + "----------------------\n";
        }

        return result;
    }
}

/**
 * BankaHesabi sınıfı müşteri bilgilerini ve hesap hareketlerini tutmak için kullanılıyor.
 * Bu sınıfın özellikleri (ad, soyad, hesap numarası, hesap bakiyesi) private olarak tanımlanmış
 * ve bu özelliklere erişim için getter ve setter metodları kullanılarak
 * müşteri bilgilerinin doğrudan erişilebilir olmasının önüne geçilmiştir.
 * <p>
 * Ayrıca, BankaHesabi sınıfında hesapHareketiEkle metodu tanımlanmıştır.
 * Bu metod, tarih, açıklama, miktar ve işlem türü parametrelerini alarak
 * yeni bir HesapHareketi nesnesi oluşturur ve bu nesneyi hesapHareketleri listesine ekler.
 * Bu sayede, hesap hareketlerinin güvenli bir şekilde eklenmesi sağlanmıştır.
 */
