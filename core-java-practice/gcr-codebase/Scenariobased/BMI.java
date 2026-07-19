import java.util.*;
public class BMI {
    double height;
    double weight;
    public double calculateBMI() {
        double bmi = weight / (height * height);
        return bmi;
    }

    public void displayResult(double bmi) {
        System.out.println("HEIGHT -> " + height + " m");
        System.out.println("WEIGHT -> " + weight + " kg");
        System.out.println("BMI -> " + bmi);

        if (bmi < 18.5) {
            System.out.println("CATEGORY -> Underweight");
        } else if (bmi < 25) {
            System.out.println("CATEGORY -> Normal");
        } else {
            System.out.println("CATEGORY -> Overweight");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BMI person = new BMI();

        System.out.print("Enter Height (in meters): ");
        person.height = sc.nextDouble();

        System.out.print("Enter Weight (in kg): ");
        person.weight = sc.nextDouble();

        person.displayResult(person.calculateBMI());

        sc.close();
    }
}