package day48_Inheritance;

public class BankAccount {
    public static  String bankName;
    public String firstName;
    public String lastName;
    private long AccountNumber;
    private String accountHolder;
    private double balance;
    public BankAccount(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    static {
        bankName = "Bank of America";
    }
    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double Balance) {
        balance = Balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public String getAccountHolder(){
        return accountHolder;
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public void deposit(double amount){
        if (amount<0){
            System.out.println("invalid amount");
            return;
        }else {
            System.out.println("Depositing: $" + amount);
            balance += amount;
        }
    }
    public void withDraw(double amount){
        if (amount<= 0){
            System.out.println("invalid amount");
            return;
        }
        if (amount > balance){
            System.out.println("not enough balance");
            return;
        }else {
            System.out.println("WithDrawing: $" + amount);
            balance -= amount;
        }
    }
    public double checkBalance(){
        System.out.println("available balance is: $" + balance);
        return getBalance();
    }


}
