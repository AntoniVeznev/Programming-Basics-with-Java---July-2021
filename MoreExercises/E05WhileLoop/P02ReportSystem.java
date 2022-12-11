package MoreExercises.E05WhileLoop;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSum = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int cash = 0;
        int totalCashSum = 0;
        int card = 0;
        int totalCardSum = 0;


        while (!command.equals("End")) {

            int priceOfProductsInCash = Integer.parseInt(command);
            if (priceOfProductsInCash > 100) {
                System.out.println("Error in transaction!");
            } else {
                cash++;
                totalCashSum += priceOfProductsInCash;

                System.out.println("Product sold!");
            }
            command = scanner.nextLine();
            int priceOfProductsWithCard = Integer.parseInt(command);
            if (priceOfProductsWithCard < 10) {
                System.out.println("Error in transaction!");
            } else {
                card++;
                totalCardSum += priceOfProductsWithCard;
                System.out.println("Product sold!");
            }

            if (totalCardSum + totalCashSum >= totalSum) {
                break;
            }

            command = scanner.nextLine();
        }

        if (command.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        }
        if (totalCardSum + totalCashSum >= totalSum) {

            System.out.printf("Average CS: %.2f\n", 1.0 * totalCashSum / cash);
            System.out.printf("Average CC: %.2f\n", 1.0 * totalCardSum / card);

        }
    }
}
