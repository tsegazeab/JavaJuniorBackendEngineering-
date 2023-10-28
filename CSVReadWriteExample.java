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

    int accountNumber = 0;
    String accountHolder = " ";
    double balance = 0.0;

    public static void main(String[] args) {
        String inputFile = "accounts.csv";
        String outputFile = "output.csv";
        CSVReadWriteExample cSVReadWriteExample=new CSVReadWriteExample();
        // Reading from the CSV file
        cSVReadWriteExample.readFromCSV(inputFile);

        // Writing to the CSV file
        //cSVReadWriteExample.writeToCSV(outputFile);
    }

    private void readFromCSV(String inputFile) {
        try {
            FileInputStream fis = new FileInputStream(inputFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

            String line;
            while ((line = reader.readLine()) != null) {
                // Process the line as needed
                String[] data = line.split(",");
                accountNumber = Integer.parseInt(data[0]);
                accountHolder = data[1];
                balance = Double.parseDouble(data[2])-100.00;
                writeToCSV("output.csv");
                System.out.println(line);
            }

            reader.close();
            System.out.println("CSV file read successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private  void writeToCSV(String outputFile) {
        try {
            FileOutputStream fos = new FileOutputStream(outputFile);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));

            writer.write(accountNumber+","+accountHolder+","+balance);             

            writer.close();
            System.out.println("CSV file write completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
