package practiseLessons.stringBufferAndStringBuilder;

import java.util.Scanner;


// StringBulder kullanarak cumlede istenen harfin kac kere gectigini bulan bir uygulama yaziniz . Kelimeyi nekadar zamanda buluyor ekrana yizdirin .
public class Main {
    public static void main(String[] args) {
        String str = "Merhaba,";// bir yer 1234
        str += "Dunya";
        System.out.println("String ile birlestirme: " + str);//1235

        // StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Merhab,");
        stringBuffer.append("Dunya");
        System.out.println("StringBuffer ile birlestirme: " + stringBuffer);

        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Merhab,");
        stringBuilder.append("Dunya");
        System.out.println("StringBuilder ile birlestirme: " + stringBuilder);

        System.out.println();
        System.out.println();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin Giriniz ");
        String input = scanner.nextLine();

        StringBuilder reverseInput = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reverseInput.append(input.charAt(i));
        }
        System.out.println("Orjinal metin : " + input);
        System.out.println("Ters metin : " + reverseInput);
        scanner.close();
    }
}
