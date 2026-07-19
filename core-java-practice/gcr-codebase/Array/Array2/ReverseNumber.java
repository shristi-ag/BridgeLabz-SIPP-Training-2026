import java.util.*;
public class ReverseNumber {
    int number;
    int count = 0;
    int[] digits = new int[10];
    public void storeDigits() {
        int temp = number;
        while(temp != 0) {
            count++;
            temp = temp / 10;
        }
        digits = new int[count];
        int index = 0;
        while(number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }
    }
    public void displayReverse() {
        System.out.println("Reverse Number:");
        for(int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseNumber obj = new ReverseNumber();
        System.out.print("Enter Number: ");
        obj.number = sc.nextInt();
        obj.storeDigits();
        obj.displayReverse();
        sc.close();
    }
}