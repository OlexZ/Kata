package EithKyu;

import java.util.ArrayList;
import java.util.List;

public class You_only_need_one_Beginner {
    public static void main(String[] args) {


    }

    public static boolean check(Object[] a, Object x) {
        for (Object temp : a) {
            if (temp.equals(x))
                return true;
        }
        return false;


    }

}
