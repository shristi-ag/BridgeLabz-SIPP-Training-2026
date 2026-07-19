package controlflows1;
import java.util.*;
public class Voting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age:");
        age = sc.nextInt();
        if(age>18){
            System.out.println("you can vote");
        }else{
            System.out.println("you cant vote");
        }

    }
}
