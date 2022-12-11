package MoreExercises.E06NestedLoops;

import java.util.Scanner;

public class P07SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());
        int countSmallB = 0;
        int totalCount = 0;

        boolean letsBreakIt = false;

        boolean letsBreakItForTheSecondTime = false;

        for (int i = 35; i <= 55; i++) {
            for (int j = 64; j <= 96; j++) {
                for (int k = 1; k <= a; k++) {
                    if (letsBreakIt) {
                        break;
                    }
                    if (letsBreakItForTheSecondTime) {
                        break;
                    }
                    for (int l = 1; l <= b; l++) {
                        countSmallB++;
                        char A = (char) i;
                        char B = (char) j;
                        System.out.printf("%c%c%d%d%c%c|", A, B, k, l, B, A);
                        totalCount++;
                        if (totalCount == maxPasswords) {
                            letsBreakItForTheSecondTime = true;
                            break;
                        }
                        if (countSmallB > 0) {
                            i++;
                            j++;
                            if (i > 55) {
                                i = 35;
                            }
                            if (j > 96) {
                                j = 64;
                            }
                        }
                        if (a == k && b == l && totalCount < maxPasswords) {
                            letsBreakIt = true;
                            break;
                        }
                    }
                }
            }
            if (letsBreakIt) {
                break;
            }
            if (letsBreakItForTheSecondTime) {
                break;
            }
        }
    }
}
