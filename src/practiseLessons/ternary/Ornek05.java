package practiseLessons.ternary;

import java.util.Scanner;

public class Ornek05 {
    public static void main(String[] args) {

        // Kullanıcıdan bir harf girişi alarak, bu harfin
        // sesli veya sessiz harf olduğunu belirleyen bir program yazın.
        // Ternary operatörü kullanarak çözün.


        Scanner input = new Scanner(System.in);

        System.out.print("Bir harf girin: ");
        char harf = input.next().toLowerCase().charAt(0);
        input.close();

        String sonuc = (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü') ? "sesli" : "sessiz";
        System.out.println("Girilen harf bir " + sonuc + " harf.");
    }
}
