package Labs.L05WhileLoop;

import java.util.Scanner;

public class P01ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("Stop")) {
                break;
            }
            System.out.println(text);
        }
    }
}
