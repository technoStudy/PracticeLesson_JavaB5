package abstractClass.ornek02;

// Main sınıfı, programın başlangıç noktasıdır.
public class Ornek02 {
    // Main metodu, programın çalıştırıldığı yerdir.
    public static void main(String[] args) {
        // Kedi nesnesi oluşturuluyor.
        // Tüy rengi "Beyaz" olarak belirtiliyor.
        Kedi kedi = new Kedi("Beyaz");

        // Köpek nesnesi oluşturuluyor.
        // Köpek cinsi "Golden Retriever" olarak belirtiliyor.
        Kopek kopek = new Kopek("Golden Retriever");

        // Kedi nesnesinin sesCikar metodu çağrılıyor.
        // Kedi miyavladığında "Miyav!" yazdırılıyor.
        kedi.sesCikar();

        // Köpek nesnesinin sesCikar metodu çağrılıyor.
        // Köpek havladığında "Hav hav!" yazdırılıyor.
        kopek.sesCikar();
    }
}
