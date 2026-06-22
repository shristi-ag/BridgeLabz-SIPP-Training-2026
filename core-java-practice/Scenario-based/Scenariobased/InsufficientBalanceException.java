package Scenariobased;

//The first step to create an exception -> extend exception
public class InsufficientBalanceException extends Exception {
    double Balance;
    double WithdrawAmount;

    //The second step -> constructor
    public InsufficientBalanceException(double balance, double withdrawAmount) {
        this.Balance = balance;
        this.WithdrawAmount = withdrawAmount;
    }

    //The third step -> override Message
    @Override
    public String getMessage() {
        return "Insufficient Balance! Balance Amount: "+ Balance+ "\nWithdraw Amount: " + WithdrawAmount;
    }
}