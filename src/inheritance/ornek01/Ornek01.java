package inheritance.ornek01;

// Ana sınıf
public class Ornek01 {

    public static void main(String[] args) {
        // Kedi nesnesi oluşturma
        Kedi kedi = new Kedi("beyaz", 2);

        // Köpek nesnesi oluşturma
        Kopek kopek = new Kopek("siyah", 3, "kırmızı");

        // Kedi bilgilerini ekrana yazdırma
        System.out.println("Kedi: ");
        System.out.println("Renk: " + kedi.renk);
        System.out.println("Yaş: " + kedi.yas);

        // Kedi miyavlama
        System.out.println("Ses: ");
        kedi.miyavla();

        // Köpek bilgilerini ekrana yazdırma
        System.out.println("Köpek: ");
        System.out.println("Renk: " + kopek.renk);
        System.out.println("Yaş: " + kopek.yas);
        System.out.println("Tasma: " + kopek.tasma);

        // Köpek havlama
        System.out.println("Ses: ");
        kopek.havla();
    }
}
