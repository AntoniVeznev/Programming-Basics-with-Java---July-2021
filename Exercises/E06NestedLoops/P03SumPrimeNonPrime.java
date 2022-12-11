package Exercises.E06NestedLoops;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int primeNumbers = 0;
        int nonPrimeNumbers = 0;

        while (!input.equals("stop")) {

            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.print("Number is negative.\n");
                input = scanner.nextLine();
                continue;
            }
            boolean isPrime = true;

            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers += number;
            } else {
                nonPrimeNumbers += number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", primeNumbers);

        System.out.printf("Sum of all non prime numbers is: %d\n", nonPrimeNumbers);
    }
}
