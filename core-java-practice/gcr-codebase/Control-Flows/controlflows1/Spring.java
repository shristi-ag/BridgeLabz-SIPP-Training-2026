package controlflows1;
import java.util.*;
public class Spring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month, day;
        System.out.println("Enter the month");
        month = sc.nextInt();
        System.out.println("Enter the day");
        day = sc.nextInt();
        if(month == 3 && day>=20  || month == 4 || month == 5 || month == 6 && day<=30){
            System.out.println("its a spring season:");
        }else{
            System.out.println("not a spring season");
        }


    }
}
