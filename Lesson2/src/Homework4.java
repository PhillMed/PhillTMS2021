public class Homework4 {
    public static void main(String[] args) {
        int[] num = new int[]{1505, 95, 3213, 5433, 5433, 4322, -8891, -1};
        int max = num[0];
        int min = num[0];
        for (int x: num) {
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
