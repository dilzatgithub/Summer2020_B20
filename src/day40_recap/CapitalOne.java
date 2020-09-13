package day40_recap;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        bankAccount kamran = new bankAccount();
        bankAccount muradil = new bankAccount();
        bankAccount osman = new bankAccount();
        bankAccount dilnigar = new bankAccount();
        bankAccount dilzat = new bankAccount();
        kamran.setAccountInfo("checking","kamran",
                "kamran12345");
        muradil.setAccountInfo("checking","muradil",
                "muradil12345");
        osman.setAccountInfo("checking","osman",
                "osman12345");
        dilnigar.setAccountInfo("checking","dilnigar",
                "dilnigar12345");
        dilzat.setAccountInfo("checking","dilzat",
                "dilzat12345");
        ArrayList<bankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(dilzat,dilnigar,osman,kamran,muradil));
       for (bankAccount each : accounts){
           each.deposit(500);
           //each.getInfo();
       }
       accounts.get(3).deposit(1000);
       accounts.get(3).checkBalance();
       accounts.get(4).deposit(500);
       accounts.get(4).checkBalance();
       accounts.removeIf(each -> each.balance< 1000);
       for (bankAccount each : accounts){
           each.getInfo();
       }












    }
}
