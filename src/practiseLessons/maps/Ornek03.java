package practiseLessons.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ornek03 {

//    Talep: Restoran uygulaması geliştirme
//
//    Restoran, kullanıcıların menüden sipariş verebileceği bir uygulama geliştirmek istiyor.
//    Aşağıdaki gereksinimlere uygun bir Java programı yazmanız gerekmektedir:
//
//    1- Restoranın menüsü, yemek adları ve fiyatlarından oluşan bir HashMap veri yapısı kullanılarak tanımlanmalıdır.
//    2- Kullanıcıya menüdeki yemekleri ve fiyatlarını gösteren bir liste sunulmalıdır.
//    3- Kullanıcı, sipariş listesini girmek için programdan bir giriş istemelidir. Siparişler virgülle
//       ayrılmış olarak girilmelidir.
//    4- Program, kullanıcının girdiği siparişlerin toplam fiyatını hesaplamalı ve ekrana yazdırmalıdır.
//    5- Program, kullanıcının girdiği siparişlerin indirim tutarını hesaplamalı ve ekrana yazdırmalıdır.
//       İndirimler, özel tekliflerin bulunduğu bir HashMap veri yapısı kullanılarak tanımlanmalıdır.
//    6- Program, toplam tutarı hesaplayarak ekrana yazdırmalıdır (toplam fiyat - indirim tutarı).
//    7- Kullanıcının girdiği sipariş listesini ekrana yazdırmalıdır.
//    İstenen özelliklere sahip bir Java programı geliştirerek, restoranın taleplerini karşılayabilirsiniz.

    public static void main(String[] args) {
        Map<String, Double> menu = new HashMap<>();

        // Yemekleri ekleme
        menu.put("Köfte", 25.99);
        menu.put("Kebap", 35.99);
        menu.put("Pilav", 12.99);
        menu.put("Salata", 8.99);
        menu.put("Tatlı", 15.99);

        // Özel teklifleri ekleyin
        Map<String, Double> ozelTeklifler = new HashMap<>();
        ozelTeklifler.put("Kebap", 0.2); // Kebap için %20 indirim
        ozelTeklifler.put("Tatlı", 0.1); // Tatlı için %10 indirim

        // Yemek listesini ekrana yazdırma
        System.out.println("Menü:");
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sipariş listesini girin (virgülle ayırarak): ");
        String siparisListesi = scanner.nextLine();
        String[] siparisler = siparisListesi.split(",");

        // Siparişin toplam fiyatını hesaplama
        double toplamFiyat = hesaplaToplamFiyat(menu, siparisler);
        System.out.println("Toplam Fiyat: " + toplamFiyat);

        // İndirim tutarını hesaplama
        double indirimTutari = hesaplaIndirimTutari(menu, ozelTeklifler, siparisler);
        System.out.println("İndirim Tutarı: " + indirimTutari);

        // Toplam tutarı hesaplama
        double toplamTutar = toplamFiyat - indirimTutari;
        System.out.println("Toplam Tutar: " + toplamTutar);

        // Sipariş listesini ekrana yazdırma
        System.out.println("Siparişleriniz:");
        for (String siparis : siparisler) {
            System.out.println(siparis);
        }
    }

    public static double hesaplaToplamFiyat(Map<String, Double> menu, String[] siparisler) {
        double toplam = 0.0;

        for (String siparis : siparisler) {
            if (menu.containsKey(siparis)) {
                double fiyat = menu.get(siparis);
                toplam += fiyat;
            }
        }

        return toplam;
    }

    public static double hesaplaIndirimTutari(Map<String, Double> menu, Map<String, Double> ozelTeklifler, String[] siparisler) {
        double indirimTutari = 0.0;

        for (String siparis : siparisler) {
            if (menu.containsKey(siparis) && ozelTeklifler.containsKey(siparis)) {
                double fiyat = menu.get(siparis);
                double indirimOrani = ozelTeklifler.get(siparis);
                double indirimMiktari = fiyat * indirimOrani;
                indirimTutari += indirimMiktari;
            }
        }

        return indirimTutari;
    }
}
