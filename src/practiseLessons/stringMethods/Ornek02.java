package practiseLessons.stringMethods;

import java.util.Scanner;

public class Ornek02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //length(): String'in uzunluğunu döndürür.(int)
        String str = "Merhaba";
        int strUzunluk = str.length(); // uzunluk 7
        System.out.println("strUzunluk = " + strUzunluk);

        //charAt(int index): Belirli bir dizindeki karakteri döndürür.
        char karakter = str.charAt(0); // M karakteri, "index bilgisayar alt yapısında her zaman 0'dan başlar"
        System.out.println("karakter = " + karakter);

        //Soru:
        //Girilen bir cümlenin 10. indexindeki karakteri yazdıran programı kodlayınız.
        // 12345678901
//        System.out.print("En az 10 harfli kelime girmelisiniz : ");
//        String charCumle=scanner.nextLine();
//        char onuncuIndex=charCumle.charAt(10);
//        System.out.println("onuncuIndex = " + onuncuIndex);

        //substring(int başlangıçIndex): Belirli bir dizinden sona kadar olan alt dizesini döndürür.
        String altDize1 = str.substring(3);
        System.out.println("altDize1 = " + altDize1);

//        //Soru:
//        //Girilen cümlenin sondan 2 karakteri yazdıran programı kodlayınız.
//        System.out.print("Bir cümle giriniz : ");
//        String substringCumle = scanner.nextLine();
//        String sonIkiKarakter = substringCumle.substring(substringCumle.length()-2);
//        System.out.println("sonIkiKarakter = " + sonIkiKarakter);



        //substring(int başlangıçIndex, int bitişIndex): Belirli bir aralıktaki alt dizesini döndürür.
        String altdize2 = str.substring(0,3);
        System.out.println("altdize2 = " + altdize2);

        System.out.print("Bir cümle giriniz : ");
        String substringCumle2 = scanner.nextLine();
        String substringAralik = substringCumle2.substring(1,substringCumle2.length()-4);
        System.out.println("substringAralik = " + substringAralik);






















    }

}
