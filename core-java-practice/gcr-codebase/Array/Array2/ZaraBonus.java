import java.util.*;

public class ZaraBonus {
    double[] salary = new double[10];
    double[] years = new double[10];
    double[] bonus = new double[10];
    double[] newSalary = new double[10];
    double totalBonus = 0;
    double totalOldSalary = 0;
    double totalNewSalary = 0;
    public void calculateBonus() {
        for(int i = 0; i < salary.length; i++) {
            if(years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            }
            else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus = totalBonus + bonus[i];
            totalOldSalary = totalOldSalary + salary[i];
            totalNewSalary = totalNewSalary + newSalary[i];
        }
    }
    public void displayResult() {
        for(int i = 0; i < salary.length; i++) {
            System.out.println("\nEmployee " + (i+1));
            System.out.println("Old Salary -> " + salary[i]);
            System.out.println("Bonus -> " + bonus[i]);
            System.out.println("New Salary -> " + newSalary[i]);
        }
        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ZaraBonus employee = new ZaraBonus();
        for(int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i+1));
            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            System.out.print("Enter Years of Service: ");
            double service = sc.nextDouble();
            if(sal <= 0 || service < 0) {
                System.out.println("Invalid Input Enter Again");
                i--;
                continue;
            }
            employee.salary[i] = sal;
            employee.years[i] = service;
        }
        employee.calculateBonus();
        employee.displayResult();
        sc.close();
    }
}