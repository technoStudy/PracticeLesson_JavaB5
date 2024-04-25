package abstractClass.ornek02;

// Hayvan sınıfını genişleten Kedi adında bir sınıf tanımlanıyor.
public class Kedi extends Hayvan {
    // tuyRengi adında bir özellik tanımlanıyor.
    private final String tuyRengi;

    // Kedi sınıfının yapıcı metodu.
    // Kedi nesnesi oluşturulurken tüy rengi belirtilmelidir.
    public Kedi(String tuyRengi) {
        this.tuyRengi = tuyRengi;
    }

    // Hayvan sınıfından miras alınan sesCikar metodu uygulanıyor.
    @Override
    public void sesCikar() {
        // Kedi miyavladığında "Miyav!" yazdırılıyor.
        System.out.println("Miyav!");
    }
}
