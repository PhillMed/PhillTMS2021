import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здесь будет сумма ваших чисел.\nВведите первое число: ");
        int x = in.nextInt();
        System.out.println("Отлично!\nТеперь введите второе число: ");
        int y = in.nextInt();
        int sum = x + y;
        System.out.println("Сумма ваших чисел равна " + sum + ".");
    }
}
