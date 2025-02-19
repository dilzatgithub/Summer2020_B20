package day57_polymorphism_Intro.abstractionTask;

public class Samsung extends Phone implements Downloadable,AndroidApp {
    @Override
    public void downloadable() {
        System.out.println("Samsung is downloading from: "+ AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting: " +phoneNumber);

    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling: "+ phoneNumber);

    }
    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    public Samsung( String model, String size, double price) {
        super("Samsung", model, size, price);
        if (price > 1200){
            throw new RuntimeException("price can not be more than 1200");
        }
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$" + price +
                '}';
    }
}
