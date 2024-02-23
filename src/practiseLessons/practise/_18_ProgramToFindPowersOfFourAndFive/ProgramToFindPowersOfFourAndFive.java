package practiseLessons.practise._18_ProgramToFindPowersOfFourAndFive;


import java.util.Scanner;

public class ProgramToFindPowersOfFourAndFive {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit number : ");
        number = input.nextInt();

        System.out.println("Powers of 4 : ");
        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Powers of 5 : ");
        for (int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }
    }
}
