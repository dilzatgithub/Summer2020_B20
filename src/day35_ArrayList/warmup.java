package day35_ArrayList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class warmup {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i = list.size()-1; i>= 0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("==================");
        String[] arr1 ={"A","B","C"};
        String[] arr2 ={"D","E","F","G"};
        ArrayList<String > arr3 = new ArrayList<>();
        for (String each : arr1){
            arr3.add(each);
        }
        for (String each : arr2){
            arr3.add(each);
        }
        System.out.println(arr3);
        System.out.println("=============");
        String str = "a1b2c3";
        int sum = 0;

        for (int i =0; i<= str.length()-1;i++){
            char each = str.charAt(i);
            if (each >= 48 && each <= 57){
                sum +=  Integer.parseInt(""+ each);

            }
        }
int dum = 0;
        System.out.println(sum);
        System.out.println("===============");
        String n1 = "a1b2c3d4";
        for (char each : str.toCharArray()){
            if (Character.isDigit(each)){
                dum += Integer.parseInt(each+"");
            }
        }
        System.out.println(dum);

















    }

}
