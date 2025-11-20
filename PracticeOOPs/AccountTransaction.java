class InsufficientBalanceException extends Exception {
      InsufficientBalanceException(String message) {
        super(message);
    }
}
class Account {
    String accNo;
    String accHolder;
    String accType;
    int balance;
    Account(String accNo, String accHolder, String accType, int balance){
        this.accNo = accNo;
        this.accHolder = accHolder;
        this.accType = accType;
        this.balance = balance;
    }  
}
class Transaction{
    public void withdraw(Account account,int wdAmt){
        try{
            System.out.println("Transaction Details");
            System.out.println("======================");
            System.out.println("Account Number: " + account.accNo);
            System.out.println("Account Holder: " + account.accHolder);
            System.out.println("Account Type  : " + account.accType);
            if (wdAmt<account.balance) {
                account.balance -= wdAmt;
                System.out.println("Withdrawn Amount: " + wdAmt);
                System.out.println("Available Balance: " + account.balance);
                System.out.println("Transaction Status: Successful");
            }
            else{
                System.out.println("Transaction Status: Failed");
                System.out.println("Available Balance: " + account.balance);
                throw new InsufficientBalanceException("Insufficient Balance");
            }
        }
        catch(InsufficientBalanceException ibe){
            System.out.println(ibe.getMessage());
    }
    finally{
        System.out.println("*****Thank you for banking with us!********");
}
}
}
public class AccountTransaction {
    public static void main(String[] args) {
        Account account1 = new Account("1234567890", "John Doe", "Savings", 50000);
        Transaction transaction = new Transaction();
        transaction.withdraw(account1, 6000);
        Account account2 = new Account("0987654321", "Jane Smith", "Savings", 3000);
        transaction.withdraw(account2, 5000);
    }
}
