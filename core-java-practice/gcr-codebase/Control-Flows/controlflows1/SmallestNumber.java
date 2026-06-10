package controlflows1;
import java.util.*;
public class SmallestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1, number2, number3;
        System.out.println("enter first number:");
        number1 = sc.nextInt();
        System.out.println("Enter second number:");
        number2 = sc.nextInt();
        System.out.println("Enter third number:");
        number3 = sc.nextInt();
        if(number1 < number2 && number1 < number3){
            System.out.println("is the first number is smallest : True");
        }else{
            System.out.println("is the first number is smalllest : False");
        }

    }
}
