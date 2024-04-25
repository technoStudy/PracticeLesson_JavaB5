package inheritance.ornek01;

// Köpek sınıfı
public class Kopek extends Hayvan {
    String tasma;

    // Köpek sınıfının yapıcı metodu (constructor)
    public Kopek(String renk, int yas, String tasma) {
        super(renk, yas);
        this.tasma = tasma;
    }

    // Köpek sınıfının havla metodu
    public void havla() {
        System.out.println("Köpek havladı!");
    }

    @Override
    public String toString() {
        return "Kopek{" +
                "tasma='" + tasma + '\'' +
                ", renk='" + renk + '\'' +
                ", yas=" + yas +
                '}';
    }
}
