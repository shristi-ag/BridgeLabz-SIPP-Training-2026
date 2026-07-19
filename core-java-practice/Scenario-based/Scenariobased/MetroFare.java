package Scenariobased;

import java.util.*;

public class MetroFare {
    public static void main(String[] args) {
        double balance=600.00;
        while(balance>0){
            System.out.println("------------------------------------------------------------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Distance in KM or Type -1 to exit");
            double distance = sc.nextDouble();
            if(distance==-1){
                break;

            }
            System.out.println("your Balance"+balance);

            //Fare Calculation
            double fare=(distance<5)?10:(distance<=10)?20:(distance>=20)?30:50;
            //Balance Calculation
            if(balance>fare){
                balance-=fare;
                System.out.println("Available Balance in your card:-"+balance);

            }else{
                System.out.println("Insufficient Balance Please Check your Card Balance");
            }
            System.out.println("Thank you for Travelling Delhi Metro");
            System.out.println("------------------------------------------------------------------------------------");

        }
        System.out.println("Card time Exceed or Balance is Zero!!!!!!");





    }
}
