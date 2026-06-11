import java.util.*;
public class NumberStorage {
    double[] numbers = new double[10];
    double total = 0.0;
    int index = 0;
    public void calculateSum() {
        for(int i = 0; i < index; i++) {
            total = total + numbers[i];

        }
    }
    public void displayNumbers() {
        System.out.println("Numbers are:");
        for(int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Total Sum = " + total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberStorage obj = new NumberStorage();
        while(true) {
            System.out.print("Enter Number: ");
            double number = sc.nextDouble();
            if(number <= 0) {
                break;
            }
            if(obj.index == 10) {
                break;
            }
            obj.numbers[obj.index] = number;
            obj.index++;
        }
        obj.calculateSum();
        obj.displayNumbers();
        sc.close();
    }
}