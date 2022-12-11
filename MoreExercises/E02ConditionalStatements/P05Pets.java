package MoreExercises.E02ConditionalStatements;

import java.util.Scanner;

public class P05Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());
        double dog = days * dogFood;
        double cat = days * catFood;
        double turtle = (days * turtleFood) / 1000;
        double totalFood = dog + cat + turtle;
        double result = Math.abs(totalFood - food);
        double floor = Math.floor(result);
        double ceil = Math.ceil(result);
        if (totalFood <= food) {
            System.out.printf("%.0f kilos of food left.", floor);
        } else {
            System.out.printf("%.0f more kilos of food are needed.", ceil);
        }
    }
}
