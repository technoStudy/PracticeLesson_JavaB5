package practiseLessons.ternary;

import java.util.Scanner;

public class Ornek02 {
    public static void main(String[] args) {

        // Bir kişinin yaşına göre sinema bileti fiyatını hesaplayan bir Java programı yazın.
        // Sinema bileti fiyatı 60 TL'dir. Ancak yaşa göre indirim uygulanmaktadır.
        // 18 yaşından küçükler için 12 TL, 18-60 yaş arası için 6 TL, 60 yaşından büyükler için 9 TL indirim vardır.
        // Ternary operatörü kullanarak çözün.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = input.nextInt();
        input.close();

        double indirim, fiyat;

        indirim = (yas < 18) ? 12 : (yas >= 18 && yas < 60) ? 6 : 9;
        fiyat = 60 - indirim;
        System.out.println("Sinema bileti fiyatınız: " + fiyat + " TL");
    }
}
