package practiseLessons.encapsulation.ornek01;

public class Kisi {

    public String ad; // "ad" özelliği herkese açık (public) olarak tanımlanır
    private int yas; // "yas" özelliği private olarak tanımlanır

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
