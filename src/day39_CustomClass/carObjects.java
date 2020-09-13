package day39_CustomClass;

public class carObjects {
    public static void main(String[] args) {
        car car1 = new car();
        car1.setInfo("Toyota","Corolla",2020,"black",
                55000,2000);

//        car1.brand = "Toyota";
//        car1.color = "Black";
//        car1.model = "4runner";
//        car1.mileage = 200000;
//        car1.price = 30000;
//        car1.year = 2019;
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);


        System.out.println("===================================");
        car car2 = new car();
        car2.setInfo("BMW","M4",2018,"White",
                0,50000);
//        car2.brand = "BMW";
//        car2.model = "M4";
//        car2.year = 2018;
//        car2.color = "white";
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        System.out.println("==========================");
        car car3 = new car();
        car3.setInfo("VW","Jetta",2014,"White",140000,
                8000);
        car3.getInfo();













    }
}
