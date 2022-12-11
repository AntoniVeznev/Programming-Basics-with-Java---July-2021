package Exercises.E02ConditionalStatements;

import java.util.Scanner;

public class P04GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        if (statists > 150) {
            clothPrice *= 0.90;
        }
        double expenses = decor + statists * clothPrice;
        if (expenses > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", expenses - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - expenses);
        }
    }
}
