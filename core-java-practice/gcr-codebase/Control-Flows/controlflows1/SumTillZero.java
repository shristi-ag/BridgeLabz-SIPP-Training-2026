package controlflows1;
import java.util.*;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;
        System.out.println("Enter numbers (0 to stop):");
        number = sc.nextInt();
        while(number != 0) {
            sum = sum + number;
            number = sc.nextInt();
        }
        System.out.println("Sum = " + sum);
    }
}