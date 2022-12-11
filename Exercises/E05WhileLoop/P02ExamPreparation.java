package Exercises.E05WhileLoop;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unwantedGrades = Integer.parseInt(scanner.nextLine());
        String task = scanner.nextLine();
        int unwantedCounter = 0;
        double averageScore = 0;
        int numberOfProblems = 0;
        String lastTaskName = "";
        while (!task.equals("Enough")) {
            lastTaskName = task;
            int grade = Integer.parseInt(scanner.nextLine());
            averageScore = grade + averageScore;
            numberOfProblems++;
            if (grade <= 4) {
                unwantedCounter++;
            }
            if (unwantedCounter == unwantedGrades) {
                break;
            }
            task = scanner.nextLine();
        }
        if (task.equals("Enough")) {
            System.out.printf("Average score: %.2f \n" +
                    "Number of problems: %d \n" +
                    "Last problem: %s", (averageScore / numberOfProblems), numberOfProblems, lastTaskName);
        } else {
            System.out.printf("You need a break, %d poor grades.", unwantedCounter);
        }
    }
}
