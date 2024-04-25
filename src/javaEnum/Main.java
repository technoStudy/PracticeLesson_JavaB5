package javaEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Drinks selectedDrink = takeSelectDrink();

                Scanner scanner = new Scanner(System.in);
                System.out.print("Kaç adet? ");
                int pcs = scanner.nextInt();

                Order order = new Order();
                order.addOrder(selectedDrink, pcs); // pcs adet demek

                order.showOrderDetails();
            }

            private static Drinks takeSelectDrink() {
                System.out.println("İçecek Seçiniz:");
                for (Drinks drink : Drinks.values()) {
                    System.out.println(drink.ordinal() + 1 + ". " + drink.getAd());
                }
//icecek.ordinal() ifadesi, Java'daki enum sınıflarında bulunan bir metottur.
// Bu metod, ilgili enum sabitinin sırasal numarasını (ordinal değerini) döndürür.
// Sırasal numara, enum sabitlerinin tanımlandığı sırayla artan bir tamsayı değeridir.
                Scanner scanner = new Scanner(System.in);
                int selection;
                do {
                    System.out.print("Seçiminizi yapınız (1-" + Drinks.values().length + "): ");
                    selection = scanner.nextInt();
                } while (selection < 1 || selection > Drinks.values().length);

                return Drinks.values()[selection - 1];
            }
        }
/*
public static void main(String[] args) metodu, kullanıcının içecek ve adet bilgilerini alarak bir sipariş oluşturur ve sipariş detaylarını gösterir.
private static Icecek secilenIcecegiAl() metodu, kullanıcının içecek seçimini alır ve seçilen içeceği döndürür.
 */
