package Labs.L05WhileLoop;

import java.util.Scanner;

public class P04Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int math = 1;

        while (number >= math) {
            System.out.println(math);
            math = (math * 2) + 1;

        }
    }
}
