package staticNonStaticMethods.ornek02;

public class Ornek02 {
    public static void main(String[] args) {

        Dikdortgen dikdortgen = new Dikdortgen();

        double uzunluk = 5;
        double genislik = 3;

        double alan = dikdortgen.alanHesapla(uzunluk, genislik);
        System.out.println("Dikdörtgenin alanı: " + alan);

        double cevre = Dikdortgen.cevreHesapla(uzunluk, genislik);
        System.out.println("Dikdörtgenin çevresi: " + cevre);
    }
}
/*
 Bu örnekte, `Dikdortgen` sınıfında `alanHesapla()` adında bir non-static metot
 ve `cevreHesapla()` adında bir static metot tanımladık.
 `alanHesapla()` metodu, dikdörtgenin uzunluğu ve genişliği parametre olarak alarak
 dikdörtgenin alanını hesaplar. `cevreHesapla()` metodu ise dikdörtgenin uzunluğu ve genişliği
 parametre olarak alarak dikdörtgenin çevresini hesaplar.
 */