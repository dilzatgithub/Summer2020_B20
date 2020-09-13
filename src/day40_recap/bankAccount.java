package day40_recap;

public class bankAccount {
    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;
    public void setAccountInfo(String clientAccountType,String clientName,
                               String clientAccountNum){
        accountType = clientAccountType;
        accountHolder = clientName;
        accountNumber = clientAccountNum;

    }
    public void getInfo(){
        System.out.println("==============================");
        System.out.println("Account Type: "+accountType);
        System.out.println("Account Holder Name: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Available Balance: " + balance);
        System.out.println("==============================");
    }
    public void checkBalance(){
        System.out.println("Available Balance: " + balance);
    }
    public void deposit(double amount){
        System.out.println("Depositing $" + amount+ " to "+ accountNumber);
        balance += amount;
    }
    public  void withDraw(double amount){
        if (balance >= amount){
            System.out.println("WithDrawing $" + amount+ " to "+ accountNumber);
            balance-= amount;
        }else {
            System.out.println("not enough balance");
            return;
        }
    }










}
