package Casino;

public class Player {
    private int balance;

    public Player(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void placeBet(int betAmount) {
        balance -= betAmount;
    }

    public void receiveWinnings(int winnings) {
        balance += winnings;
    }

    public boolean isBankrupt() {
        return balance <= 0;
    }

}
