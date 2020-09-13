package day08;

public class triangle {
    public static void main(String[] args) {
        double Angle1 = 60;
        double Angel2 = 120;
        double Angel3 = 20;
        boolean triangle = (Angle1 + Angel2 + Angel3 == 180);
        if(triangle == true){
            System.out.println("triangle is valid");
        }
        if(!triangle){
            System.out.println("triangle is invalid!");
        }
    }
}
