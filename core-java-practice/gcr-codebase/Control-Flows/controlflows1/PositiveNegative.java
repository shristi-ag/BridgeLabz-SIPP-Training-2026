package controlflows1;
import java.util.*;
public class PositiveNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter your number:");
        number = sc.nextInt();
        if(number>0){
            System.out.println("number is positive:");
        }
        else if(number<0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("Zero");
        }

    }
}
