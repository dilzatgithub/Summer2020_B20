package day23_nestedloopss;

import javafx.scene.SnapshotParametersBuilder;

public class frequencyOfChar {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        String nonDup = "";
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) { // remove dup from str
            String ch = "" + str.charAt(i);
            if (!nonDup.contains(ch)) {
                nonDup += ch;

            }
        }
        for (int j = 0; j <= nonDup.length() - 1; j++) {


            char ch = nonDup.charAt(j);
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count += 1;

                }
            }
            result += ""+ ch + count;




        }
        System.out.println(result);





    }
}
