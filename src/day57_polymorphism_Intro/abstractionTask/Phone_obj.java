package day57_polymorphism_Intro.abstractionTask;

public class Phone_obj {
    public static void main(String[] args) {
         Phone iphone = new Iphone("12","5.3",1000);
         Samsung samsung = new Samsung("s20","6.1",899);
         Huawei huawei = new Huawei("huawei","trash","5.3",25);
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);
    }
}
