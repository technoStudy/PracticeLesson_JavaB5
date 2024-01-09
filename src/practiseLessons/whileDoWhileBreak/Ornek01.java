package practiseLessons.whileDoWhileBreak;

import java.util.Scanner;

public class Ornek01 {

    public static void main(String[] args) {

//Girilen bir stringin her kelimesini ayrı bir değişkene
//tanımlayıp kelimeleri ayrı ayrı yazdıran programı yazınız.
/*Örnek: Girdi => " Mehmet Ali Yılmaz "
Çıktı => Mehmet
         Ali
         Yılmaz */

        Scanner scanner = new Scanner(System.in);
        System.out.print("String giriniz : ");
        String cumle = scanner.nextLine();
        String trimCumle = cumle.trim();
        String kelime = "";
        int i = 0;
        while (i < trimCumle.length()){
            char karakter = trimCumle.charAt(i);
//            System.out.println("karakter = " + karakter);
            if (karakter !=' '){
                kelime += karakter; // m + e + r + h + a + b + a (merhaba)
            }
            else {
                System.out.println("kelime = " + kelime);
                kelime="";
            }
            i++;
        }

        System.out.println("kelime = " + kelime);
            }




}
