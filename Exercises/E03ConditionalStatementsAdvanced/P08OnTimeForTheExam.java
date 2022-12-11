package Exercises.E03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());
        int examTime = examHour * 60 + examMinutes;
        int arriveTime = arriveHour * 60 + arriveMinutes;

        if (arriveTime < examTime - 30) {
            System.out.printf("Early ");
            int diff = examTime - arriveTime;
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                int h = diff / 60;
                int m = diff % 60;
                System.out.printf("%d:%02d hours before the start", h, m);
            }
        } else if (arriveTime <= examTime) {
            System.out.printf("On time ");
            int diff = examTime - arriveTime;
            System.out.printf("%d minutes before the start", diff);
        } else {
            System.out.printf("Late ");
            int diff = arriveTime - examTime;
            if (diff < 60) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                int h = diff / 60;
                int m = diff % 60;
                System.out.printf("%d:%02d hours after the start", h, m);
            }
        }
    }
}
