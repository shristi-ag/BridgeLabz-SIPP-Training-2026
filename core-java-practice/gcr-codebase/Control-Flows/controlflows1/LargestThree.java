package controlflows1;
import java.util.*;
public class LargestThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1, number2, number3;
        System.out.println("Enter first number:");
        number1 = sc.nextInt();
        System.out.println("Enter second number:");
        number2 = sc.nextInt();
        System.out.println("Enter third number:");
        number3 = sc.nextInt();
        if(number1 > number2 && number1 > number3){
            System.out.println("Is the first number the largest ");
        }
        else if(number2 > number1 && number2 > number3){
            System.out.println("Is the Second number the largest");
        }
        else{
            System.out.println("Is the third number the largest");
        }

    }
}
