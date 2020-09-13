package day08;

public class carBuyingPower {
    public static void main(String[] args) {
        String firstAndLastName = "kamairan.Sb";
        int moneyLeft = 20000;
        int carPrice = 18000;
        String driverLicence = "good";
        boolean canBuy = moneyLeft > carPrice || moneyLeft == carPrice;

        boolean eligibleToBuy = canBuy && driverLicence == "good";
        System.out.println(eligibleToBuy);


    }


}
