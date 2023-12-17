package practiseLessons.ifElse;

import java.util.Scanner;

public class Ornek03 {
    public static void main(String[] args) {

        // Bir kişinin yaşına göre ona uygun bir selamlama mesajı ekrana yazdıran bir Java programı yazın.
        // 18 yaşından küçükler için "Merhaba genç arkadaşım",
        // 18-65 yaş arası için "Merhaba saygıdeğer dostum",
        // 65 yaşından büyükler için "Merhaba kıymetli büyüğüm" mesajları verilsin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = input.nextInt();
        input.close();

        // if else ile çözüm
        String mesaj;
        if (yas < 18) {
            mesaj = "Merhaba genç arkadaşım";
        } else if (yas >= 18 && yas < 65) {
            mesaj = "Merhaba saygıdeğer dostum";
        } else {
            mesaj = "Merhaba kıymetli büyüğüm";
        }
        System.out.println(mesaj);
    }
}


