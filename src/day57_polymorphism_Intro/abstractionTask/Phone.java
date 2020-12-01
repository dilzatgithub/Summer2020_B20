package day57_polymorphism_Intro.abstractionTask;

public abstract class Phone {
    public String brand,model,size;
    public double price;
    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);

    public Phone(String brand, String model, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        if (price<= 0){
            throw new RuntimeException("price of the phone can not be less than 0 ");

        }
        this.price = price;

    }
}
