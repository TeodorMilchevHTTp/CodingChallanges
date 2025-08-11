import java.io.FileInputStream;
import java.io.IOException;

public class ByteCount {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java WordCount <filename>");
            System.exit(1);
        }
        String filename = args[0];
        long byteCount = 0;

        try (FileInputStream fis = new FileInputStream(filename)) {

            byte[] buffer = new byte[4096];
            int bytes;

            while ((bytes = fis.read(buffer)) != -1) {
                byteCount += bytes;
            }
            System.out.println(byteCount);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }

    }
}