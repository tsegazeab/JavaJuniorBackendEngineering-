import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageIOExample {
    public static void main(String[] args) {
        FileInputStream inputFile = null;
        FileOutputStream outputFile = null;

        try {
            inputFile = new FileInputStream("input.jpg");
            outputFile = new FileOutputStream("output.jpg");

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputFile.read(buffer)) != -1) {
                outputFile.write(buffer, 0, bytesRead);
            }
            System.out.println("Image copied successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (inputFile != null) {
                    inputFile.close();
                }
                if (outputFile != null) {
                    outputFile.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
