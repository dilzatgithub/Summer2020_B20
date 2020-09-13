package day39_CustomClass;

public class carMax {
    public static void main(String[] args) {
        car car1 = new car();
        car car2 = new car();
        car car3 = new car();
        car car4 = new car();
        car car5 = new car();
        car1.setInfo("Dodge","Charger",2014,"B5 Blue",
                50000,20000);
        car2.setInfo("BMW","440I",2016,"Red",20000,
                20000);
        car3.setInfo("abc","abc",2020,"clear",0,0);
        car1.getInfo();
        car2.getInfo();
        car3.getInfo();



    }
}
