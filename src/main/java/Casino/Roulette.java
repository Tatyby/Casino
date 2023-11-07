package Casino;

import java.util.Random;

public class Roulette {
    public static int spin() {
        Random random = new Random();
        return random.nextInt(37); // рулетка с 36 номерами и 0
    }
}
