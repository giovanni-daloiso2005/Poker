package poker.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class Deck {
    private final List<Card> cards;

    private Deck(List<Card> cards){
        this.cards = cards;
    }

    private static Deck of(int lowestValue, Random random){
        List<Card> cards = new ArrayList<>();

        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                if(rank.getValue() >= lowestValue){
                    cards.add(new Card(rank, suit));
                }
            }
        }

        Collections.shuffle(cards, random);
        return new Deck(cards);
    }

    public static Deck texasDeck(Random random){
        return of(Rank.TWO.getValue(), random);
    }

    public static Deck italianDeck(int numberOfPlayers, Random random){
        if(numberOfPlayers < 2 || numberOfPlayers > 9){
            throw new IllegalArgumentException("Giocatori ammessi: 2-9, ricevuti: " + numberOfPlayers);
        }

        return of((11 - numberOfPlayers), random);
    }

    public Card draw(){
        if(cards.isEmpty()){
            throw new IllegalStateException("Mazzo vuoto");
        }

        return cards.remove(cards.size() - 1);
    }

    public int size(){
        return cards.size();
    }


}
