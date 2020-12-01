package day56_abstrction3.phoneTask;

public abstract class Phone {
    public String name;
    public String model;
    public double price;
    public String size;

    public abstract void calling(long phoneNumber);
    public abstract void testing(long phoneNumber);

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

    public Phone(String name, String model, double price, String size) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.size = size;
    }
}
