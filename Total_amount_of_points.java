package EithKyu;

public class Total_amount_of_points {
    public static void main(String[] args) {
        String[] a = new String[]
                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
        System.out.println(points(a));
    }
    public static int points(String[] games) {
        int gameResult = 0;
        for (String tempString : games) {
            char[] tempChar = tempString.toCharArray();
            if ((int)tempChar[0]>(int)tempChar[2])              gameResult += 3;
            else if((int)tempChar[0]==(int)tempChar[2])         gameResult += 1;
        }
        return gameResult;
    }
}
