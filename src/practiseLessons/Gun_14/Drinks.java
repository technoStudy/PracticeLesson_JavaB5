package practiseLessons.Gun_14;

public enum Drinks {
    COLA("Coca-Cola"), SU("Su"), lemonade("Limonata"), ICE_TEA("Ice Tea"), FRUIT_JUICE("Meyve Suyu");

    private String ad; // İçecek adı

    private Drinks(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }
}
// enum class farki
/*
COLA, SU, LIMONATA, ICE_TEA, ve MEYVE_SUYU isimleri içeceklere ait öğelerdir.
private String ad içeceğin adını tutan bir özelliktir.
private Icecek(String ad) constructor'ı, içeceğin adını ayarlamak için kullanılır.
public String getAd() metodu, içeceğin adını döndürmek için kullanılır.
 */
