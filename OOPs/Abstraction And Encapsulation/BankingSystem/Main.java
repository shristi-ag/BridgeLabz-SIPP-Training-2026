package BankingSystem;

public class Main
{
    public static void main(String[] args)
    {
        SavingsAccount savings =
                new SavingsAccount("SB101", "Shristi", 50000, 5);

        CurrentAccount current =
                new CurrentAccount("CA201", "Rahul", 40000, 2);

        savings.deposit(5000);
        savings.withdraw(2000);

        System.out.println();

        current.deposit(3000);
        current.withdraw(1000);

        System.out.println("\n----- Savings Account -----");
        savings.displayAccountDetails();
        System.out.println("Interest : " + savings.calculateInterest());

        System.out.println();

        System.out.println("----- Current Account -----");
        current.displayAccountDetails();
        System.out.println("Interest : " + current.calculateInterest());
    }
}