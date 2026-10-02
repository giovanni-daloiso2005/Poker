package poker.round;

public enum Phase {
    ANTE(1, "ANTE"), DEAL(2, "DEAL"), FIRST_BETTING(3, "FIRST BETTING"),
    DRAW(4, "DRAW"), SECOND_BETTING(5, "SECOND BETTING"), SHOWDOWN(6, "SHOWDOWN");

    private int value;
    private String label;

    Phase(int value, String label){
        this.value = value;
        this.label = label;
    }

    public int getValue(){
        return value;
    }

    public String getLabel(){
        return label;
    }
}
