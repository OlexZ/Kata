package EithKyu;

import javafx.print.Collation;

import java.util.Arrays;
import java.util.Collections;

public class Sum_of_differences_in_array {
    public static void main(String[] args) {
        System.out.println(sumOfDifferences(new int[]{1, 2, 10}));
        System.out.println(sumOfDifferences(new int[]{-3, -2, -1}));
        System.out.println(sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        System.out.println(sumOfDifferences(new int[]{-17, 17}));
        System.out.println(sumOfDifferences(new int[0]));
        System.out.println(sumOfDifferences(new int[]{-1}));
        System.out.println(sumOfDifferences(new int[]{1}));
        System.out.println(sumOfDifferences(new int[]{14, 6, 7, 24, 4, 12, 10, 21, 3, 7, 19, 11, 5,
                6, 15, 13, 20, 7, 9, 24, 25, 9, 2})); //23


    }

    public static int sumOfDifferences(int[] arr) {
       if (arr.length < 2) return 0;
        Arrays.sort(arr);

       int res = 0;
        for (int i = 1; i < arr.length; i++) {
            res += arr[i - 1] - arr[i];
        }
        return Math.abs(res);
    }
}

//Arrays.sort(arr);
//return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
