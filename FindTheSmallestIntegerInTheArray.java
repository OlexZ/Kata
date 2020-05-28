package EithKyu;

public class FindTheSmallestIntegerInTheArray {
    public static void main(String[] args) {
        int[] q = new int[]{78,56,232,12,11,43};
        int t = q[0];
        for(int i = 0; i<args.length;i++){
            if(t > q[i])
                t = q[i];
        }
        System.out.println(t);
    }
}

//return IntStream.of(args).min().getAsInt();
