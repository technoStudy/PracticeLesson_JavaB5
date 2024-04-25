package staticNonStaticMethods.ornek01;

public class HesapMakinesi {

    // İki sayıyı toplayan statik bir metot
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    // İki sayıyı çıkaran statik bir metot
    public static int cikar(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    // İki sayıyı çarpan non-statik bir metot
    public int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    // İki sayıyı bölen non-statik bir metot
    public int bol(int sayi1, int sayi2) {
        return sayi1 / sayi2;
    }
}
