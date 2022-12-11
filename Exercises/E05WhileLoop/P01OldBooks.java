package Exercises.E05WhileLoop;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchedBook = scanner.nextLine();
        String nextBook = scanner.nextLine();
        int booksChecked = 0;
        while (!nextBook.equals("No More Books")) {
            if (searchedBook.equals(nextBook)) {
                System.out.printf("You checked %d books and found it.", booksChecked);
                break;
            }
            booksChecked++;
            nextBook = scanner.nextLine();
        }
        if (nextBook.equals("No More Books")) {
            System.out.printf("The book you search is not here!%n" + "You checked %d books.", booksChecked);
        }
    }
}
