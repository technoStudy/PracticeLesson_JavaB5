package inheritance.ornek01;


// Kedi sınıfı
public class Kedi extends Hayvan {
    // Kedi sınıfının yapıcı metodu (constructor)
    public Kedi(String renk, int yas) {
        super(renk, yas);
    }

    // Kedi sınıfının miyavla metodu
    public void miyavla() {
        System.out.println("Kedi miyavladı!");
    }
}
