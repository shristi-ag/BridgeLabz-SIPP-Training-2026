package Array1;
import java.util.*;
public class NumberChecker {
    int[] number = new int[5];
    public void Checker(){
        for(int i =0; i <number.length;i++){
            if(number[i]>0){
                if(number[i]%2==0){
                    System.out.println("number is even");

                }else{
                    System.out.println("number is odd ");
                }
            }else if(number[i]<0){
                System.out.println("number is negative");
            }else{
                System.out.println("number is zero");
            }

        }
    }
    public void CompareList(){
        if(number[0] == number[4]){
            System.out.println("first and last number is equal");
        }else if(number[0] > number[4]){
            System.out.println("first number is greater");
        }else{
            System.out.println("last number is greater");
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NumberChecker number = new NumberChecker();
        System.out.println("enter the number:");
        for(int i = 0;i<number.number.length; i++){
            number.number[i] = sc.nextInt();
        }
        number.Checker();
        number.CompareList();
        sc.close();



    }

}
