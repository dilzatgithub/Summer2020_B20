package day43_staticBlock;

public class static_VS_instance {
    static int staticVariables;
    int instance;

    public static void main(String[] args) {
        static_VS_instance obj1 = new static_VS_instance();
        obj1.instance = 100;
        obj1.staticVariables = 500;// changes to 400;

        static_VS_instance obj2 = new static_VS_instance();
        obj2.instance = 200;
        obj2.staticVariables = 400;

        System.out.println(obj1.instance);
        System.out.println(obj2.instance);
        System.out.println("========================");
        System.out.println(obj1.staticVariables);
        System.out.println(obj2.staticVariables);
        System.out.println(static_VS_instance.staticVariables);// this is a better way to call static
    }

}
