package staticNonStaticMethods.ornek02;

public class Dikdortgen {
    public double alanHesapla(double uzunluk, double genislik) {
        return uzunluk * genislik;
    }

    public static double cevreHesapla(double uzunluk, double genislik) {
        return 2 * (uzunluk + genislik);
    }
}
