package Labs.L06NestedLoops;

import java.util.Scanner;

public class P03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int counterAllCombinations = 0;
        for (int first = 0; first <= number; first++) {
            for (int second = 0; second <= number; second++) {
                for (int third = 0; third <= number; third++) {
                    if (first + second + third == number) {
                        counterAllCombinations++;
                    }
                }
            }
        }
        System.out.println(counterAllCombinations);
    }
}
