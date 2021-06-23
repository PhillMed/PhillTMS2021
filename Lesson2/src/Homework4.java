public class Homework4 {
    public static void main(String[] args) {
        int[] num = new int[]{1505, 95, 3213, 5433, 5433, 4322, 8891, 1};
        int max = 0;
        for (int x: num) {
            if (max <= x) {
                max = x;
            }
        }
        System.out.println("Максимальное число в массиве это " + max);
    }
}
