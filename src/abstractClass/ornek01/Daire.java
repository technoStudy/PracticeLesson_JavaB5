package abstractClass.ornek01;

// Daire classı oluşturuldu
public class Daire extends GeometrikSekil {
    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    // Abstract metod override edilerek dairenin alanı hesaplandı.
    @Override
    public double alanHesapla() {
        return Math.PI * yaricap * yaricap;
    }
}
