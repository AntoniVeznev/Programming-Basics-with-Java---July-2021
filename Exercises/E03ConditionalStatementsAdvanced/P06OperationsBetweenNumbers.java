package Exercises.E03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        double result = 0;
        String evenOdd = "";

        switch (symbol) {
            case "+":
                result = n1 + n2;
                if (result % 2 == 0) {
                    evenOdd = "even";
                    System.out.printf("%d %s %d = %.0f - %s", n1, symbol, n2, result, evenOdd);
                } else {
                    evenOdd = "odd";
                    System.out.printf("%d %s %d = %.0f - %s", n1, symbol, n2, result, evenOdd);
                }
                break;
            case "-":
                result = n1 - n2;
                if (result % 2 == 0) {
                    evenOdd = "even";
                    System.out.printf("%d %s %d = %.0f - %s", n1, symbol, n2, result, evenOdd);
                } else {
                    evenOdd = "odd";
                    System.out.printf("%d %s %d = %.0f - %s", n1, symbol, n2, result, evenOdd);
                }
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    evenOdd = "even";
                    System.out.printf("%d %s %d = %.0f - %s", n1, symbol, n2, result, evenOdd);
                } else {
                    evenOdd = "odd";
                    System.out.printf("%d %s %d = %.0f - %s", n1, symbol, n2, result, evenOdd);
                }
                break;
            case "/":
                result = 1.0 * n1 / n2;
                if (n2 != 0) {
                    System.out.printf("%d %s %d = %.2f", n1, symbol, n2, result);
                } else if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                }
                break;
            case "%":
                result = Math.abs(1.0 * n1 % n2);
                if (n2 != 0) {
                    System.out.printf("%d %s %d = %.0f", n1, symbol, n2, result);
                } else if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                }
                break;
        }
    }
}