package poker.round;

public enum Phase {
    DEAL(false),
    FIRST_BETTING(true),
    DRAW(false),
    SECOND_BETTING(true),
    SHOWDOWN(false);

    private final boolean betting;

    Phase(boolean betting){
        this.betting = betting;
    }

    public boolean isBetting(){
        return betting;
    }
}
