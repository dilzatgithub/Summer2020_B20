package day56_abstrction3.phoneTask;

public class Iphone extends Phone {
    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling: "+ phoneNumber );
    }

    @Override
    public void testing(long phoneNumber) {
        System.out.println("Iphone is texting to: " + phoneNumber);

    }

    public Iphone(String model, double price, String size) {
        super("Iphone", model, price, size);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
