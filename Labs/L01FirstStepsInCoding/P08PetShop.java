package Labs.L01FirstStepsInCoding;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogsCount = Integer.parseInt(scanner.nextLine());
        int otherAnimals = Integer.parseInt(scanner.nextLine());

        Double dogFood = dogsCount * 2.50;
        int anotherAnimalFood = otherAnimals * 4;
        Double totalSum = dogFood + anotherAnimalFood;

        System.out.printf(totalSum + " " + "lv" + ".");
    }
}
