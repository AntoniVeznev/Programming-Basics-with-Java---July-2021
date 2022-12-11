package Labs.L06NestedLoops;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int allCounter = 0;
        int counter = 0;
        for (int first = begin; first <= end; first++) {
            for (int second = begin; second <= end; second++) {
                allCounter++;
                if (first + second == magicNumber) {
                    counter++;
                    if (counter == 1) {
                        System.out.printf("Combination N:%d (%d + %d = %d)\n", allCounter, first, second, magicNumber);
                    }
                }
            }
        }
        if (counter == 0) {
            System.out.printf("%d combinations - neither equals %d", allCounter, magicNumber);
        }
    }
}
