package poker.round;

import java.util.List;

import javax.smartcardio.Card;

public class Discard {
    private List<Card> discard;

    public Discard(List<Card> discard){
        this.discard = discard;
    }

    public boolean isServed(){
        return discard == null;
    }
}
