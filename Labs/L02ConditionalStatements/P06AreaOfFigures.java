package Labs.L02ConditionalStatements;

import java.util.Scanner;

public class P06AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if (figure.equals("square")) {
            double number = Double.parseDouble(scanner.nextLine());
            System.out.println(number * number);
        } else if (figure.equals("rectangle")) {
            double number1 = Double.parseDouble(scanner.nextLine());
            double number2 = Double.parseDouble(scanner.nextLine());
            System.out.println(number1 * number2);
        } else if (figure.equals("circle")) {
            double number3 = Double.parseDouble(scanner.nextLine());
            System.out.println(Math.PI * number3 * number3);
        } else {
            double number4 = Double.parseDouble(scanner.nextLine());
            double number5 = Double.parseDouble(scanner.nextLine());
            System.out.println((number4 * number5) / 2);
        }
    }
}
