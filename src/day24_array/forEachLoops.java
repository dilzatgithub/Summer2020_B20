package day24_array;

public class forEachLoops {
    public static void main(String[] args) {
        String[] words = {"C#","C#","Java","Python","Python","C++"};

        for (String each:words){
            String s = each;
            int count = 0;
            for (String e :words){
                if (s == e){
                    count += 1;
                }
            }if (count ==1 ){
                System.out.println(s);

            }
        }





    }
}
