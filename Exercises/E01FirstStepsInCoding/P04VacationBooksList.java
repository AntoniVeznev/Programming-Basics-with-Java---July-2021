package Exercises.E01FirstStepsInCoding;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bookPages = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalHours = bookPages / pages;
        int hoursPerDay = totalHours / days;

        System.out.println(hoursPerDay);

    }
}
