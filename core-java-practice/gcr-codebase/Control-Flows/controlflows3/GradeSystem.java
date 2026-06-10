package controlflows3;
import java.util.*;
public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double physics, chemistry, maths;
        System.out.println("Enter Physics Marks:");
        physics = sc.nextDouble();
        System.out.println("Enter Chemistry Marks:");
        chemistry = sc.nextDouble();
        System.out.println("Enter Maths Marks:");
        maths = sc.nextDouble();
        double percentage = (physics + chemistry + maths) / 3;
        System.out.println("Percentage = " + percentage);
        if(percentage >= 90) {
            System.out.println("Grade A");
        }
        else if(percentage >= 75) {
            System.out.println("Grade B");
        }
        else if(percentage >= 60) {
            System.out.println("Grade C");
        }
        else if(percentage >= 40) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }
    }
}