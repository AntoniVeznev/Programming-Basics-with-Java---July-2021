package MoreExercises.E04ForLoop;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        double twoTree = 0;
        double treeFour = 0;
        double fourFive = 0;
        double fiveSix = 0;
        double percentOne = 0;
        double percentTwo = 0;
        double percentThree = 0;
        double percentFour = 0;
        double totalScore = 0;
        for (int i = 1; i <= students; i++) {
            double scoreStudent = Double.parseDouble(scanner.nextLine());
            totalScore += scoreStudent;
            if (scoreStudent >= 2.00 && scoreStudent <= 2.99) {
                twoTree++;
            } else if (scoreStudent >= 3.00 && scoreStudent <= 3.99) {
                treeFour++;
            } else if (scoreStudent >= 4.00 && scoreStudent <= 4.99) {
                fourFive++;
            } else if (scoreStudent >= 5.00) {
                fiveSix++;
            }
        }
        percentOne = (twoTree / students) * 100;
        percentTwo = (treeFour / students) * 100;
        percentThree = (fourFive / students) * 100;
        percentFour = (fiveSix / students) * 100;
        totalScore = totalScore / students;
        System.out.printf("Top students: %.2f%%\n", percentFour);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", percentThree);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", percentTwo);
        System.out.printf("Fail: %.2f%%\n", percentOne);
        System.out.printf("Average: %.2f\n", totalScore);
    }
}
