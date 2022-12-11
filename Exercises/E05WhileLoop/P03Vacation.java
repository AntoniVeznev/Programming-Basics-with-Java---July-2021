package Exercises.E05WhileLoop;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double moneyOnHand = Double.parseDouble(scanner.nextLine());
        int spendDays = 0;
        int allDays = 0;
        while (moneyOnHand < excursionPrice) {

            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            allDays++;

            if (action.equals("spend")) {
                spendDays++;
                moneyOnHand = moneyOnHand - sum;
                if (moneyOnHand < 0) {
                    moneyOnHand = 0;
                }

            } else if (action.equals("save")) {
                moneyOnHand = moneyOnHand + sum;
                spendDays = 0;

            }
            if (spendDays == 5) {
                break;
            }
        }

        if (moneyOnHand >= excursionPrice) {
            System.out.printf("You saved the money for %d days.", allDays);
        } else {
            System.out.printf("You can't save the money.%n" +
                    "%d", allDays);
        }

    }
}
