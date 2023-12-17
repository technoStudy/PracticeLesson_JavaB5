package practiseLessons.ternary;

import java.util.Scanner;

public class Ornek03 {
    public static void main(String[] args) {

        // Bir kişinin yaşına göre ona uygun bir selamlama mesajı ekrana yazdıran bir Java programı yazın.
        // 18 yaşından küçükler için "Merhaba genç arkadaşım",
        // 18-65 yaş arası için "Merhaba saygıdeğer dostum",
        // 65 yaşından büyükler için "Merhaba kıymetli büyüğüm" mesajları verilsin.
        // Ternary operatörü kullanarak çözün.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = input.nextInt();
        input.close();

        // ternary operatörü ile çözüm
        String mesaj = (yas < 18) ? "Merhaba genç arkadaşım" : (yas >= 18 && yas < 65) ? "Merhaba saygıdeğer dostum" : "Merhaba kıymetli büyüğüm";
        System.out.println(mesaj);
    }
}
