package practiseLessons.javaReviewPractices._06_GreeengrocerCashier;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class GreengrocerCashier {
    public static void main(String[] args) {

        float totalAmount = 0f, kilogram = 0f;

        Scanner input = new Scanner(System.in);

        Map<String, Float> fruits = new LinkedHashMap<>();
        fruits.put("Pears", 2.14f);
        fruits.put("Apples", 3.67f);
        fruits.put("Tomatoes", 1.11f);
        fruits.put("Bananas", 0.95f);
        fruits.put("Eggplanties", 5.00f);

        for (Map.Entry<String, Float> fruit : fruits.entrySet()) {
            System.out.print("How many kilos of " + fruit.getKey() + "? : ");
            kilogram = input.nextFloat();
            totalAmount += kilogram * fruit.getValue();
            System.out.printf("Subtotal = %.2f TL%n", totalAmount);
        }
        System.out.printf("%nTotal Amount = %.2f TL%n", totalAmount);
    }
}