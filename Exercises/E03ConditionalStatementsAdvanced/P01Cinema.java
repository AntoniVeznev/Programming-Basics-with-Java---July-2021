package Exercises.E03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int colons = Integer.parseInt(scanner.nextLine());
        int area = rows * colons;
        int pricePremiere = 12;
        double priceNormal = 7.50;
        int priceDiscount = 5;
        double sum = 0;
        switch (projection) {
            case "Premiere":
                sum = area * pricePremiere;
                System.out.printf("%.2f leva", sum);
                break;
            case "Normal":
                sum = area * priceNormal;
                System.out.printf("%.2f leva", sum);
                break;
            case "Discount":
                sum = area * priceDiscount;
                System.out.printf("%.2f leva", sum);
                break;
        }
    }
}
