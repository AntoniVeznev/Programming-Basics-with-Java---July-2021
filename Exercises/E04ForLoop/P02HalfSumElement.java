package Exercises.E04ForLoop;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum > maxNumber) {
                maxNumber = currentNum;
            }
            sum = sum + currentNum;
        }
        sum = sum - maxNumber;
        if (maxNumber == sum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumber);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxNumber - sum));
        }
    }
}
