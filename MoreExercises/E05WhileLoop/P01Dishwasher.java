package MoreExercises.E05WhileLoop;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottles = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double totalQuantity = bottles * 750;
        double countWashes = 0;
        double totalPots = 0;
        double totalDishes = 0;
        while (!input.equals("End")) {
            int countDishes = Integer.parseInt(input);
            countWashes++;
            if (countWashes % 3 == 0) {
                totalPots += countDishes;
                totalQuantity = totalQuantity - (countDishes * 15);
            } else {
                totalDishes += countDishes;
                totalQuantity = totalQuantity - (countDishes * 5);
            }
            if (totalQuantity < 0) {
                break;
            }
            input = scanner.nextLine();
        }
        if (totalQuantity >= 0) {
            System.out.printf("Detergent was enough!\n" +
                    "%.0f dishes and %.0f pots were washed.\n" +
                    "Leftover detergent %.0f ml.", totalDishes, totalPots, totalQuantity);
        } else if (totalQuantity < 0) {
            System.out.printf("Not enough detergent, %.0f ml. more necessary!", Math.abs(totalQuantity));
        }
    }
}
