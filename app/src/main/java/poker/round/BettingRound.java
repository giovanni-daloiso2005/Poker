package poker.round;

import poker.table.Player;

public class BettingRound {

    private static final class Seat{
        private final Player player;
        private int committed;
        private boolean folded;
        private boolean allIn;
        private boolean acted;

    }
}
