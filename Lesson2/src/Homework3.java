public class Homework3 {
    public static void main(String[] args) {
        int[] num = new int[]{1505, 95, 3213, 5433, 5433, 4322, 8891, 1};
        double sum = 0;
        for (int x: num) {
            sum += x;
        }
        System.out.print("Среднее арифметическое чисел равно: " + sum/num.length + ".");
    }
}
