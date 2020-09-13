package day40_recap;

public class backOfAmerica {
    public static void main(String[] args) {
        bankAccount dilzat = new bankAccount();
        dilzat.setAccountInfo("saving", "dilzat",
                "boa12345");
        dilzat.getInfo();
        dilzat.deposit(500);
        dilzat.checkBalance();
        dilzat.withDraw(400);
        dilzat.checkBalance();
        dilzat.withDraw(100000);
        dilzat.checkBalance();




    }
}
