package programmingelements2;
import java.util.*;
public class Distance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float feet;
        float yards;
        float miles;
        System.out.println("Enter distance:");
        feet = sc.nextFloat();
        yards = feet / 3;
        miles = feet / 5280;
        System.out.println("Distemnace in yards=" + yards);
        System.out.println("Distance in miles=" + miles);
    }
}
