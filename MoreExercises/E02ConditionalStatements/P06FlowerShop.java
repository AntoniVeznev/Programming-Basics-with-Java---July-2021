package MoreExercises.E02ConditionalStatements;

import java.util.Scanner;

public class P06FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolia = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());
        double magnoliaPrice = 3.25 * magnolia;
        double hyacinthPrice = 4.0 * hyacinth;
        double rosePrice = 3.50 * rose;
        double cactusPrice = 8.0 * cactus;
        double sum = magnoliaPrice + hyacinthPrice + rosePrice + cactusPrice;
        double win = sum * 0.95;
        double taxes = sum - win;
        double diff = Math.abs(priceGift - win);
        double floor = Math.floor(diff);
        double ceil = Math.ceil(diff);
        if (priceGift <= win) {
            System.out.printf("She is left with %.0f leva.", floor);
        } else {
            System.out.printf("She will have to borrow %.0f leva.", ceil);
        }
    }
}
