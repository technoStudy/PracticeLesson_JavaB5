package javaClassMethod;

public class Hobi {
    String ad;
    int yas;
    String[] hobiler;

    void kisi(String ad, int yas, String[] hobiler){
        this.ad = ad;
        this.yas = yas;
        this.hobiler = hobiler;
    }

    void bilgiGoster () {
        System.out.println("Kişi Adı : "+ this.ad);
        System.out.println("Kişi Yaşı : "+ this.yas);
        System.out.print("Hobileri : ");
        for (String hobi: this.hobiler ){

        }
    }
}
