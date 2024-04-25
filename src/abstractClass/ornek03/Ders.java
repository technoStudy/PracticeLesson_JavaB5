package abstractClass.ornek03;

// Ders sınıfını tanımladık
class Ders {
    // Dersin adı ve kredi saati gibi özellikleri tanımladık
    private final String ad;
    private final int kredi;

    // Constructor metodu
    public Ders(String ad, int kredi) {
        this.ad = ad;
        this.kredi = kredi;
    }

    // Getter metotları
    public String getAd() {
        return ad;
    }

    public int getKredi() {
        return kredi;
    }
}

/**
 * Ders adında bir sınıf da tanımlanmıştır.
 * Bu sınıf, ders adı ve kredi saati gibi özellikleri içermektedir.
 * Ders sınıfı, iki özellik ve bir constructor metod içermektedir.
 * Ayrıca getAd ve getKredi adında iki getter metodu da tanımlanmıştır.
 * Bu metotlar, ders adı ve kredi saati bilgilerini döndürmektedir.
 */
