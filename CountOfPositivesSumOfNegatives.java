package EithKyu;

import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {
    public static void main(String[] args) {
        int[] z = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] q = new int[] {};
        ;


        System.out.println(Arrays.toString(countPositivesSumNegatives(z)));
        System.out.println(Arrays.toString(countPositivesSumNegatives(q)));

    }

    public static int[] countPositivesSumNegatives(int[] input)
    {
        if(input == null || input.length == 0 )
            return input = new int[]{};

        int[] res = new int[]{0, 0};
        for(int i = 0; i< input.length;i++){
            if(input[i] > 0)
                res[0] +=1;
            else if (input[i] < 0)
                res[1] += input[i];
        }
        return res; //return an array with count of positives and sum of negatives
    }
}

//    public static int[] countPositivesSumNegatives(int[] input)
//    {
//        if (input == null || input.length == 0) return new int[] {};
//        int count = 0,sum = 0;
//        for (int i : input) {
//            if (i > 0) count ++;
//            if (i < 0) sum += i;
//        }
//        return new int[] {count,sum};
//    }