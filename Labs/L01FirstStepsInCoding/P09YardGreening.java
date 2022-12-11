package Labs.L01FirstStepsInCoding;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double m2 = Double.parseDouble(scanner.nextLine());

        Double priceWithDDS = m2 * 7.61;
        Double discount = priceWithDDS * 0.18;
        Double totalSum = priceWithDDS - discount;

        System.out.printf("The final price is: %s lv.", totalSum);
        System.out.println(" " + "The discount is:" + discount + " " + "lv.");
    }
}
