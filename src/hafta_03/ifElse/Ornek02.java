package hafta_03.ifElse;

import java.util.Scanner;

public class Ornek02 {
    public static void main(String[] args) {

        // Bir kişinin yaşına göre sinema bileti fiyatını hesaplayan bir Java programı yazın.
        // Sinema bileti fiyatı 60 TL'dir. Ancak yaşa göre indirim uygulanmaktadır.
        // 18 yaşından küçükler için 12 TL, 18-60 yaş arası için 6 TL,
        // 60 yaşından büyükler için 9 TL indirim vardır.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = input.nextInt();
        input.close();

        // if else ile çözüm
        double indirim, fiyat;

        if (yas < 18) {
            indirim = 12; // 12 TL indirim
        } else if (yas >= 18 && yas < 60) {
            indirim = 6; // 6 TL indirim
        } else {
            indirim = 9; // 9 TL indirim
        }
        fiyat = 60 - indirim; // indirimli fiyatı hesaplayalım
        System.out.println("Sinema bileti fiyatınız: " + fiyat + " TL");
    }
}
