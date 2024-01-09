package practiseLessons.whileDoWhileBreak;

import java.util.Scanner;

public class Ornek04 {
    public static void main(String[] args) {

//Kullanıcıdan şifre oluşturmasını isteyiniz,şifreyi iki kez girerek doğrulama yapınız.
//Şifre aynı ise "TAMAM", değil ise "HATALI ŞİFRE TEKRAR DENEYİNİZ" yazdırın,
// sonra login olmasını isteyin şifre aynı ise "LOGİN BAŞARILI" değil ise "ŞİFRE HATALI" yazdırın,
// 3 kez yanlış girerse programı sonlandıran programı yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yeni şifrenizi oluşturunuz : ");
        String sifre = scanner.nextLine();
        int i = 1;
        while (true) {

            System.out.print("Şifrenizi tekrar girin : ");

            String sifre2 = scanner.nextLine();

            if (sifre.equals(sifre2)) { // true

                System.out.println("TAMAM");
                break;
            } else {
                System.out.println("HATALI ŞİFRE TEKRAR DENEYİNİZ");
                if (i == 3) {
                    break;
                }
                i++;
            }
        }


        int sayac = 0;
        while (sayac < 3){
            System.out.print("Login Password : ");
            String sifreLogin = scanner.nextLine();

            if (sifreLogin.equals(sifre)){
                System.out.println("LOGİN BAŞARILI");
                break;
            }
            else {
                System.out.println("ŞİFRE HATALI");
            }
            if (sayac==2){
                System.out.println("Üç kez yanlış giriş yapıldı. Program sonlandırılıyor.");
            }
            sayac++;
        }




    }
}
