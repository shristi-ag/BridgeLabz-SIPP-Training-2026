package JavaInputOutput;
import java.io.*;
import java.util.Scanner;

public class Level {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileReader fr = new FileReader("students.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("reportcard.txt", true); // append mode
            BufferedWriter bw = new BufferedWriter(fw);

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                String name = data[0];

                int m1 = Integer.parseInt(data[1]);
                int m2 = Integer.parseInt(data[2]);
                int m3 = Integer.parseInt(data[3]);

                double avg = (m1 + m2 + m3) / 3.0;

                bw.write("Name: " + name + ", Average: " + avg);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Report card generated.");

        } catch (FileNotFoundException e) {
            System.out.println("Student file not found.");
        } catch (IOException e) {
            System.out.println("Error reading/writing file.");
        }
    }
}
