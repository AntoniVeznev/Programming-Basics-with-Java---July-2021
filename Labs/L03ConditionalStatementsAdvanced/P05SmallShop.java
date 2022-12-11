package Labs.L03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                price = quantity * 0.50;
                System.out.println(price);
            } else if (product.equals("water")) {
                price = quantity * 0.80;
                System.out.println(price);
            } else if (product.equals("beer")) {
                price = quantity * 1.20;
                System.out.println(price);
            } else if (product.equals("sweets")) {
                price = quantity * 1.45;
                System.out.println(price);
            } else if (product.equals("peanuts")) {
                price = quantity * 1.60;
                System.out.println(price);
            }
        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                price = quantity * 0.40;
                System.out.println(price);
            } else if (product.equals("water")) {
                price = quantity * 0.70;
                System.out.println(price);
            } else if (product.equals("beer")) {
                price = quantity * 1.15;
                System.out.println(price);
            } else if (product.equals("sweets")) {
                price = quantity * 1.30;
                System.out.println(price);
            } else if (product.equals("peanuts")) {
                price = quantity * 1.50;
                System.out.println(price);
            }
        } else if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                price = quantity * 0.45;
                System.out.println(price);
            } else if (product.equals("water")) {
                price = quantity * 0.70;
                System.out.println(price);
            } else if (product.equals("beer")) {
                price = quantity * 1.10;
                System.out.println(price);
            } else if (product.equals("sweets")) {
                price = quantity * 1.35;
                System.out.println(price);
            } else if (product.equals("peanuts")) {
                price = quantity * 1.55;
                System.out.println(price);
            }
        }
    }
}
