package abstractClass.ornek01;

// main methodun bulunduğu class oluşturuldu
public class Ornek01 {

    public static void main(String[] args) {
        // Dikdortgen ve Daire sınıflarından nesneler oluşturulup alanları hesaplandı.
        Dikdortgen dikdortgen = new Dikdortgen(5, 3);
        double dikdortgenAlan = dikdortgen.alanHesapla();

        Daire daire = new Daire(4);
        double daireAlan = daire.alanHesapla();

        // Sonuçlar ekrana yazdırılır.
        System.out.println("Dikdörtgen Alanı: " + dikdortgenAlan);
        System.out.println("Daire Alanı: " + daireAlan);
    }
}
