import java.util.Scanner;

import static java.lang.Math.pow;

public class Homework5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сейчас мы посчитаем гипотенузу прямугольного треугольнка по катетам.\nЕсли готов, то введи первое число: ");
        int x = in.nextInt();
        System.out.println("Хорошо.\nТеперь введи второе число: ");
        int y = in.nextInt();
        double z = Math.sqrt(pow(x, 2) + pow(y, 2));
        System.out.println("Гипотенуза данного треугольника: " + z);
    }
}
