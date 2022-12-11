package Labs.L01FirstStepsInCoding;

import java.util.Scanner;

public class P03SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int squareArea = a * a;
        System.out.println(squareArea);
    }
}
