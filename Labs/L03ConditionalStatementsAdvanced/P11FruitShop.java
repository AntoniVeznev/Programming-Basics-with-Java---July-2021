package Labs.L03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double fruitPrice = 0;
        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    fruitPrice = quantity * 2.50;
                    System.out.printf("%.2f", fruitPrice);
                } else if (fruit.equals("apple")) {
                    fruitPrice = quantity * 1.20;
                    System.out.printf("%.2f", fruitPrice);
                } else if (fruit.equals("orange")) {
                    fruitPrice = quantity * 0.85;
                    System.out.printf("%.2f", fruitPrice);
                } else if (fruit.equals("grapefruit")) {
                    fruitPrice = quantity * 1.45;
                    System.out.printf("%.2f", fruitPrice);
                } else if (fruit.equals("kiwi")) {
                    fruitPrice = quantity * 2.70;
                    System.out.printf("%.2f", fruitPrice);
                } else if (fruit.equals("pineapple")) {
                    fruitPrice = quantity * 5.50;
                    System.out.printf("%.2f", fruitPrice);
                } else if (fruit.equals("grapes")) {
                    fruitPrice = quantity * 3.85;
                    System.out.printf("%.2f", fruitPrice);
                } else {
                    System.out.println("error");
                }
                break;

            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    fruitPrice = quantity * 2.70;
                    System.out.printf("%.2f", fruitPrice);
                } else if (fruit.equals("apple")) {
                    fruitPrice = quantity * 1.25;
                    System.out.printf("%.2f", fruitPrice);
                } else if (fruit.equals("orange")) {
                    fruitPrice = quantity * 0.90;
                    System.out.printf("%.2f", fruitPrice);
                } else if (fruit.equals("grapefruit")) {
                    fruitPrice = quantity * 1.60;
                    System.out.printf("%.2f", fruitPrice);
                } else if (fruit.equals("kiwi")) {
                    fruitPrice = quantity * 3.00;
                    System.out.printf("%.2f", fruitPrice);
                } else if (fruit.equals("pineapple")) {
                    fruitPrice = quantity * 5.60;
                    System.out.printf("%.2f", fruitPrice);
                } else if (fruit.equals("grapes")) {
                    fruitPrice = quantity * 4.20;
                    System.out.printf("%.2f", fruitPrice);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
    }
}
