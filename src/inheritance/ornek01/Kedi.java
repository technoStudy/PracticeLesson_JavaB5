package practiseLessons.inheritance.ornek01;

import practiseLessons.inheritance.ornek01.Hayvan;

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
