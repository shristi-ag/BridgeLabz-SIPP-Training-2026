import java.util.*;
public class LargestDigit {
    int number;
    int[] digits = new int[10];
    int index = 0;
    public void storeDigits() {
        while(number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }
    }
    public void findLargest() {
        int largest = 0;
        int secondLargest = 0;
        for(int i = 0; i < index; i++) {
            if(digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if(digits[i] > secondLargest
                    && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest Digit -> " + largest);
        System.out.println("Second Largest Digit -> "
                + secondLargest);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LargestDigit obj = new LargestDigit();
        System.out.print("Enter Number: ");
        obj.number = sc.nextInt();
        obj.storeDigits();
        obj.findLargest();
        sc.close();
    }
}