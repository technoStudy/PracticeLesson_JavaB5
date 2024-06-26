package ifElse;

import java.util.Scanner;

public class Ornek01 {
    public static void main(String[] args) {

        //  Kullanıcının girdiği yaşa göre "Ehliyet alabilirsiniz" veya
        // "Ehliyet alamazsınız" mesajı veren bir Java programı yazın.
        //  Ehliyet yaşı 18'dir.

        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        input.close();

        if (yas >= 18) {
            System.out.println("Ehliyet alabilirsiniz.");
        } else {
            System.out.println("Ehliyet alamazsınız.");
        }
    }
}
