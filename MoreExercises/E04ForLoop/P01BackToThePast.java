package MoreExercises.E04ForLoop;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        int yearsGet = 18;
        double totalSum = money;

        for (int i = 1800; i <= year; i++) {

            if (i % 2 == 0) {
                totalSum = totalSum - 12000;
                yearsGet++;
            } else {
                totalSum = totalSum - (12000 + (yearsGet * 50));
                yearsGet++;
            }
        }
        if (totalSum >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", totalSum);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(totalSum));
        }
    }
}
