package EithKyu;

public class Remove_String_Spaces {
    public static void main(String[] args) {
        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        System.out.println(noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        System.out.println(noSpace("8aaaaa dddd r     "));
        System.out.println(noSpace("8j aam"));

    }


        static String noSpace(final String x) {
            return x.replace(" ", "");
        }

}
