package effectivejava.chapter2.item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineReader {

    static String readLine(String pathToFile, String defaultValue) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultValue;
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(readLine("/path/to/file", "Exception when reading..."));
    }
}
