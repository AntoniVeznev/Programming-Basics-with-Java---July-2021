package Exams;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rendHall = Integer.parseInt(scanner.nextLine());
        double statuettes = rendHall * 0.7;
        double catering = statuettes * 0.85;
        double soundSystem = catering / 2;
        double totalPrice = rendHall + statuettes + catering + soundSystem;
        System.out.printf("%.2f", totalPrice);
    }
}
