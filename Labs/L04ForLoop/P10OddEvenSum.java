package Labs.L04ForLoop;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < number; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven = currentNumber + sumEven;
            } else {
                sumOdd = currentNumber + sumOdd;
            }
        }
        if (sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEven);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sumEven - sumOdd));
        }
    }
}
