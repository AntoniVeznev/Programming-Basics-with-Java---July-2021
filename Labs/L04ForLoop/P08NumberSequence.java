package Labs.L04ForLoop;

import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < number; i++) {
            int newNumber = Integer.parseInt(scanner.nextLine());
            if (newNumber > maxNumber) {
                maxNumber = newNumber;
            }
            if (newNumber < minNumber) {
                minNumber = newNumber;
            }

        }
        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
