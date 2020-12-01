package day57_polymorphism_Intro.abstractionTask;

public class Huawei extends Phone implements Downloadable{
    public Huawei(String brand, String model, String size, double price) {
        super(brand, model, size, price);
        if(price > 200){
            System.out.println("don't even think about buying this phone");
        }
    }

    @Override
    public void downloadable() {
        System.out.println("Huawei is downloading from: "+ AndroidApp.AppStoreName+" and " + AppleApp.AppStoreName);

    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Huawei is calling");
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Huawei is texting");
    }
    public void stealInfo(){
        System.out.println("Huawei is stealing your Info");
    }

    @Override
    public String toString() {
        return "Huawei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$" + price +
                '}';
    }
}
