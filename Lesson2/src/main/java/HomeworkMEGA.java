import java.util.Scanner;
import static java.lang.Math.pow;

public class HomeworkMEGA {

    public static class Homework1 { //Сумма 2х чисел из консоли
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

    public static class Homework2 { //Большее из 2х чисел, введённых с консоли
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Здесь будет выводиться большее из двух чисел!\nВведите первое число: ");
            int a = in.nextInt();
            System.out.println("Отлично!\nТеперь введите второе число: ");
            int b = in.nextInt();
            if (b > a) {
                System.out.println("Наибольшее число это " + b + ".");
            } else {
                System.out.println("Наибольшее число это " + a + ".");
            }
        }
    }

    public static class Homework3 { //Среднее арифметическое из массива, заданного заранее
        public static void main(String[] args) {
            int[] num = new int[]{1505, 95, 3213, 5433, 5433, 4322, 8891, 1};
            double sum = 0;
            for (int x : num) {
                sum += x;
            }
            System.out.print("Среднее арифметическое чисел равно: " + sum / num.length + ".");
        }
    }

    public static class Homework4 { //Максимально и минимальное число массива
        public static void main(String[] args) {
            int[] num = new int[]{1505, 95, 3213, 5433, 5433, 4322, -8891, -1};
            int max = num[0];
            int min = num[0];
            for (int x : num) {
                if (x > max) {
                    max = x;
                }
            }
            for (int y : num) {
                if (min > y) {
                    min = y;
                }
            }
            System.out.println("Максимальное число:  " + max);
            System.out.println("Миимальное число: " + min);
        }
    }

    public static class Homework5 { //Поиск гипотенузы по теореме Пифагора
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
}


