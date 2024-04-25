package inheritance.ornek02;

// Ana sınıf
public class Ornek02 {
    public static void main(String[] args) {
        // Muhasebeci nesnesi oluşturma ve bilgilerini ayarlama
        Muhasebeci muhasebeci = new Muhasebeci("Ahmet", 5000);

        System.out.println("Muhasebeci :");

        // Muhasebecinin bilgilerini yazdırma
        muhasebeci.bilgileriYazdir();

        // Muhasebecinin maaşını hesaplama ve yazdırma
        muhasebeci.maasHesapla();

        System.out.println("--------------------");

        System.out.println("Yönetici: ");

        // Yönetici nesnesi oluşturma ve bilgilerini ayarlama
        Yonetici yonetici = new Yonetici("Ayşe", 8000, "İnsan Kaynakları");

        // Yöneticinin bilgilerini yazdırma
        yonetici.bilgileriYazdir();
    }
}