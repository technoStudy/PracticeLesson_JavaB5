package typeConversions;

public class Ornek01 {

    public static void main(String[] args) {

        /*Soru :
        Aşağıdaki değişkenler tanımlanmıştır:
        int sayi = 42;
        double ondalikSayi = 3.14;
        Bu değişkenleri kullanarak aşağıdaki işlemleri gerçekleştirin:
        1-	sayi değişkenini double türüne dönüştürün ve sonucu doubleSayi adlı bir değişkende saklayın.
        2-	ondalikSayi değişkenini int türüne dönüştürün ve sonucu tamSayi adlı bir değişkende saklayın.
        3-	sayi ve ondalikSayi değişkenlerini toplayın ve sonucu toplam adlı bir değişkende saklayın.
        4-	toplam değişkenini bir tamsayıya dönüştürün ve sonucu ekrana yazdırın.
        */

        int sayi = 42;
        double ondalikSayi = 3.14;
        // 1. sayi'yi double türüne dönüştürme
        double doubleSayi = sayi;
        // 2. ondalikSayi'yi int türüne dönüştürme
        int tamSayi = (int) ondalikSayi;
        // 3. sayi ve ondalikSayi'yi toplama
        double toplam = sayi + ondalikSayi;
        System.out.println("toplam = " + toplam);
        // 4. toplam'ı tamsayıya dönüştürme ve ekrana yazdırma
        int toplamSayi = (int) toplam;
        System.out.println("toplamSayi = " + toplamSayi);


        /*
        Soru 2:
        Bir yarış oyunu geliştiriyorsunuz alınan bir süre (örneğin, "1.5” dakika) ve bir hız (örneğin, "60” km/saat)
        bilgisini içeren String türündeki verilerle çalışmanız gerekiyor. Bu bilgileri uygun veri tiplerine dönüştürerek
        toplam mesafeyi hesaplayan bir program yazın. (Mesafe = Zaman x Hız formülü)

         */

        String dakika = "1.5";
        String hiz = "60";
        double sayisure = Double.parseDouble(dakika);
        double sayihiz = Double.parseDouble(hiz);
        double mesafe = sayihiz / sayisure;
        System.out.println("mesafe = " + mesafe);

        /*
        Soru 4:
        Başlangıçta bir kesir var: 3/5 Bu kesiri, önce String türündeki pay ve paydas değerleri olarak alın,
        sonra bu değerleri int türüne dönüştürün ve son olarak double türüne dönüştürün her
        adımda elde ettiğiniz değerleri ekrana yazdırın.

         */
        String pay = "3";
        String payda = "5";
        int iPay = Integer.parseInt(pay);
        int iPayda = Integer.parseInt(payda);
        double dSonuc = iPay / (double) iPayda;
        System.out.println("dSonuc = " + dSonuc);
    }
}