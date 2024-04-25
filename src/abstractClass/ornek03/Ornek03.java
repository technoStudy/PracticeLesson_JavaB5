package abstractClass.ornek03;

// Main sınıfı
public class Ornek03 {
    public static void main(String[] args) {
        // LisansOgrenci sınıfından bir öğrenci oluşturduk
        LisansOgrenci ogrenci = new LisansOgrenci("Ahmet", "Yılmaz");

        // Öğrenci numarasını set ettik
        ogrenci.ogrenciNo = 12345;

        // Dersler ekledik
        ogrenci.dersEkle(new Ders("Matematik", 4));
        ogrenci.dersEkle(new Ders("Fizik", 3));

        // Öğrenci bilgilerini yazdırdık
        ogrenci.bilgileriYazdir();
    }
}

/**
 * Ornek03 sınıfı, programın giriş noktasıdır.
 * Bu sınıfta, LisansOgrenci sınıfından bir öğrenci oluşturulmuş,
 * öğrenci numarası ve dersler eklenmiştir.
 * Son olarak, öğrenci bilgileri yazdırılmıştır.
 */

/**
 * Bu program, öğrenci ve ders kayıt sistemi örneği sunmaktadır.
 * Ogrenci sınıfı, öğrenci özelliklerini ve
 * dersEkle ve dersSil metodlarını içermektedir.
 * LisansOgrenci sınıfı, Ogrenci sınıfından türemiş olup,
 * bilgileriYazdir metodunu override etmektedir.
 * Ders sınıfı, ders özelliklerini içermektedir.
 * Main sınıfı ise programın giriş noktasıdır
 * ve öğrenci bilgileri yazdırılmaktadır.
 */
