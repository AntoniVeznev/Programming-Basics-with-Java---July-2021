package MoreExercises.E02ConditionalStatements;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double totalGrapes = x * y;
        double wine = (0.4 * totalGrapes) / 2.5;
        double litersLeft = Math.abs(wine - z);
        double winePerWorker = litersLeft / workers;
        double first = Math.floor(litersLeft);
        double second = Math.floor(wine);
        double third = Math.ceil(litersLeft);
        double forth = Math.ceil(winePerWorker);
        if (wine < z) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", first);
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", second);
            System.out.println();
            System.out.printf("%.0f liters left -> %.0f liters per person.", third, forth);
        }
    }
}
