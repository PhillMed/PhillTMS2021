package shop.util;

import java.util.Scanner;

public class Utils {

    public static int readIntFromConsole(String message, int bound) {
        Scanner in = new Scanner(System.in);
        int number;
        do {
            System.out.println(message + ":");
            while (!in.hasNextDouble()) {
                System.out.println("Введённое не является числом!");
                in.next();
            }
            number = in.nextInt();
        } while (isNotInBounds(number, bound));
        return number;
    }

    public static String readStringFromConsole(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

    public static boolean isNotInBounds(int number, int bound) {
        if (number < 1 || number > bound) {
            System.out.println("Введённое число не является положительным.");
        }
        return number < 1 || number > bound;
    }
}
