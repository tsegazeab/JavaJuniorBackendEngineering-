import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CSVReadWriteExample {
    public static void main(String[] args) {
        String inputFile = "accounts.csv";
        String outputFile = "output.csv";

        try {
            // Reading from the CSV file using FileInputStream and BufferedReader
            FileInputStream fis = new FileInputStream(inputFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

            // Writing to the CSV file using FileOutputStream and BufferedWriter
            FileOutputStream fos = new FileOutputStream(outputFile);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));

            String line;
            while ((line = reader.readLine()) != null) {
                // Process the line as needed
                // In this example, we simply write the line as it is to the output file
                writer.write(line);
                writer.newLine();
            }

            // Closing the FileInputStream, BufferedReader, FileOutputStream, and BufferedWriter
            reader.close();
            writer.close();

            System.out.println("CSV file read and write completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
