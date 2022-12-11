package MoreExercises.E06NestedLoops;

import java.util.Scanner;

public class P10Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coins1Count = Integer.parseInt(scanner.nextLine());
        int coins2Count = Integer.parseInt(scanner.nextLine());
        int banknote5Count = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= coins1Count; i++) {
            for (int j = 0; j <= coins2Count; j++) {
                for (int k = 0; k <= banknote5Count; k++) {
                    if (i * 1 + j * 2 + k * 5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", i, j, k, sum);
                    }
                }
            }
        }
    }
}
