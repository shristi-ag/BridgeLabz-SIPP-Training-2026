import java.util.*;

public class Table {
    int number;
    int[] multiplicationResult = new int[10];
    public void calculateTable() {
        for(int i = 1; i <= 10; i++) {
            multiplicationResult[i-1] = number * i;

        }
    }
    public void displayTable() {

        for(int i = 1; i <= 10; i++) {

            System.out.println(number + " * " + i
                    + " = " + multiplicationResult[i-1]);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Table table = new Table();


        System.out.print("Enter Number: ");
        table.number = sc.nextInt();


        table.calculateTable();

        table.displayTable();


        sc.close();
    }
}