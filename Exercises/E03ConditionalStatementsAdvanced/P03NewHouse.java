package Exercises.E03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        switch (flowers) {
            case "Roses":
                if (countFlowers > 80) {
                    totalSum = countFlowers * 5 * 0.9;
                } else {
                    totalSum = countFlowers * 5;
                }
                break;
            case "Dahlias":
                if (countFlowers > 90) {
                    totalSum = countFlowers * 3.80 * 0.85;
                } else {
                    totalSum = countFlowers * 3.80;
                }
                break;
            case "Tulips":
                if (countFlowers > 80) {
                    totalSum = countFlowers * 2.80 * 0.85;
                } else {
                    totalSum = countFlowers * 2.80;
                }
                break;
            case "Narcissus":
                if (countFlowers < 120) {
                    totalSum = countFlowers * 3 * 1.150;
                } else {
                    totalSum = countFlowers * 3;
                }
                break;
            case "Gladiolus":
                if (countFlowers < 80) {
                    totalSum = countFlowers * 2.50 * 1.200;
                } else {
                    totalSum = countFlowers * 2.50;
                }
                break;
        }
        if (budget >= totalSum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    countFlowers, flowers, budget - totalSum);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",
                    totalSum - budget);
        }
    }
}
