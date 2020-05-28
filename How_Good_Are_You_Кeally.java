package EithKyu;

public class How_Good_Are_You_Кeally {
    public static void main(String[] args) {
        int[] a = new int[] {100, 40, 34, 57, 29, 72, 57, 88};
        int myPoint = 75;

    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int temp = 0;
        for(int idx: classPoints)
            temp += idx;

        return ((temp / classPoints.length) < yourPoints);
    }


}
