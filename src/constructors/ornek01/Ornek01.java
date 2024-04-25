package constructors.ornek01;

public class Ornek01 {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Ahmet", "Yılmaz");
        ogrenci1.bilgileriGoster();

        Ogrenci ogrenci2 = new Ogrenci("Ayşe", "Demir", 20);
        ogrenci2.bilgileriGoster();
    }
}
