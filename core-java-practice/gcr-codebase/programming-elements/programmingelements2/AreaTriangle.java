package programmingelements2;
import java.util.*;
public class AreaTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float base, height;
        float areaCm, areaIn;
        System.out.println("Enter base:");
        base = sc.nextFloat();
        System.out.println("Enter height;");
        height = sc.nextFloat();
        areaCm = 0.5f * base * height;
        areaIn = areaCm /6.4516f;
        System.out.println("area of triangle = " + areaCm);
        System.out.println("area in square =" + areaIn);



    }
}
