import java.util.Scanner;
public class BMI {
    public static double findBMI(double weight, double height) {
        double heightMeter = height / 100.0;
        return weight / (heightMeter * heightMeter);
    }
    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        }
        else if (bmi < 25) {
            return "Normal";
        }
        else if (bmi < 30) {
            return "Overweight";
        }
        else {
            return "Obese";
        }
    }
    public static String[][] createReport(double data[][]) {
        String result[][] = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = findBMI(weight, height);
            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }
    public static void display(String result[][]) {
        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "\t" +
                            result[i][3]
            );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double data[][] = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter Height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        String result[][] = createReport(data);
        display(result);
    }
}