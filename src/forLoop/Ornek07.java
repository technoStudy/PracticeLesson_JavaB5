package practiseLessons.forLoop;

import java.util.Scanner;

public class Ornek07 {

    public static void main(String[] args) {

        // Kullanıcıdan alınan metin içerisinde yer alan
        // sesli harflerin sayısını veren Java programını yazınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir metin giriniz: ");
        String metin = input.nextLine().toLowerCase();
        int sesliSayısı = 0; // sesli harf sayısını tutacak bir sayaç değişkeni tanımlıyoruz
        for (int i = 0; i < metin.length(); i++) { // metnin uzunluğu kadar döngü
            char harf = metin.charAt(i); // metnin i. karakterini alıyoruz
            if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü') { // eğer karakter bir sesli harf ise
                sesliSayısı++; // sayaç değişkenini bir artırıyoruz
            }
        }
        System.out.println("Girdiğiniz metindeki sesli harf sayısı: " + sesliSayısı); // sonucu ekrana yazdırıyoruz
    }
}
