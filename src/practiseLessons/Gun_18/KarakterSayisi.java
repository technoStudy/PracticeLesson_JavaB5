package practiseLessons.Gun_18;// StringBulder kullanarak cumlede istenen harfin kac kere gectigini bulan bir uygulama yaziniz .
// Kelimeyi nekadar zamanda buluyor ekrana yizdirin .

import java.util.Scanner;

public class KarakterSayisi {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String text = scanner.nextLine();
        System.out.print("Aranacak karakteri giriniz : ");
        char character =scanner.nextLine().charAt(0);
        //1 saniye =1000 milisaniye, 1 dakika = 60000 milisaniye, 1 saniye = 1000000 mikrosaniye, 1 saniye = 1000000000 nanosaniye.
        long startTime=System.nanoTime();
        int countString =characterCountString(text,character);
        long endTime = System.nanoTime();
        long elapledTime =endTime-startTime;

        System.out.println("StringBuilder ile ekrana karakter yazimi: "+countString+ " Sure: "+elapledTime+" nano saniye.");
    }

    public static int characterCountString(String text ,char character){
        int count =0;
        for (int i =0;i<text.length();i++){
            if (text.charAt(i)==character){
                count++;
            }
        }
   return count;
    }

}
