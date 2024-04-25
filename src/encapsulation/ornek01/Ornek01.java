package practiseLessons.encapsulation.ornek01;

public class Ornek01 {

    public static void main(String[] args) {

        Kisi kisi = new Kisi();
        kisi.ad = "Hazar"; // Kişi nesnesi oluşturulur ve "ad" özelliği "Hazar" olarak atanır
        kisi.setYas(30);   // "setYas" metodu kullanılarak "yas" özelliği 30 olarak ayarlanır

        int yas = kisi.getYas(); // "getYas" metodu kullanılarak kişinin yaş değeri alınır
        System.out.println("Kişinin yaşı: " + yas); // Kişinin yaş değeri ekrana yazdırılır
    }
}
