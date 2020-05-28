package EithKyu;

import java.util.Arrays;

public class BeginnerLostWithoutMap {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
