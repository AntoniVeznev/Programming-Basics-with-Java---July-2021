package MoreExercises.E06NestedLoops;

import java.util.Scanner;

public class P11HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysCount = Integer.parseInt(scanner.nextLine());
        int hoursCount = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int i = 1; i <= daysCount; i++) {
            double sumPerDay = 0;
            for (int j = 1; j <= hoursCount; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    sum += 2.50;
                    sumPerDay += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    sum += 1.25;
                    sumPerDay += 1.25;
                } else {
                    sum += 1;
                    sumPerDay += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva\n", i, sumPerDay);
        }
        System.out.printf("Total: %.2f leva", sum);
    }
}
