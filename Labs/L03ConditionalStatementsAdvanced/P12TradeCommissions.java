package Labs.L03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double persent = 0;
        boolean isValid = true;
        if (town.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                persent = sales * 0.05;
            } else if (sales > 500 && sales <= 1000) {
                persent = sales * 0.07;
            } else if (sales > 1000 && sales <= 10000) {
                persent = sales * 0.08;
            } else if (sales > 10000) {
                persent = sales * 0.12;
            } else {
                isValid = false;
            }
        } else if (town.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                persent = sales * 0.045;
            } else if (sales > 500 && sales <= 1000) {
                persent = sales * 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                persent = sales * 0.1;
            } else if (sales > 10000) {
                persent = sales * 0.13;
            } else {
                isValid = false;
            }
        } else if (town.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                persent = sales * 0.055;
            } else if (sales > 500 && sales <= 1000) {
                persent = sales * 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                persent = sales * 0.12;
            } else if (sales > 10000) {
                persent = sales * 0.145;
            } else {
                isValid = false;
            }
        } else {
            isValid = false;
        }
        if (isValid) {
            System.out.printf("%.2f", persent);
        } else {
            System.out.println("error");
        }
    }
}
