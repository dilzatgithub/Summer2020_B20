package day39_CustomClass;

public class car {
    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;
    public void setInfo(String carBrand,String carModel,int carYear,
                        String carColor, double carMileage,double carPrice){
        brand = carBrand;
        model = carModel;
        year = carYear;
        mileage = carMileage;
        color = carColor;
        price = carPrice;

    }
    public void getInfo(){
        System.out.println(year+" "+ brand+" "+model+" "+color+" "+mileage+", $"+price);

    }





}
