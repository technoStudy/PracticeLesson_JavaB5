package practiseLessons.javaReviewPractices._01_CalculatingGradeAverage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculatingGradeAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<String> lessons = new ArrayList<String>(Arrays.asList("Mathematics", "Physics", "Chemistry", "Turkish", "History", "Music"));

        int total = 0;

        for (String lesson : lessons) {
            System.out.print("Enter your " + lesson + " exam grade : ");
            int examGrade = input.nextInt();
            total += examGrade;
        }
        double averageGrade = (double) total / lessons.size();

        System.out.println("Average grade = " + averageGrade);
        System.out.println(averageGrade >= 60 ? "Passed the Class" : "Failed in Class");
    }
}
