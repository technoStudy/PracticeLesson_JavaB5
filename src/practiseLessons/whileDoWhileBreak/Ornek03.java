package practiseLessons.whileDoWhileBreak;

import java.util.Scanner;

public class Ornek03 {
    public static void main(String[] args) {

        //Kullanıcıdan bir sayı girmesini isteyen ve girilen sayının pozitif bir sayı olduğu sürece ekrana
        //"Merhaba!" yazan bir Java programı yazın. Kullanıcı negatif bir sayı girdiğinde programı sonlandıran Uygulamayı Yazınız.

        Scanner scanner = new Scanner(System.in);
        int sayi;
        do {
            System.out.println("Bir sayı girin (Negatif sayı girilince programdan çıkar): ");
            sayi = scanner.nextInt();
            if (sayi >= 0){
                System.out.println("Merhaba!");
            }
        }
        while (sayi >=0);

        System.out.println("Program sonlandırıldı.");


    }
}
