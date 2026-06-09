package programmingelements2;
import java.util.*;
public class Moduli {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int number1;
            int number2;
            int quotient;
            int remainder;
            System.out.println("enter first number1 :");
            number1 = sc.nextInt();
            System.out.println("Enter second number2 :");
            number2 = sc.nextInt();
            quotient = number1 / number2;
            remainder = number1  % number2;
            System.out.println("quotient" + quotient);
            System.out.println("remainder" + remainder);

    }
}
