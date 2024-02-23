package practiseLessons.whileDoWhileBreak;

import java.util.Scanner;

public class Ornek02 {
    public static void main(String[] args) {

//        Kullanıcıdan "quit" kelimesi girilene kadar kullanıcıdan metin girişi alan ve girilen metinleri
//        ekrana yazdıran bir Java programı yazın.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Metin Giriniz : ");
        String giris = scanner.nextLine();
        while (!giris.equalsIgnoreCase("quit")) { //true

            if (!giris.equalsIgnoreCase("quit")) {
                System.out.println("Girilen metin : " + giris);
            }
            System.out.print("Metin girin (çıkmak için 'quit' yazın) : ");
            giris = scanner.nextLine();

        }
        System.out.println("Program sonlandırıldı.");
    }
}
