import java.util.Random;
import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) { //Здесь просто начальный метод main, в котором вызываются все методы ниже.
        int[] massive = createMassive();// -создание массива
        method2(massive); //В эти методы отправляем массив *** -простые действия с элементами массива
        calculateCount(massive); //В эти методы отправляем массив *** -кол-во нечётных чисел массива
        countProgs(); // -вывод правильного окончания слова от числа
        foobar(); // -вывод слова foobar, если число делится на 3 и на 5
        calcDiagMassive(); // -сумма диагонали нового двумерного квадратного массива
        printPrimeNumbers(); // -Простые числа. Вывод их в консоль, их количество и сумма таковых
    }

    public static int[] createMassive() { //Здесь создаётся массив, с которым будут работать 2 следующих метода
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длинну массива (или введите 0, чтобы пропустить следующие 2 пункта): ");
        int size = input.nextInt();
        System.out.println("Введите числа через пробел:");
        int[] massive = new int[size];
        for (int i = 0; i < size; i++) {
            massive[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" " + massive[i]);
        }
        System.out.println();
        return massive; //Здесь возвращаем в метод main массив, чтобы дальше с ним работать ***
    }

    public static int method2(int[] massive) { //Здесь идут простые действия с числами массива
        int size = massive.length;
        System.out.println("Простые арифметические действия из 2го метода:");
        for (int i = 0; i < size; i++) {
            int number = massive[i]; {
                System.out.println(number > 0 ? ++number : number < 0 ? number-2 : 10);
            } //Если элемент >0, то выводится на 1 больше, если <0, то на 2 мешьше, а если = 0, то выводится просто 10
        }
        return 0;
    }

    public static int calculateCount(int[] massive) { //Здесь идёт подсчёт количества нечётных чисел в массиве
        int size = massive.length;
        int count = 0;
        System.out.println("Количество нечётных чиссел в массиве:");
        for (int i = 0; i < size; i++) {
            if  (massive[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
        return 0;
    }

    public static void countProgs() {
        System.out.println("Магия со словами, в зависимости от числа.\nВведите число:");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int d100 = count % 100; // деление на 100 и остаток
        int d10 = d100 % 10; // на 10
        System.out.print("У вас " + count + " программист"); //задано всё, кроме окончания, которое считается условием ниже
        System.out.println((d100 > 10 && d100 < 20) ? "ов." : (d10 > 1 && d10 < 5) ? "а." : (d10 == 1) ? "." : "ов.");
    }

    public static void foobar() { //вывод слова foobar, если выполняются оба условия
        Scanner in = new Scanner(System.in);
        System.out.println("Если число делится на 3, то выводится 'foo', а если на 5 - 'bar'.\nПопробуйте подобрать число, чтобы вывело 'foobar': ");
        int count = in.nextInt();
        boolean x = count % 3 ==0;
        boolean y = count % 5 ==0; //ввёл эти 2 булиана, чтобы условие не было слишком толстым
        System.out.println((x & y) ? "foobar" : x ? "foo" : y ? "bar" : "Увы, ничего");
    }

    public static void calcDiagMassive() { //Здесь будет считаться сумма значений по диагонали у квадратного массива
        Scanner in = new Scanner(System.in); //от верхнего левого до нижнего правого
        System.out.println("Счёт диагонали  квадратного двумерного массива.\nВведите размер:");
        int size = in.nextInt();
        System.out.println("Введите максимальное значение, что может выдать рандом числам в массиве");
        int max = in.nextInt();
        int[][] matrix = new int[size][size]; //массив квадратный, так что размер повторяется дважды, для ширины и высоты
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = random.nextInt(max); //Все числа выдаются рандомом до заданного значения max
                matrix[i][j] = value;
                System.out.print(value + " ");
                if (i == j) {
                    count += value;
                }
            }
            System.out.println();
        }
        System.out.println("Сумма = " + count +".");
    }
    public static void printPrimeNumbers() { //Здесь будут выводиться в строку все простые значения до заданного, а также их количество и сумма
        System.out.println("Вывод простых чисел до заданного значения, их количество и сумма");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, до которого (включительно) будут выводиться простые числа:"); //лучше 1000000000 не вводить, а то будет долго считать)
        int x = in.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 2; i <= x; i++) {
            boolean prime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                count++; //если число простое, то к количеству прибавляется 1   ░░░░░░░░░░░░░
                System.out.print(i + " "); //вывод простого числа на консоль    ░ Зациклено ░
                sum += i; //прибавление нового простого числа к сумме           ░░░░░░░░░░░░░
            }
        }
        System.out.println();
        System.out.println("Всего вышло " + count + " простых чисел.");
        System.out.println("Сумма простых чисел: " + sum);
    }
}