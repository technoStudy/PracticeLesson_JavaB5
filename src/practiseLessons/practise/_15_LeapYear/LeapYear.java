package practiseLessons.practise._15_LeapYear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        int leapYear;
        boolean isLeapYear=false;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your year of birth : ");
        leapYear = input.nextInt();

        if (leapYear % 4 == 0) {
            if (leapYear % 100 == 0) {
                if (leapYear % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(leapYear + " is a leap year.");
        } else {
            System.out.println(leapYear + " is not a leap year.");
        }
    }
}





