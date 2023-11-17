import java.io.*;
import java.util.*;

public class Treeset {
    public static void main(String[] args) {
        File file = new File("input.txt");
        TreeSet<String> words = new TreeSet<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (!words.contains(word)) {
                    words.add(word);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
