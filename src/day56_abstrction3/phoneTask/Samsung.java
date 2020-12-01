package day56_abstrction3.phoneTask;

public class Samsung extends Phone {
    public Samsung(String model, double price, String size) {
        super("Samsung", model, price, size);
        if (price <= 0 || price >= 1200 ){
            throw new RuntimeException("Invalid price: "+ price);
        }
    }
    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+ phoneNumber );

    }

    @Override
    public void testing(long phoneNumber) {
        System.out.println("Samsung is texting to "+ phoneNumber);

    }

    @Override
    public String toString() {
        return "Samsung{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
