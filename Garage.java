package by.overone.lesson22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Garage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car familyCar = new FamilyCar();
        Car sportCar = new SportCar();
        Car heavyCar = new HeavyCar();

        HashMap<Car, Integer> map = new HashMap<>();
        Integer familyCarCount = 4;
        Integer sportCarCount = 9;
        Integer heavyCarCount = 8;

        map.put(familyCar, familyCarCount);
        map.put(sportCar, sportCarCount);
        map.put(heavyCar, heavyCarCount);

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("{" + entry.getKey() + ": " +
                    entry.getValue() + "}");
        }

        System.out.println("How long is there in the garage FamilyCar?");
        int carLeft;
        if (scanner.hasNextInt()) {
            carLeft = scanner.nextInt();
        } else {
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Please, input correct number:");
            }
            carLeft = scanner.nextInt();
        }
    }
}
