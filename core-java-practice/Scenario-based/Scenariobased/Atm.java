package Scenariobased;

public class Atm {

        private double balance = 10000;
        private double amount;

        public void withdraw(double amount) throws Exception{
            if(amount>balance)
                throw new InsufficientBalanceException(balance, amount);

            balance -= amount;
            System.out.println("Balance Amount After Withdrawal: " +balance);
        }

        public static void main(String[] args) {
            Atm m = new Atm();

            try {
                m.withdraw(12000);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

