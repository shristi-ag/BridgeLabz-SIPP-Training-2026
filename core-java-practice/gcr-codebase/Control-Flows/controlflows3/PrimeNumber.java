package controlflows3;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        boolean isPrime = true;
        System.out.println("Enter number:");
        number = sc.nextInt();
        if(number <= 1) {
            isPrime = false;
        }
        else {
            for(int i = 2; i < number; i++) {

                if(number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime Number");
        }
    }
}