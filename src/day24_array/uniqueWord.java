package day24_array;

public class uniqueWord {
    public static void main(String[] args) {
        String[] words = {"C#","C#","Java","Python","Python","C++"};
        for (int j = 0; j<= words.length-1;j++) {
            String a = words[j];
            int count = 0;

            for (int i = 0; i <= words.length - 1; i++) {
                String each = words[i];
                if (a == each){
                    count += 1;
                }


            }
            if (count == 1){
                System.out.println(a + count);
            }

        }

    }
}
