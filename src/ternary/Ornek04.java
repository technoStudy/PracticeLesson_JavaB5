package practiseLessons.ternary;

import java.util.Scanner;

public class Ornek04 {
    public static void main(String[] args) {

        // Soru: Bir kişinin cinsiyetini belirleyen bir Java programı yazın.
        // Program, kullanıcıdan “E” veya “K” harflerinden birini girmesini istemeli
        // ve ekrana “Erkek” veya “Kadın” mesajını yazdırmalıdır.
        // Ternary operatörü kullanarak çözün.

        Scanner input = new Scanner(System.in); // Scanner nesnesi oluşturun
        System.out.print("Cinsiyetinizi giriniz (E/K): "); // Kullanıcıdan cinsiyetini isteyin
        char cinsiyet = input.next().toLowerCase().charAt(0); // Kullanıcının girdiği ilk karakteri alın
        String mesaj = (cinsiyet == 'e') ? "Erkek" : (cinsiyet == 'k') ? "Kadın" : "Geçersiz giriş"; // Ternary operatörü ile mesajı belirle
        System.out.println(mesaj); // Mesajı ekrana yazdır
        input.close(); // Scanner nesnesini kapatın
    }
}


