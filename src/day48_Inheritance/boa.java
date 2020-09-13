package day48_Inheritance;

public class boa {
    public static void main(String[] args) {
        BankAccount accountOne = new BankAccount("dilzat","dilmurat");
        accountOne.setAccountHolder(accountOne.firstName+" "+ accountOne.lastName);
        accountOne.setAccountNumber(123456789);
        accountOne.setBalance(50);
        accountOne.checkBalance();
        accountOne.deposit(500);
        accountOne.checkBalance();
        accountOne.withDraw(300);
        accountOne.checkBalance();
    }
}
