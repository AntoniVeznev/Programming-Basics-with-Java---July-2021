package Labs.L04ForLoop;

import java.util.Scanner;

public class P03Numbers1ToNWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i = i + 3) {
            System.out.println(i);
        }
    }
}
