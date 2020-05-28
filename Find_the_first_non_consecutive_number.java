package EithKyu;

public class Find_the_first_non_consecutive_number {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 6, 7, 8};
        System.out.println(find(a));

    }

    static Integer find(final int[] array) {
        if (array == null || array.length <= 2) return null;

        int temp = array[0];
        if (temp >= 0) {
            temp++;
            for (int i = 0; i < array.length; i++) {

            }
        }
        return null;
    }
}
