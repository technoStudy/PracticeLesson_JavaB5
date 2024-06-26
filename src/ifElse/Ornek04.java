package ifElse;

import java.util.Scanner;

public class Ornek04 {
    public static void main(String[] args) {

        // Soru: Bir kişinin cinsiyetini belirleyen bir Java programı yazın.
        // Program, kullanıcıdan “E” veya “K” harflerinden birini girmesini istemeli
        // ve ekrana “Erkek” veya “Kadın” mesajını yazdırmalıdır.

        Scanner input = new Scanner(System.in); // Scanner nesnesi oluşturun

        System.out.print("Cinsiyetinizi giriniz (E/K): "); // Kullanıcıdan cinsiyetini isteyin
        char cinsiyet = input.next().toLowerCase().charAt(0); // Kullanıcının girdiği ilk karakteri alın

        if (cinsiyet == 'e') { // Eğer karakter E veya e ise
            System.out.println("Erkek"); // Erkek mesajını yazdırın
        } else if (cinsiyet == 'k') { // Eğer karakter K veya k ise
            System.out.println("Kadın"); // Kadın mesajını yazdırın
        } else { // Eğer başka bir karakter ise
            System.out.println("Geçersiz giriş"); // Geçersiz giriş mesajını yazdırın
        }

        input.close(); // Scanner nesnesini kapatın
    }
}
