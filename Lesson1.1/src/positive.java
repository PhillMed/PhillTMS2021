import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Здесь будет подсчёт количества положительных чисел (т.е. >0)\nВведите значения через пробел: ");
        String line = in.nextLine();
        in = new Scanner(line);
        while (in.hasNext()){
            int value = in.nextInt();
            if (value > 0) {
                count++;
            }

        }
        System.out.println(count);
    }
}
