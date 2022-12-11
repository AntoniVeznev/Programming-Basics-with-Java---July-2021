package Labs.L04ForLoop;

import java.util.Scanner;

public class P07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < number; i++) {
            int otherNumbers = Integer.parseInt(scanner.nextLine());
            sum += otherNumbers;
        }
        System.out.println(sum);
    }
}
