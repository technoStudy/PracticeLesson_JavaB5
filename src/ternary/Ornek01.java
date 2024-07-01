package ternary;

import java.util.Scanner;

public class Ornek01 {
    public static void main(String[] args) {

        //  Kullanıcının girdiği yaşa göre "Ehliyet alabilirsiniz" veya
        // "Ehliyet alamazsınız" mesajı veren bir Java programı yazın. Ehliyet yaşı 18'dir.
        // Ternary operatör kullanarak gerekli kontrolü yapınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        input.close();

        String durum = (yas >= 18) ? "Ehliyet alabilirsiniz" : "Ehliyet alamazsınız";
        System.out.println(durum);
    }
}
