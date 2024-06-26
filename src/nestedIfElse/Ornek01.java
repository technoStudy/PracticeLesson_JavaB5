package nestedIfElse;

import java.util.Scanner;

public class Ornek01 {
    public static void main(String[] args) {

        /**
         1)- Java programlama dilinde, kullanıcı adı ve şifre isteyen bir program yazınız.
         2)- Eğer geçerli kullanıcı adı ve şifre girilir ise
             "Giriş işlemi başarıyla gerçekleşti." mesajını ekrana yazdırmalısınız.
         3)- Eğer kullanıcı adı doğru girilip şifre yanlış girilirse,
             kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sormalısınız.
         4)- Eğer kullanıcı şifresini sıfırlamak istemiyorsa "İyi günler dileriz."
             mesajını ekrana yazdırmalısınız.
         5)- Eğer kullanıcı şifresini sıfırlamak istiyorsa,
             yeni girdiği şifrenin hatalı girilen şifre veya
             unutulan şifreyle aynı olmaması gerektiğini kontrol etmelisiniz.
             Şifreler aynıysa "Şifre oluşturulamadı, lütfen başka bir şifre giriniz."
             mesajını ekrana yazdırmalısınız.
         6)- Eğer şifreler farklıysa "Şifre oluşturuldu." mesajını ekrana yazdırmalısınız.
         7)- Eğer kullanıcı adı yanlış girilirse "Bilgileriniz yanlış." mesajını ekrana yazdırmalısınız.

             Geçerli kullanıcı adı: Javacan
             Geçerli şifre        : java1001
         */

        String kullaniciAdi, sifre, yeniSifre;
        int secim;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        kullaniciAdi = input.nextLine();

        System.out.print("Şifreniz : ");
        sifre = input.nextLine();

        if (kullaniciAdi.equals("Javacan") && sifre.equals("java1001")) {
            System.out.println("Giriş işlemi başarıyla gerçekleştirildi.");
        } else if (kullaniciAdi.equals("Javacan")) {
            System.out.println("Yanlış şifre; kullanıcı şifrenizi sıfırlamak ister misiniz?");
            System.out.print("1-Evet \n2-Hayır\n");
            System.out.print("Seçiminiz : ");
            secim = input.nextInt();
            input.nextLine();

            if (secim == 1) {
                System.out.print("Yeni şifrenizi giriniz : ");
                yeniSifre = input.nextLine();
                if (yeniSifre.equals(sifre) || yeniSifre.equals("java1001")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }else {
                System.out.println("İyi günler dileriz.");
            }
        } else {
            System.out.println("Bilgileriniz yanlış.");
        }
    }
}
