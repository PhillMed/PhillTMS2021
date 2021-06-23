import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здесь будет выводиться большее из двух чисел!\nВведите первое число: ");
        int a = in.nextInt();
        System.out.println("Отлично!\nТеперь введите второе число: ");
        int b = in.nextInt();
        if (a < b) {
            System.out.println("Наибольшее число это " + b + ".");
        }
        else{
            System.out.println("Наибольшее число это " + a + ".");
        }
    }
}