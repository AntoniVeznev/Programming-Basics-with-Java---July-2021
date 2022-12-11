package Labs.L05WhileLoop;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String something = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;

        while (!something.equals("Stop")) {
            int number = Integer.parseInt(something);
            if (number > maxNumber) {
                maxNumber = number;
            }
            something = scanner.nextLine();


        }
        System.out.println(maxNumber);
    }
}
