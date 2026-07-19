
import java.util.*;
public class CoffeeShop {
    String CoffeeTypes;
    int Quantity;
    public double calculatePrice(double price){
        double bill= price*Quantity;
        double gst=bill*0.18;
        double finalBill=bill+gst;
        return finalBill;
    }
    public void generateBill(double bill){
        System.out.println("COFFEE TYPE->" + CoffeeTypes);
        System.out.println("QUANTITY->" + Quantity);
        System.out.println("BILL AMOUNT->" + bill);
        System.out.println("THANK YOU FOR VISITING!!");
    }
    public static void main (String[]args){
        System.out.println("Choose Coffee Type or Exit!!");
        System.out.println("1.Cappuccino:- 250 \n 2.Latte:-270\n 3.Americano:-200\n4.Espresso:-230\n 5.Matcha:-300\n6.Strawberry Matcha-360");
        Scanner sc =new Scanner(System.in);
        int choice = sc.nextInt();
        CoffeeShop coffee = new CoffeeShop();
        System.out.println("Quantity");
        coffee.Quantity=sc.nextInt();
        switch(choice){
            case 1:
                coffee.CoffeeTypes="Cappuccino";
                coffee.generateBill(coffee.calculatePrice(250));

                break;

            case 2:
                coffee.CoffeeTypes="Latte";
                coffee.generateBill(coffee.calculatePrice(270));

                break;

            case 3:
                coffee.CoffeeTypes="Americano";
                coffee.generateBill(coffee.calculatePrice(200));

                break;

            case 4:
                coffee.CoffeeTypes="Espresso";
                coffee.generateBill(coffee.calculatePrice(230));

                break;

            case 5:
                coffee.CoffeeTypes="Matcha";
                coffee.generateBill(coffee.calculatePrice(300));

                break;

            case 6:
                coffee.CoffeeTypes="Strawberry Matcha";
                coffee.generateBill(coffee.calculatePrice(360));

                break;

        }

    }
}