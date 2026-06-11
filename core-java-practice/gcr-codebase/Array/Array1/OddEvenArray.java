import java.util.*;

public class OddEvenArray {
    int number;
    int[] oddNumbers;
    int[] evenNumbers;
    int oddIndex = 0;
    int evenIndex = 0;
    public void storeNumbers() {
        for(int i = 1; i <= number; i++) {
            if(i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            }
            else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
    }
    public void displayArray() {
        System.out.println("Odd Numbers:");
        for(int i = 0; i < oddIndex; i++) {
            System.out.println(oddNumbers[i]);
        }
        System.out.println("Even Numbers:");
        for(int i = 0; i < evenIndex; i++) {
            System.out.println(evenNumbers[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OddEvenArray obj = new OddEvenArray();
        System.out.print("Enter Number: ");
        obj.number = sc.nextInt();
        if(obj.number <= 0) {
            System.out.println("Invalid Number");
            return;
        }
        obj.oddNumbers = new int[obj.number / 2 + 1];
        obj.evenNumbers = new int[obj.number / 2 + 1];
        obj.storeNumbers();
        obj.displayArray();
        sc.close();

    }
}