import java.io.*;

public class Main {
    public static void main(String[] args) {

        String inputFilePath = "Lesson14/src/main/java/homeWork/hw1/input.txt";
        try (FileInputStream stream = new FileInputStream(inputFilePath)) {
            FileReader fr = new FileReader(inputFilePath);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            FileOutputStream outputStream = new FileOutputStream("Lesson14/src/main/java/homeWork/hw1/output.txt", true);
            while (line != null) {
                System.out.println(line);
                String str1 = line;
                String strReverse = new StringBuilder(str1).reverse().toString();
                if (str1.equalsIgnoreCase(strReverse)) {
                    outputStream.write(str1.getBytes());
                    outputStream.write("\n".getBytes());
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
