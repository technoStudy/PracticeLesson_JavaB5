package nestedIfElse;

import java.util.Scanner;

public class Ornek02 {
    public static void main(String[] args) {

        // Girilen 3 sayıyı "küçükten büyüğe" doğru
        // sıralayan programı Java ile yazınız.

        int sayi1, sayi2, sayi3;

        Scanner input = new Scanner(System.in);
        System.out.println("Üç farklı sayı girin:");
        System.out.print("Birinci Sayı (sayi1) : ");
        sayi1 = input.nextInt();

        System.out.print("İkinci Sayı (sayi2) : ");
        sayi2 = input.nextInt();

        System.out.print("Üçüncü Sayı (sayi3) : ");
        sayi3 = input.nextInt();

        if ((sayi1 == sayi2) || (sayi1 == sayi3) || (sayi2 == sayi3)) {
            System.out.println("Yanlış giriş yaptınız. Lütfen farklı sayılar girin.");
        } else {
            if ((sayi1 < sayi2) && (sayi1 < sayi3)) {
                if (sayi2 < sayi3) {
                    System.out.println("sayi1 < sayi2 < sayi3");
                } else {
                    System.out.println("sayi1 < sayi3 < sayi2");
                }
            } else if ((sayi2 < sayi1) && (sayi2 < sayi3)) {
                if (sayi1 < sayi3) {
                    System.out.println("sayi2 < sayi1 < sayi3");
                } else {
                    System.out.println("sayi2 < sayi3 < sayi1");
                }
            } else {
                if (sayi1 < sayi2) {
                    System.out.println("sayi3 < sayi1 < sayi2");
                } else {
                    System.out.println("sayi3 < sayi2 < sayi1");
                }
            }
        }
    }
}
