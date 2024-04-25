package encapsulation.ornek02;

public class HesapHareketi {
    private final String tarih; // Hesap hareketinin yapıldığı tarihi temsil eden özellik
    private final String aciklama; // Hesap hareketinin açıklamasını temsil eden özellik
    private final double miktar; // Hesap hareketindeki miktarı temsil eden özellik
    private final String islemTuru; // Hesap hareketinin türünü temsil eden özellik

    public HesapHareketi(String tarih, String aciklama, double miktar, String islemTuru) {
        this.tarih = tarih;
        this.aciklama = aciklama;
        this.miktar = miktar;
        this.islemTuru = islemTuru;
    }

    public String getTarih() {
        return tarih;
    }

    public String getAciklama() {
        return aciklama;
    }

    public double getMiktar() {
        return miktar;
    }

    public String getIslemTuru() {
        return islemTuru;
    }

    @Override
    public String toString() {
        return "HesapHareketi{" +
                "tarih='" + tarih + '\'' +
                ", aciklama='" + aciklama + '\'' +
                ", miktar=" + miktar +
                ", islemTuru='" + islemTuru + '\'' +
                '}';
    }
}

/**
 * HesapHareketi sınıfı tarih, açıklama, miktar ve işlem türü gibi özellikleri
 * tutmak için kullanılmıştır. Bu sınıfın özellikleri private olarak tanımlanmış
 * ve bu özelliklere erişim için getter metodları kullanılmıştır.
 */



