package practiseLessons.abstractClass.ornek01;

// Dikdortgen classı oluşturuldu
public class Dikdortgen extends GeometrikSekil {
    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    // Abstract metod override edilerek dikdörtgenin alanı hesaplandı.
    @Override
    public double alanHesapla() {
        return uzunluk * genislik;
    }
}
