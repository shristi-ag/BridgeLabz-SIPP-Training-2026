package controlflows1;
import java.util.*;
public class Countdown {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("enter your number:");
        number = sc.nextInt();
        while(number >= 1){
            System.out.println(number);
            number--;
        }

    }
}
