package EithKyu;

import java.util.Arrays;
import java.util.Collections;

public class Find_numbers_which_are_divisible_by_given_number {
    public static void main(String[] args) {
        System.out.println(Collections.singletonList(divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2)));
        System.out.println(Collections.singletonList(divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 3)));
        System.out.println(Collections.singletonList(divisibleBy(new int[]{0, 1, 2, 3, 4, 5, 6}, 4)));

    }
    public static int[] divisibleBy(int[] numbers, int divider) {
        String str = "";
        for (int i: numbers) {
            if(i % divider == 0)
                 str += i + " ";
        }

        int[] arrRes = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        return arrRes;
    }
}

// return Arrays.stream(numbers)
//         .filter(i -> (i % divider) == 0)
//         .toArray();