package EithKyu;

public class WellofIdeasEasyVersion {
    public static void main(String[] args) {
        String[] x = new String[] {"bad", "bad", "bad"};
        String[] q = new String[] {"good", "bad", "bad", "bad", "bad"};
        String[] w = new String[] {"good", "bad", "bad", "bad", "bad", "bad", "bad", "good"};

        System.out.println(well(x));
        System.out.println(well(q));
        System.out.println(well(w));

    }
    public static  String well(String[] x){
        int counterGoodIdea = 0;
        for(int i = 0; i < x.length;i++){
            if(x[i].equals("good"))
                counterGoodIdea++;
        }

        switch(counterGoodIdea){
            case 0: return "Fail! " + counterGoodIdea ;
            case 1|2:return "Publish! " + counterGoodIdea;
            default: {return "I smell a series! "  + counterGoodIdea;}
        }
    }

//    public static String well(String[] x) {
//        int count = 0;
//        for (String s : x) {
//            if (s.equals("good")) count++;
//            if (count > 2) return "I smell a series!";
//        }
//        if (count != 0) return "Publish!";
//        return "Fail!";
//    }
}
