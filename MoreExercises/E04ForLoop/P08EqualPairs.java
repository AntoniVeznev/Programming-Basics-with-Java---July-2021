package MoreExercises.E04ForLoop;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int lastSum = 0;
        int currentSum = 0;
        int diff = 0;
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 1; i <= number; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            currentSum = num1 + num2;
            if (i == 1) {
                lastSum = currentSum;
            } else {
                diff = Math.abs(currentSum - lastSum);
                if (diff > maxDiff)
                    maxDiff = diff;
            }
            lastSum = currentSum;
        }
        if (diff == 0) {
            System.out.printf("Yes, value=%d", lastSum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
