package day51_Exceptions;

import java.util.ArrayList;

public class exceptionHandling {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            System.out.println(list.get(1));
        }catch (IndexOutOfBoundsException a){
            System.out.println(a.getMessage());
        }

        System.out.println("step 2!");
    }
}
