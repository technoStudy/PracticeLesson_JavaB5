package hafta_03.javaSwitch;

import java.util.Scanner;

public class Ornek03 {
    public static void main(String[] args) {
        /**
         Soru:
         Kullanıcıdan bir harf alan ve bu harfin Türk alfabesine göre
         bir sesli harf mi yoksa sessiz harf mi olduğunu belirten
         bir Java programı yazın.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Bir harf girin: ");
        char harf = input.next().toLowerCase().charAt(0);
        input.close();

        String harfTuru;

        switch (harf) {
            case 'a':
            case 'e':
            case 'ı':
            case 'i':
            case 'o':
            case 'ö':
            case 'u':
            case 'ü':
                harfTuru = "sesli harf";
                break;
            default:
                harfTuru = "sessiz harf";
                break;
        }

        System.out.println(harf + " bir " + harfTuru + "tir.");
    }
}
