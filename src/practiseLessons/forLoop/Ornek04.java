package practiseLessons.forLoop;

import java.util.Scanner;

public class Ornek04 {
    public static void main(String[] args) {

        // Girilen metni tersten yazdıran bir Java programı yazınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin giriniz : ");
        String metin = scanner.nextLine();

        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i);
        }

        System.out.println("Metnin ters çevirilmiş hali: " + tersMetin);

    }
}
