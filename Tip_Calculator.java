package EithKyu;

public class Tip_Calculator {
    public static void main(String[] args) {
        System.out.println(calculateTip(107.65, "GReat"));
    }
    public static Integer calculateTip(double amount, String rating) {
        switch (rating.toLowerCase()) {
            case "excellent":
                return (int) Math.ceil((amount / 100) * 20);
            case "great":
                return (int) Math.ceil((amount / 100) * 15);
            case "good":
                return (int) Math.ceil((amount / 100) * 10);
            case "poor":
                return (int) Math.ceil((amount / 100) * 5);
            case "terrible":
                return 0;
            default:
                return null;
        }
    }
}
