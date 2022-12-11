package Labs.L05WhileLoop;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String something = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;

        while (!something.equals("Stop")) {
            int number = Integer.parseInt(something);
            if (number < minNumber) {
                minNumber = number;
            }
            something = scanner.nextLine();

        }
        System.out.println(minNumber);
    }
}
