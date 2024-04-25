package practiseLessons.whileDoWhileBreak;

import java.util.Scanner;

public class Ornek07 {
    public static void main(String[] args) {

// kullanıcının istediği genişlik ve uzunluktaki dikdörtgen oluşturan bir Java programı yazınız

        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        System.out.print("Bir karakter giriniz : ");
        String karakter = scannerStr.nextLine();
        System.out.print("Genişlik giriniz : ");
        int genislik = scannerInt.nextInt();
        System.out.print("Uzunluk giriniz giriniz : ");
        int uzunluk = scannerInt.nextInt();
        int satir = 1;
        while (satir <= uzunluk) {
            int sutun = 1;
            while (sutun <= genislik) {

                System.out.print(karakter); // 1111111
                sutun++;

            }
            System.out.println(); //1111111
            satir++;              //1111111
        }
    }
}
