package poker.table;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private int numberOfPlayers;
    private int MAXPLAYER = 9;
    private List<Player> playerList = new ArrayList<>();

    public int getNumberOfPlayers(){
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers){
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getMaxPlayer(){
        return MAXPLAYER;
    }

    public List<Player> getPlayerList(){
        return playerList;
    }

    public void setPlayerList(List<Player> playerList){
        this.playerList = playerList;
    }
}
