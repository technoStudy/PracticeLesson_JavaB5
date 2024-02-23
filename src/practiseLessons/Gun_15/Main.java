package practiseLessons.Gun_15;

import java.util.Scanner;

// Farkli sekillerin alanlarini hesaplayan bir program yaziniz.
// Gerekli parametreleri kullanicidan aliniz
// interface ve polimorfizim kullanin
// Dikdortgen ve daire icin alan hesaplayin
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Diktortkenin uzunlugunui girin :");
        double rectingleLengt = scanner.nextDouble();
        System.out.print(" Diktortkenin genisligini girin : ");
        double rectengleWidth = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(rectingleLengt, rectengleWidth);

        double rectengleArea = AreaCalculator.calculateArea(rectangle);

        System.out.println(" Diktortgeniun alani : " + rectengleArea);


        System.out.print("Daire Yaricapi :");
        double circleRedius = scanner.nextDouble();

        Circle circle = new Circle(circleRedius);


        double circleArea = AreaCalculator.calculateArea(circle);


        System.out.println("Dairenin alani :" + circleArea);

        scanner.close();
    }
}
// Kullanicidan kare veya daire icin bir alan bilgisi alip.
// Aldiginiz alan biligisiyle kenar uzunlugu ve yaricapi bulmaniz .
// Interface ve polimorfizm kullanin .