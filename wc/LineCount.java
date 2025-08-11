import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        if (args.length != 1) {
            System.err.println("Usage: java WordCount <filename>");
            System.exit(1);
        }
        String filename = args[0];
        long linesCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                linesCount++;
            }
        }
        System.out.println(linesCount);

    }
}
