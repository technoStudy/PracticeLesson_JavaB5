package practiseLessons.forLoop;

import java.util.Scanner;

public class Ornek06 {
    public static void main(String[] args) {

        // Kullanıcıdan bir kelime alıp, aşağıdaki gibi yazdıran Java programı yazınız.
        // Girilen metin: "Kelime"

        // e
        // im
        // ime
        // lime
        // elime
        // Kelime

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir kelime girin: ");
        String kelime = input.nextLine();

        for (int i = kelime.length() - 1; i >= 0; i--) {
            System.out.println("// "+ kelime.substring(i));
        }
    }
}
