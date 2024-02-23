package practiseLessons.javaReviewPractices._17_ProgramToFindTheSumOfOddNumbers;

import java.util.Scanner;

public class ProgramToFindTheSumOfOddNumbers {
    public static void main(String[] args) {

        int number, total = 0;

        Scanner input = new Scanner(System.in);

        do {

            System.out.print("Enter a number : ");
            number = input.nextInt();

            if (number % 4 == 0 && number != 0) {
                System.out.println(number);
                total += number;
            }

        } while (number % 2 != 1);

        System.out.println("Total = " + total);
    }
}
