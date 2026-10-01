package poker.card;

public enum Suit{
    CUORI("♥"), QUADRI("♦"), FIORI("♣"), PICCHE("♠");

    private final String symbol;
    
    Suit(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol(){
        return symbol;
    }
}

