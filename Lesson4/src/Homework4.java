import java.util.Random;
import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
        amebaPer3Hours(); //1 задание, про амёб, где каждые 3 часа их количество удваивается.
        multiInSuMM(); //2 задание, где надо найти произвдение, не используя умножение.
//        massives4massives(); //3 задание, где надо нарисовать треугольники в массивах
        info4count(); // 4 задание, где надо узнать информацию о числе
        massive13531(); // 5 задание, надо вывести массив нечётных чисел, а после выдать его в обратном порядке
        massiveMaxCount(); // 6 задание. Вывести порядковый номер максимального числа в массиве
        massiveToZero();
    }

    public static void amebaPer3Hours() {
        Scanner in = new Scanner(System.in);
        System.out.println("Сейчас существует x амёб.\nВведите интересующее вас количество:");
        int amebs = in.nextInt();
        System.out.println("Каждые 3 часа Амёба делится на двое.\nСколько времени вы хотите пропустить?");
        int time = in.nextInt();
        int count = time / 3;
        long amebsFinal = (long) (Math.pow(2, count) * amebs);
        String x = null;
        if (time >= 0) {
            int c100 = time % 100;
            int c10 = c100 % 10;
            if (c100 >= 11 && c100 <= 19) {
                x = "ов";
            } else if (c10 >= 2 && c10 <= 4) {
                x = "а";
            } else if (c10 == 1) {
                x = "";
            } else {
                x = "ов";
            }
        }
        String y = null;
        if (amebsFinal >= 0) {
            long d100 = amebsFinal % 100;
            long c10 = d100 % 10;
            if (d100 >= 11 && d100 <= 19) {
                y = "амёб";
            } else if (c10 >= 2 && c10 <= 4) {
                y = "амёбы";
            } else if (c10 == 1) {
                y = "амёба";
            } else {
                y = "амёб";
            }
        }
        System.out.println("Спустя " + time + " час" + x + " будет " + amebsFinal + " " + y);
    }

    public static void multiInSuMM() { //2 задание, где надо найти произвдение, не используя умножение.
        Scanner in = new Scanner(System.in);
        System.out.println("Попробуем перемножить 2 числа без умножения\nВведите число a:");
        int a = in.nextInt();
        System.out.println("Введите число b:");
        int b = in.nextInt();
        int summ = 0;
        if (b > 0) {
            for (int i = 0; i < b; i++) {           //
                summ += a;                          //
            }                                       //<-----------------Подумать над формулой
        } else if (b < 0) {                         //
            for (int i = 0; i > b; i--) {          //
                summ -= a;
            }
        } else {
            summ = 0;
        }
        System.out.println("Произведение равно: " + summ);
    }

/*
    public static void massives4massives (){ //3 задание, где надо нарисовать треугольники в массивах
        Scanner in = new Scanner(System.in);
        System.out.println("Сейчас будут нарисованы матричные треугольники.\nВведите размер матрицы: ");
        int size = in.nextInt();
        int[][] matrix = new int[size][size];
    }
}*/

    public static void info4count() { // 4 задание, где надо узнать информацию о числе
        Scanner in = new Scanner(System.in);
        System.out.println("Сейчас будет информация о введённом числе.\nВведите число: ");
        int count = in.nextInt();
        String zero;
        if (count > 0) {
            zero = " - это положительное число, его длинна: ";
        } else if (count < 0) {
            zero = " - это отрицательное число, его длинна: ";
        } else {
            zero = " - это бублик :), его длинна: ";
        }
        int lengthNumber = String.valueOf(count).length();
        System.out.println(count + zero + lengthNumber);
    }

    public static void massive13531() { // 5 задание. Вывести массив нечётных чисел, а после выдать его в обратном порядке
        int x = 0;
        int y = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                x++;
            }
        }
        int[] massive = new int[x];
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                massive[y] = i;
                System.out.print(massive[y] + " ");
                y++;
            }
        }
        System.out.println(" ");
        for (int i = massive.length - 1; i >= 0; i--) {
            System.out.print(massive[i] + " ");
        }
    }

    public static void massiveMaxCount() { // 6 задание. Вывести порядковый номер максимального числа в массиве
        Scanner in = new Scanner(System.in);
        System.out.println("Задание 6. Номер max числа в массиве\nВведите размер массива: ");
        int size = in.nextInt();
        int number = 0;
        int[] massive = new int[size];
        int max = massive[0];
        System.out.println("Введите максимальное значение рандома: ");
        int maxR = in.nextInt();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int value = random.nextInt(maxR);
            massive[i] = value;
            System.out.print(value + " ");
            for (int x : massive) {
                if (x >= max) {
                    max = x;
                    number = i;
                }
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент " + max + ", индекс его последнего вхождения в массив = " + number);
    }

    public static void massiveToZero() { //7 Задание. массив из 20 рандомных чисел. Каждое чётное заменить на 0
        System.out.println("Задание 7. Замена чётных элементов массива на нули");
        int[] massive = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int value = random.nextInt(20);
            massive[i] = value;
            System.out.print(value + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            int value = random.nextInt(20);
            if (i % 2 != 0) {
                value = 0;
                massive[i] = value;
                System.out.print(value + " ");
            }
        }
    }
}