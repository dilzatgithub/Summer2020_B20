package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import static day44_Constructor.HumanResource.*;
public class bankOfAzerbaijan {
    public static void main(String[] args) {
        ArrayList<employee> list = new ArrayList<>();
        list.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5));
        for (employee each: list){
            System.out.println(each.name);
            System.out.println(each.salary);
        }
//        list.add(HumanResource.employee1);
//        list.add(HumanResource.employee3);
//        list.add(HumanResource.employee5);



    }
}
