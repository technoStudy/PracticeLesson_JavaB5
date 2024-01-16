package practiseLessons.constructors.ornek02;

public class Kitap {
    private String isim;
    private String yazar;
    private int sayfaSayisi;

    // İsim ve yazar bilgileri zorunlu olduğundan, ilk constructor bunları alır.
    public Kitap(String isim, String yazar) {
        // Eğer isim veya yazar değeri null veya boş bir değer ise, "Belirtilmemiş" değeri atanır.
        if (isim == null || isim.trim().isEmpty()) {
            this.isim = "Belirtilmemiş";
        } else {
            this.isim = isim;
        }

        if (yazar == null || yazar.trim().isEmpty()) {
            this.yazar = "Belirtilmemiş";
        } else {
            this.yazar = yazar;
        }

        // Sayfa sayısı verilmezse, varsayılan olarak 0 atanır.
        this.sayfaSayisi = 0;
    }

    // İsim, yazar ve sayfa sayısı bilgileri alınabilir olduğundan, ikinci constructor bunları alır.
    public Kitap(String isim, String yazar, int sayfaSayisi) {
        // Eğer isim veya yazar değeri null veya boş bir değer ise, "Belirtilmemiş" değeri atanır.
        if (isim == null || isim.trim().isEmpty()) {
            this.isim = "Belirtilmemiş";
        } else {
            this.isim = isim;
        }

        if (yazar == null || yazar.trim().isEmpty()) {
            this.yazar = "Belirtilmemiş";
        } else {
            this.yazar = yazar;
        }

        // Sayfa sayısı verilirse, verilen değer atanır.
        this.sayfaSayisi = sayfaSayisi;
    }

    // Kitap bilgilerini ekrana yazdırmak için kullanılan metot.
    public void bilgileriGoster() {
        System.out.println("İsim: " + isim);
        System.out.println("Yazar: " + yazar);
        System.out.println("Sayfa Sayısı: " + sayfaSayisi);
    }
}

/**
 Yukarıdaki kodda, Kitap sınıfı oluşturulmuştur.
 Bu sınıf, isim, yazar ve sayfaSayisi özelliklerine sahiptir.
 Bu özellikler private olarak tanımlanmıştır.

 Kitap sınıfının ilk constructor'ı, isim ve yazar değerlerini alır.
 Eğer isim veya yazar değeri null veya boş bir değer ise, "Belirtilmemiş" değeri atanır.
 Aksi halde, verilen değerler atanır. sayfaSayisi değeri varsayılan olarak 0 olarak atanır.

 İkinci constructor ise isim, yazar ve sayfaSayisi değerlerini alır.
 Yine, isim veya yazar değeri null veya boş bir değer ise, "Belirtilmemiş" değeri atanır.
 Aksi halde, verilen değerler atanır.

 bilgileriGoster() metodu, kitabın ismini, yazarını ve sayfa sayısını ekrana yazdırmak için kullanılır.
 */