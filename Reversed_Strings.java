package EithKyu;

public class Reversed_Strings {
    public static void main(String[] args) {
        System.out.println(solution("world"));
    }
    public static String solution(String str) {
        StringBuilder in = new StringBuilder();
        str = String.valueOf(in.append(str).reverse());
        return str;


    }
}
//return new StringBuilder(str).reverse().toString();