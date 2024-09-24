public class Main {
    public static void main(String[] args) {
        double balance = 5000;
        double interest;
        double INTEREST_RATE = 0.17;

        interest = balance * INTEREST_RATE;
        System.out.println("Interest after one month: " + interest);
        System.out.println("Interest after two months: " + interest*2);
    }
}