package Casino;

public class Casino {
    private int balance;

    public Casino(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void acceptBet(int betAmount) {
        balance += betAmount;
    }

    public void payWinnings(int winnings) {
        balance -= winnings;
    }

    public boolean isBankrupt() {
        return balance <= 0;
    }
}
