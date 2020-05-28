package EithKyu;

import java.util.Arrays;

public class Expressions_Matter {
    public static void main(String[] args) {
        int a = 1, b = 10, c = 1;
        int[] res = new int[5];
        res[0] = a *(b + c);
        res[1] = a * b * c;
        res[2] = a + b * c;
        res[3] = (a + b) * c;
        res[4] = a + b + c;
        Arrays.sort(res);
        System.out.println(res[4]);


    }
}
