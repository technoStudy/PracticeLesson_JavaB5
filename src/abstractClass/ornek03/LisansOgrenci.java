package abstractClass.ornek03;

// Ogrenci sınıfından türeyen LisansOgrenci sınıfını tanımladık
class LisansOgrenci extends Ogrenci {
    public LisansOgrenci(String ad, String soyad) {
        super(ad, soyad);
    }

    // Bilgileri yazdırma metodunu override ettik
    @Override
    public void bilgileriYazdir() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Öğrenci No: " + ogrenciNo);
        System.out.println("Kayıtlı Dersler:");
        for (Ders ders : dersler) {
            System.out.println(ders.getAd() + " - Kredi: " + ders.getKredi());
        }
    }
}

/**
 * LisansOgrenci adında bir alt sınıf, Ogrenci sınıfından türetilmiştir.
 * Bu sınıf, Ogrenci sınıfından tüm özellikleri miras almıştır.
 * LisansOgrenci sınıfı, öğrenci bilgilerini yazdırmak için
 * bilgileriYazdir metodunu override etmektedir.
 * Bu metod, öğrencinin adını, soyadını, öğrenci numarasını
 * ve kayıtlı derslerini yazdırmaktadır.
 */