package programmingelements2;
import java.util.*;
public class Purchase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float unitprice;
        int quantity;
        float totalprice;
        System.out.println("Enter unitprice:");
        unitprice = sc.nextFloat();
        System.out.println("Enter quantity:");
        quantity = sc.nextInt();
        totalprice = unitprice * quantity;
        System.out.println("totalprice =" + totalprice);
    }
}
