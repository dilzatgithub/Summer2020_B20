package day57_polymorphism_Intro.abstractionTask;

public class Iphone extends Phone implements Downloadable,AppleApp{
    public Iphone(String model, String size, double price) {
        super("Iphone", model, size, price);
        if (price > 1500){
            throw new RuntimeException("Iphone price is invalid");
        }
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting: "+ phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling: " + phoneNumber);
    }

    @Override
    public void downloadable() {
        System.out.println("Iphone is downloading app from: "+ AppStoreName);
    }
    public void faceTime(long phoneNumber){
        System.out.println("Iphone is faceTimeing : "+ phoneNumber);

    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$" + price +
                '}';
    }
}
