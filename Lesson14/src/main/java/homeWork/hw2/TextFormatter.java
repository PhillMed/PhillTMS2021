package homeWork.hw2;

import java.io.*;
import java.util.Scanner;

public class TextFormatter {
    public static int words(String[] wordsCount) {
        Scanner in = null;
        try {
            in = new Scanner( new FileInputStream("Lesson14/src/main/java/homeWork/hw2/input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            assert in != null;
            if (!in.hasNext()) break;
            String line = in.next();
            wordsCount = line.split("[\\pP\\s&&[^']]+");
        }
        in.close();
        return words(wordsCount);
    }
    public static boolean isWithPalindrome() {
        String inputFilePath = "Lesson14/src/main/java/homeWork/hw2/input.txt";
        try (FileInputStream stream = new FileInputStream(inputFilePath)) {
            FileReader fr = new FileReader(inputFilePath);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                String strReverse = new StringBuilder(line).reverse().toString();
                if (line.equalsIgnoreCase(strReverse)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
