package EithKyu;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Sort_and_Star {
    public static void main(String[] args) {
        System.out.println(twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        System.out.println(twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));

    }
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        char[] iter =  s[0].toCharArray();
        String res = "";
        for (int i = 0; i < iter.length;i++) {
            if (iter.length-1 == i){
                res += iter[i];
                break;
            }
            res += iter[i] + "***";
        }
        return res;
    }
}

//java.util.Arrays.sort(s);
//return String.join("***",s[0].split(""));
