import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
        amebaPer3Hours(); //1 задание, про амёб, где каждые 3 часа их количество удваивается.
    }

    public static void amebaPer3Hours() {
        Scanner in = new Scanner(System.in);
        System.out.println("Сейчас существует x амёб.\nВведите интересующее вас количество:");
        int amebs = in.nextInt();
        System.out.println("Каждые 3 часа Амёба делится на двое.\nСколько времени вы хотите пропустить?");
        int time = in.nextInt();
        int count = time / 3 +1;
        int amebsFinal = count * amebs;
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
            int d100 = amebsFinal % 100;
            int c10 = d100 % 10;
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
}
