package controlflows1;
import java.util.*;
public class NaturalNumber {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number;
    System.out.println("Enter the number:");
    number = sc.nextInt();
    if(number > 0){
        int sum = number * (number + 1) / 2;
        System.out.println("the sum is a natural number:" + sum);

    }
    else{
        System.out.println("the  sum is not a natural number:" );
    }


}

}
