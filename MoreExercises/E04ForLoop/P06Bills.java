package MoreExercises.E04ForLoop;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = Integer.parseInt(scanner.nextLine());
        double water = 20.00;
        double internet = 15.00;
        double electricityTotalSum = 0;
        double waterTotalSum = water * month;
        double internetTotalSum = internet * month;
        double othersSum = 0;
        double averageValue = 0;
        for (int i = 1; i <= month; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            electricityTotalSum = electricityTotalSum + electricity;
            othersSum = othersSum + (electricity + water + internet) + (electricity + water + internet) * 0.20;
        }
        averageValue = (electricityTotalSum + waterTotalSum + internetTotalSum + othersSum) / month;
        System.out.printf("Electricity: %.2f lv\n", electricityTotalSum);
        System.out.printf("Water: %.2f lv\n", waterTotalSum);
        System.out.printf("Internet: %.2f lv\n", internetTotalSum);
        System.out.printf("Other: %.2f lv\n", othersSum);
        System.out.printf("Average: %.2f lv", averageValue);
    }
}
