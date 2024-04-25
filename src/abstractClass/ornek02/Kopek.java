package abstractClass.ornek02;

// Hayvan sınıfını genişleten Köpek adında bir sınıf tanımlanıyor.
public class Kopek extends Hayvan {
    // cins adında bir özellik tanımlanıyor.
    private final String cins;

    // Köpek sınıfının yapıcı metodu.
    // Köpek nesnesi oluşturulurken cins belirtilmelidir.
    public Kopek(String cins) {
        this.cins = cins;
    }

    // Hayvan sınıfından miras alınan sesCikar metodu uygulanıyor.
    @Override
    public void sesCikar() {
        // Köpek havladığında "Hav hav!" yazdırılıyor.
        System.out.println("Hav hav!");
    }
}
