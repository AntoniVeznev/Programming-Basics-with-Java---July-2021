package Exercises.E06NestedLoops;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int judgesCount = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double sum = 0;
        double totalSum = 0;
        int gradesCounter = 0;

        while (!presentation.equals("Finish")) {
            for (int i = 1; i <= judgesCount; i++) {
                double grades = Double.parseDouble(scanner.nextLine());
                sum += grades;
                totalSum += grades;
                gradesCounter++;
            }
            System.out.printf("%s - %.2f.\n", presentation, sum / judgesCount);
            sum = 0;
            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalSum / gradesCounter);
    }
}
