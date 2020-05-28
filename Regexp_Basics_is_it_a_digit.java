package EithKyu;

public class Regexp_Basics_is_it_a_digit {
    public static void main(String[] args) {
        System.out.println(isDigit(""));
        System.out.println(isDigit("7"));
        System.out.println(isDigit(" "));
        System.out.println(isDigit("a5"));
        System.out.println(isDigit("7453d"));
        System.out.println(isDigit(" 3 "));


    }

    public static boolean isDigit(String s) {
        int i;
        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException o) {
            return false;
        }
        if (i >= 0 && i < 10)
            return true;
        else
            return false;
    }

}
//return s.matches("[0-9]");