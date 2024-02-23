package practiseLessons.whileDoWhileBreak;

import java.util.Scanner;

public class Ornek05 {
    public static void main(String[] args) {

// Soru Kullanıcın gireceği bir sayının kaç basamak olduğunu bulunuz

        //163460  6 basamaklı 1 2 3 4 5 6 7 8 9 0 1 2 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int sayiGir = scanner.nextInt();

        int sayac = 0;

        while (sayiGir > 0) {

            sayiGir = sayiGir / 10;

            sayac++;
        }
        System.out.println("Basamak sayısı : " + sayac);
    }
}
