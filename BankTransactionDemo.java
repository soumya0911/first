// BankTransaction.java
class BankTransaction {
    private String accountName;         // e.g., SBI, Canara, Bank of Baroda
    private String accountHolderName;
    private String accountType;         // saving or business
    private long accountNumber;
    private double balance;

    // Constructor
    public BankTransaction(String accountName, String accountHolderName, String accountType, long accountNumber, double balance) {
        this.accountName = accountName;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayTransactionInfo() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// BankTransactionDemo.java
public class BankTransactionDemo {
    public static void main(String[] args) {
        // Creating and displaying transaction details (pushed to Bank_transaction branch)
        BankTransaction transaction = new BankTransaction("SBI", "Soumya Suryavanshi", "Saving", 987654321012L, 50000.0);
        transaction.displayTransactionInfo();
    }
}
