public class Checking extends ACCOUNT{
    private int minimumAmount;
    private String debitCard;
    public Checking(String bank, double money, int minimumAmount, String debitCard) {
        super(bank, money);
        this.minimumAmount = minimumAmount;
        this.debitCard = debitCard;
    }

    public int getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(int minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public String getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(String debitCard) {
        this.debitCard = debitCard;
    }
    public void checkingAccount() {
        System.out.println("Checking account:");
        System.out.println("Bank: " + getBank());
        System.out.println("Amount of money: $" + getMoney());
        System.out.println("Minimum amount: $" + getMinimumAmount());
        System.out.println("Debit card: " + getDebitCard());
        System.out.println();
    }
}
