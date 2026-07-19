package controlflow2;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter number:");
        number = sc.nextInt();
        if(number > 0) {
            for(int i = 1; i <= number; i++) {
                if(i % 2 == 0) {
                    System.out.println(i + " is Even");
                }
                else {
                    System.out.println(i + " is Odd");
                }
            }
        }
        else {
            System.out.println("Not a Natural Number");
        }
    }
}