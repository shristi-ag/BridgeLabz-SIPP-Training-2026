import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GroceryBillReader {
    public static void main(String[] args) {

        int count = 0;

        try {
            FileReader fr = new FileReader("bill.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                count++;
            }

            br.close();

            System.out.println("Total Lines = " + count);

        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}