import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "bcarbarcarbcarbba";
        System.out.println(str.substring(str.indexOf("c"), str.lastIndexOf("a") + 1));
        str = "A1A1234";
        System.out.println(str.substring(0, 2));

        char a = str.charAt(0);
        char b = str.charAt(3);
        System.out.println(str.replace(a, b));

        Scanner in = new Scanner(System.in);
        System.out.println("Введите предположительный полиндром: ");
        String str2 = in.next();
        String strReverse = new StringBuilder(str2).reverse().toString();
        if (str2.equalsIgnoreCase(strReverse)) { //проверка реверса с оригиналом
            System.out.println(str2 + " является полиндром");
        } else {
            System.out.println(str2 + " не является полиндром");
        }

        String str3 = "разделить строку по разделителю";
        String[] subStr;
        String divider = " "; // Разделитель
        subStr = str3.split(divider); // Разделения строки str3
        for (String s : subStr) {
            System.out.println(s);
        }
    }
}