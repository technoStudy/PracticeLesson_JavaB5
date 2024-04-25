package constructors.ornek01;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int yas;

    // Constructor 1: ad ve soyadı alarak öğrenci oluşturma
    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = 18; // Varsayılan olarak yaş 18 olarak atanıyor
    }

    // Constructor 2: ad, soyad ve yaş alarak öğrenci oluşturma
    public Ogrenci(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    // bilgileriGoster() metodu: Öğrenci bilgilerini ekrana yazdırma
    public void bilgileriGoster() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Yaş: " + yas);
    }
}

/**
 Yukarıdaki kodda, Ogrenci sınıfı oluşturulmuştur.
 ad, soyad ve yas özellikleri private olarak tanımlanmıştır.
 İlk constructor, ad ve soyad değerlerini alarak bir öğrenci nesnesi oluşturur ve
 yas değerini varsayılan olarak 18 olarak atar.
 İkinci constructor ise ad, soyad ve yas değerlerini alarak bir öğrenci nesnesi oluşturur.
 bilgileriGoster() metodu, öğrencinin adını, soyadını ve yaşını ekrana yazdırır.
 */
