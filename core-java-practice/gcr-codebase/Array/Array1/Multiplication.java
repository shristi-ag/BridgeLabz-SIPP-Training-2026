import java.util.*;

public class Multiplication {
    int number;
    int[] multiplicationResult = new int[4];
    public void calculateTable() {
        int index = 0;
        for(int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }
    }
    public void displayTable() {
        int index = 0;
        for(int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i
                    + " = " + multiplicationResult[index]);
            index++;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Multiplication obj = new Multiplication();
        System.out.print("Enter Number: ");
        obj.number = sc.nextInt();
        obj.calculateTable();
        obj.displayTable();
        sc.close();
    }
}