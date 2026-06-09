package programmingelements2;
import java.util.*;
public class perimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float perimeter;
        float side;
        System.out.println("Enter perimeter:");
        perimeter = sc.nextFloat();
        side = perimeter /4;
        System.out.println("the length of side" + side + "whose perimeter is 4 times" );

    }
}
