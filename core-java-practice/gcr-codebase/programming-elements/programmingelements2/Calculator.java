package programmingelements2;
import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float number1 ,number2;
        float addition, substraction, multiplication, division;
        System.out.println("Enter your first number");
        number1 = sc.nextFloat();
        System.out.println("Enter your second number");
        number2 = sc.nextFloat();
        addition = number1 + number2;
        substraction = number1 - number2;
        multiplication = number1 * number2;
        division = number1 / number2;
        System.out.println("addition = " + addition);
        System.out.println("substraction = " + substraction);
        System.out.println("multiplication = " + multiplication);
        System.out.println("division = " + division);





    }
}
