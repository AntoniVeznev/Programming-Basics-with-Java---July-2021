package Exercises.E06NestedLoops;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        for (int i = number1; i <= number2; i++) {
            int number = i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 6; j > 0; j--) {
                int digit = number % 10;
                number = number / 10;
                if (j % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }


            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }

        }
    }
}
