package abstractClass.ornek03;

import java.util.ArrayList;

// Abstract sınıfı tanımladık
abstract class Ogrenci {
    // Ad, soyad, öğrenci numarası ve derslerin listesi gibi özellikleri tanımladık
    protected String ad;
    protected String soyad;
    protected int ogrenciNo;
    protected ArrayList<Ders> dersler;

    // Constructor metodu
    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        dersler = new ArrayList<>();
    }

    // Ders ekleme metodunu tanımladık
    public void dersEkle(Ders ders) {
        dersler.add(ders);
    }

    // Ders silme metodunu tanımladık
    public void dersSil(Ders ders) {
        dersler.remove(ders);
    }

    // Bilgileri yazdırma abstract metodunu tanımladık
    public abstract void bilgileriYazdir();
}

/**
 * protected anahtar kelimesi, bir sınıfın özelliklerinin
 * sadece o sınıfın kendisi ve o sınıftan türeyen sınıflar tarafından
 * kullanılabilmesini sağlar. Bu özellikleri public yapmak,
 * diğer sınıfların bu özelliklere direkt olarak erişebilmesine izin verirken,
 * private yapmak ise sadece o sınıfın kendisi tarafından kullanılabilmesine izin verir.
 * protected anahtar kelimesi ise, bu özelliklerin sadece o sınıfın kendisi
 * ve o sınıftan türeyen sınıflar tarafından kullanılabilmesine izin verir.
 * Bu örnekte Ogrenci sınıfının özellikleri protected olarak tanımlanmıştır,
 * çünkü bu özelliklerin sadece Ogrenci sınıfı ve ondan türeyen sınıflar tarafından
 * kullanılması gerektiği düşünülmüştür. Bu sayede, Ogrenci sınıfının özellikleri
 * başka sınıflar tarafından yanlışlıkla değiştirilemez veya yanlış kullanılamaz.
 */

/**
 * Ogrenci adında bir soyut sınıf tanımlanmıştır.
 * Bu sınıf, öğrenci adı, soyadı, öğrenci numarası
 * ve kayıtlı derslerin listesi gibi özellikleri içermektedir.
 * Ayrıca dersEkle ve dersSil adında iki metod da tanımlanmıştır.
 * dersEkle metodu, öğrencinin kayıtlı dersler listesine yeni bir ders eklerken,
 * dersSil metodu öğrencinin kayıtlı dersler listesinden bir dersi silmektedir.
 * Bu sınıf soyut olduğundan, bilgileriYazdir metodu bodysiz olarak tanımlanmıştır.
 */