package practiseLessons.encapsulation.ornek02;

public class HesapHareketi {
    private String tarih;
    private String aciklama;
    private double miktar;
    private String islemTuru;

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
}

/**
 HesapHareketi sınıfı tarih, açıklama, miktar ve işlem türü gibi özellikleri
 tutmak için kullanılmıştır. Bu sınıfın özellikleri private olarak tanımlanmış
 ve bu özelliklere erişim için getter metodları kullanılmıştır.
 */



