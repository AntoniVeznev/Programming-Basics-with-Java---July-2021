package Exercises.E05WhileLoop;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int goal = 10000;
        int totalSum = 0;
        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            totalSum = totalSum + steps;
            if (totalSum >= goal) {
                System.out.printf("Goal reached! Good job!\n" +
                        "%d steps over the goal!", Math.abs(goal - totalSum));
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Going home")) {
            input = scanner.nextLine();
            int stepsToHome = Integer.parseInt(input);
            totalSum = totalSum + stepsToHome;
            if (totalSum >= goal) {
                System.out.printf("Goal reached! Good job!\n" +
                        "%d steps over the goal!", Math.abs(goal - totalSum));
            } else {
                System.out.printf("%d more steps to reach goal.", Math.abs(goal - totalSum));
            }
        }
    }
}
