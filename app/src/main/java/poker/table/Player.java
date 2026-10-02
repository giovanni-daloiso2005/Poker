package poker.table;

import poker.card.Deck;

public class Player {
    private String name;
    private int fiches;
    private int tablePosition;
    private Deck deck;

    public Player(String name, int fiches){
        this.name = name;
        this.fiches = fiches;
    }

    public Player(String name, int fiches, int tablePosition, Deck deck){
        this.name = name;
        this.fiches = fiches;
        this.tablePosition = tablePosition;
        this.deck = deck;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getFiches(){
        return fiches;
    }

    public void setFiches(int fiches){
        this.fiches = fiches;
    }

    public int getTablePosition(){
        return tablePosition;
    }

    public void setTablePosition(int tablePosition){
        this.tablePosition = tablePosition;
    }

    public Deck getPlayerDeck(){
        return deck;
    }

    public void setPlayerDeck(Deck deck){
        this.deck = deck;
    }
}
