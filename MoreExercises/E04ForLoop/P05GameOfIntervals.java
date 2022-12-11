package MoreExercises.E04ForLoop;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double result = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;

        for (int i = 1; i <= number; i++) {
            int numberOfNumbers = Integer.parseInt(scanner.nextLine());
            if (numberOfNumbers >= 0 && numberOfNumbers <= 9) {
                count1++;
                result += (numberOfNumbers * 0.20);
            } else if (numberOfNumbers >= 10 && numberOfNumbers <= 19) {
                count2++;
                result += (numberOfNumbers * 0.30);
            } else if (numberOfNumbers >= 20 && numberOfNumbers <= 29) {
                count3++;
                result += (numberOfNumbers * 0.40);
            } else if (numberOfNumbers >= 30 && numberOfNumbers <= 39) {
                count4++;
                result = result + 50;
            } else if (numberOfNumbers >= 40 && numberOfNumbers <= 50) {
                count5++;
                result = result + 100;
            } else {
                count6++;
                result = result / 2;
            }
        }
        double percentOne = 1.0 * count1 / number * 100;
        double percentTwo = 1.0 * count2 / number * 100;
        double percentThree = 1.0 * count3 / number * 100;
        double percentFour = 1.0 * count4 / number * 100;
        double percentFive = 1.0 * count5 / number * 100;
        double percentSix = 1.0 * count6 / number * 100;

        System.out.printf("%.2f\n", result);
        System.out.printf("From 0 to 9: %.2f%%\n", percentOne);
        System.out.printf("From 10 to 19: %.2f%%\n", percentTwo);
        System.out.printf("From 20 to 29: %.2f%%\n", percentThree);
        System.out.printf("From 30 to 39: %.2f%%\n", percentFour);
        System.out.printf("From 40 to 50: %.2f%%\n", percentFive);
        System.out.printf("Invalid numbers: %.2f%%", percentSix);
    }
}
