public class Program4 {
    public static void main(String[] args) {
        String bankChecking = "Chase";
        double moneyChecking = 1220.22;
        int minAmount = 100;
        String cardNumber = "2134567301987564";

        String bankSavings = "U.S. Bank";
        double moneySavings = 1235112.12;
        int interest = 8;

        Checking myChecking = new Checking (bankChecking, moneyChecking, minAmount, cardNumber);
        Savings mySavings = new Savings(bankSavings, moneySavings, interest);

        myChecking.checkingAccount();
        mySavings.savingsAccount();
    }
}
