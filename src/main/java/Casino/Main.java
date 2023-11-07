package Casino;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(1000);
        Casino casino = new Casino(10000);
        int playerBet = 150; // Сумма ставки игрока
        play(player, casino, playerBet);
        System.out.println("Final Player balance: " + player.getBalance());
        System.out.println("Final Casino balance: " + casino.getBalance());
    }

    public static void play(Player player, Casino casino,int playerBet) {
        int rounds = 0;
        while (!player.isBankrupt() && !casino.isBankrupt() && rounds < 100 && player.getBalance()>=playerBet&&casino.getBalance()>=playerBet) {
            player.placeBet(playerBet);
            int rouletteResult = Roulette.spin();
            if (rouletteResult % 2 == 0) {
                // Игрок выиграл если четное число
                int winnings = playerBet * 2;
                player.receiveWinnings(winnings);
                casino.payWinnings(winnings);
            } else {
                // Казино выиграло
                casino.acceptBet(playerBet);
            }
            System.out.println("Rounds: " + rounds + " Player balance: " + player.getBalance());
            System.out.println("Rounds: " + rounds + " Casino balance: " + casino.getBalance());
            rounds++;
        }
    }
}