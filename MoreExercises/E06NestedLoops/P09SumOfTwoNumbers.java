package MoreExercises.E06NestedLoops;

import java.util.Scanner;

public class P09SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counterAllCombinations = 0;
        int counter = 0;
        boolean isFound = false;
        boolean isNotFound = false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counterAllCombinations++;
                if (i + j == magicNumber) {
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)\n", counterAllCombinations, i, j, magicNumber);
                    break;
                } else {
                    counter++;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
