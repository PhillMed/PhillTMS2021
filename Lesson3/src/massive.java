import java.util.Scanner;
public class massive {
    public static void main(String[] args) {
        int[] massive = createMassive();
    }

    public static int[] createMassive() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int size = input.nextInt();
        System.out.println("Введите числа через пробел:");
        int[] massive = new int[size];
        for (int i = 0; i < size; i++) {
            massive[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" " + massive[i]);
        }
        return new int[]{1, 2, 3};
    }

    public void method2(int[] massive) {
        int size = massive.length;
        for (int i = 0; i < size; i++) {
            int number = massive[i]; {
                {
                    if (number > 0) {
                        System.out.println(++number);
                    }
                    if (number == 0) {
                        number = 10;
                        System.out.println(number);
                    }
                    if (0 >= number) {
                        System.out.println(number-2);
                    }
                }
            }
        }
    }
}