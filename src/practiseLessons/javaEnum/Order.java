package practiseLessons.javaEnum;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Drinks, Integer> orderDetails;

    public Order() {
        orderDetails = new HashMap<>();
    }

    public void addOrder(Drinks drink, int pcs) {
        orderDetails.put(drink, pcs);
    }

    public void showOrderDetails() {
        System.out.println("Sipariş Detayı:");
        for (Map.Entry<Drinks, Integer> entry : orderDetails.entrySet()) {
            System.out.println("İçecek: " + entry.getKey().getAd());
            System.out.println("Adet: " + entry.getValue());
            System.out.println("-------------------------");
        }
    }
}
/*
private Map<Icecek, Integer> siparisDetay değişkeni, içeceklere karşılık gelen adet bilgilerini tutar.
public Siparis() constructor'ı, sipariş oluşturulduğunda siparisDetay map'ini başlatır.
public void siparisEkle(Icecek icecek, int adet) metodu, siparişe içecek ve adet bilgilerini ekler.
public void siparisDetayiniGoster() metodu, sipariş detaylarını ekrana yazdırır.


 */