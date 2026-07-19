package controlflows1;
import java.util.*;

public class CountDownfor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        System.out.println("Enter your number:");
        number = sc.nextInt();

        for(int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}