package practiseLessons.javaSwitch;

import java.util.Scanner;

public class Ornek01 {
    public static void main(String[] args) {

        /**
         Soru:
         Kullanıcıdan bir ayın numarasını (1-12 arası) alan
         ve bu numaraya karşılık gelen ayın adını yazdıran
         bir Java programı yazın.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Bir ay numarası girin (1-12): ");
        int ay = input.nextInt();
        input.close();

        String ayAdi;

        switch (ay) {
            case 1:
                ayAdi = "Ocak";
                break;
            case 2:
                ayAdi = "Şubat";
                break;
            case 3:
                ayAdi = "Mart";
                break;
            case 4:
                ayAdi = "Nisan";
                break;
            case 5:
                ayAdi = "Mayıs";
                break;
            case 6:
                ayAdi = "Haziran";
                break;
            case 7:
                ayAdi = "Temmuz";
                break;
            case 8:
                ayAdi = "Ağustos";
                break;
            case 9:
                ayAdi = "Eylül";
                break;
            case 10:
                ayAdi = "Ekim";
                break;
            case 11:
                ayAdi = "Kasım";
                break;
            case 12:
                ayAdi = "Aralık";
                break;
            default:
                ayAdi = "Geçersiz ay numarası";
                break;
        }

        System.out.println("Girilen ay numarasına karşılık gelen ay: " + ayAdi);
    }
}
