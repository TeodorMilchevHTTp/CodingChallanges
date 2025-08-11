import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        if (args.length != 1) {
            System.err.println("Usage: java WordCount <filename>");
            System.exit(1);
        }

        String filename = args[0];
        long wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {

                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            }
            System.out.println(wordCount);

        } catch (IOException e) {
            System.err.println("Error reading file " + e.getMessage());
            System.exit(1);
        }
    }
}