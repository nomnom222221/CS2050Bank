public abstract class ACCOUNT {
    private String bank;
    private double money;

    public ACCOUNT(String bank, double money){
        this.bank = bank;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}