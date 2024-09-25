public class Savings extends ACCOUNT {
    private int interestRate;
    public Savings(String bank, double money, int interestRate) {
        super(bank, money);
        this.interestRate = interestRate;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
    public void savingsAccount() {
        System.out.println("Savings Account");
        System.out.println("Bank: " + getBank());
        System.out.println("Amount of money: $" + getMoney());
        System.out.println("Interest Rate: " + getInterestRate() + "%");
        System.out.println();
    }
}
