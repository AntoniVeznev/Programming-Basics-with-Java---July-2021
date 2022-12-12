package Exams;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double countJoinery = Double.parseDouble(scanner.nextLine());
        String typeJoinery = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;
        boolean notEnough = false;
        if (countJoinery < 10) {
            notEnough = true;
        } else if (typeJoinery.equals("90X130")) {
            price = 110;
            if (countJoinery > 30 && countJoinery < 60) {
                price = price - (price * 0.05);
            } else if (countJoinery > 60) {
                price = price - (price * 0.08);
            }
        } else if (typeJoinery.equals("100X150")) {
            price = 140;
            if (countJoinery > 40 && countJoinery < 80) {
                price = price - (price * 0.06);
            } else if (countJoinery > 80) {
                price = price - (price * 0.1);
            }
        } else if (typeJoinery.equals("130X180")) {
            price = 190;
            if (countJoinery > 20 && countJoinery < 50) {
                price = price - (price * 0.07);
            } else if (countJoinery > 50) {
                price = price - (price * 0.12);
            }
        } else if (typeJoinery.equals("200X300")) {
            price = 250;
            if (countJoinery > 25) {
                price = price - (price * 0.09);
            } else if (countJoinery > 50) {
                price = price - (price * 0.14);
            }
        }
        double finalPrice = price * countJoinery;

        if (delivery.equals("With delivery")) {
            finalPrice = finalPrice + 60;
            if (countJoinery > 100) {
                finalPrice = finalPrice * 0.96;
            }
        } else if (delivery.equals("Without delivery")) {
            if (countJoinery > 100) {
                finalPrice = finalPrice * 0.96;
            }
        }


        if (!notEnough) {
            System.out.printf("%.2f BGN", finalPrice);
        } else {
            System.out.println("Invalid order");
        }
    }
}
