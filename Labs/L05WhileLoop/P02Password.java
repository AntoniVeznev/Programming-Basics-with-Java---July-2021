package Labs.L05WhileLoop;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String initPass = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals(initPass)) {
            input = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", name);
    }
}
