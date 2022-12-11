package MoreExercises.E06NestedLoops;

import java.util.Scanner;

public class P04CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            for (int j = firstNumber; j <= secondNumber; j++) {
                for (int k = firstNumber; k <= secondNumber; k++) {
                    for (int l = firstNumber; l <= secondNumber; l++) {
                        if (i % 2 == 0 && i > l && (j + k) % 2 == 0) {
                            if (l % 2 != 0) {
                                System.out.print(i);
                                System.out.print(j);
                                System.out.print(k);
                                System.out.print(l);
                                System.out.print(" ");
                            }

                        } else if (i % 2 != 0 && i > l && (j + k) % 2 == 0) {
                            if (l % 2 == 0) {
                                System.out.print(i);
                                System.out.print(j);
                                System.out.print(k);
                                System.out.print(l);
                                System.out.print(" ");
                            }
                        }
                    }
                }
            }
        }
    }
}
