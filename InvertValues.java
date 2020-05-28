package EithKyu;

import java.util.Arrays;

public class InvertValues {
    public static void main(String[] args) {
        int[] arr = new int[] {1,-2,3,-4,5,};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                arr[i] = -arr[i];
            else
                arr[i] = Math.abs(arr[i]);

//                    arr[i] = (arr[i] > 0) ? -arr[i] : arr[i];
//                    arr[i] = (arr[i] < 0) ? -arr[i] : arr[i];;

        }
        System.out.println(Arrays.toString(arr));
    }
}

//Best solution
//return java.util.Arrays.stream(array).map(i -> -i).toArray();